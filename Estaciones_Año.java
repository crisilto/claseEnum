package uso_enum;

import java.util.Scanner;

public class Estaciones_Año {
    enum Estaciones {
        PRIMAVERA, VERANO, OTOÑO, INVIERNO;

        public static Estaciones establecerMes(String mes) {
            switch (mes) {
                case "marzo":
                case "abril":
                case "mayo":
                    return PRIMAVERA;
                case "junio":
                case "julio":
                case "agosto":
                    return VERANO;
                case "septiembre":
                case "octubre":
                case "noviembre":
                    return OTOÑO;
                case "diciembre":
                case "enero":
                case "febrero":
                    return INVIERNO;
                default:
                    throw new IllegalArgumentException("Mes no válido: " + mes);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un mes: ");
        String mes = sc.nextLine().toLowerCase();

        try {
            Estaciones estacion = Estaciones.establecerMes(mes);
            System.out.println("El mes " + capitalizarPrimeraLetra(mes) + " pertenece a la estación de " + capitalizarPrimeraLetra(estacion.toString()));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para capitalizar la primera letra de una cadena
    private static String capitalizarPrimeraLetra(String cadena) {
        return cadena.substring(0, 1).toUpperCase() + cadena.substring(1).toLowerCase();
    }
}
