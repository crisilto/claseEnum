package uso_enum;

public class Usuario {
    enum Experiencia{
        PRINCIPIANTE, INTERMEDIO, AVANZADO;
    }
    private Experiencia nivelExperiencia;

    public Usuario(Experiencia nivelExperiencia){
        this.nivelExperiencia = nivelExperiencia;
    }

    public Experiencia getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(Experiencia nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public void imprimirNivelExperiencia(){
        System.out.println("Nivel experiencia: "+nivelExperiencia);
    }

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(Experiencia.PRINCIPIANTE);
        usuario1.imprimirNivelExperiencia();

        usuario1.setNivelExperiencia(Experiencia.AVANZADO);
        usuario1.imprimirNivelExperiencia();
    }
}
