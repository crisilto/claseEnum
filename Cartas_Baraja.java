package uso_enum;

public class Cartas_Baraja {
    enum Carta{
        SOTA, CABALLO, REY;
    }

    public static void main(String[] args) {
        for(Carta c : Carta.values()){
            System.out.println(c);
        }
    }
}
