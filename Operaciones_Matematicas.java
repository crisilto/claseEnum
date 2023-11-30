package uso_enum;

import java.util.Scanner;

// Interfaz para definir el método 'operar'
interface Operacion {
    double operar(double n1, double n2);
}

public class Operaciones_Matematicas {
    enum Operaciones implements Operacion {
        SUMA {
            public double operar(double n1, double n2) {
                return n1 + n2;
            }
        },
        RESTA {
            public double operar(double n1, double n2) {
                return n1 - n2;
            }
        },
        MULTIPLICACION {
            public double operar(double n1, double n2) {
                return n1 * n2;
            }
        },
        DIVISION {
            public double operar(double n1, double n2) {
                if (n2 != 0) {
                    return n1 / n2;
                } else {
                    System.out.println("Error: División por cero.");
                    return Double.NaN;
                }
            }
        };

        // Método de la interfaz 'Operacion'
        public abstract double operar(double n1, double n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos valores: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        System.out.println("Valores: " + n1 + " y " + n2);

        // Uso de los métodos 'operar'
        for (Operacion operacion : Operaciones.values()) {
            System.out.println(operacion + ": " + operacion.operar(n1, n2));
        }
    }
}
