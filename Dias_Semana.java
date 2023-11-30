package uso_enum;

public class Dias_Semana {
    enum Dias {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
    }

    public static void main(String[] args) {
        for (Dias dia : Dias.values()) {
            System.out.println(dia);
        }
    }
}
