package uso_enum;

import java.util.Scanner;

public class Uso_Tallas {
    enum Talla {
        MINI("S"), MEDIANA("M"), GRANDE("L"), MUY_GRANDE("XL");
        private String abreviatura;
        private Talla(String abreviatura){
            this.abreviatura = abreviatura;
        }
        public String getAbreviatura(){
            return abreviatura;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANA, GRANDE, MUY_GRANDE");
        String entradaDatos = sc.next().toUpperCase();
        Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
        System.out.println("Talla= "+laTalla);
        System.out.println("Abreviatura= "+laTalla.getAbreviatura());
    }
}
