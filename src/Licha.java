abstract class Personajes {
    abstract int muerte();
    void mostrarMuerte(){
        System.out.println("Se murio ");
    }

}

class zombie extends Personajes{
    private double vida;

    public zombie(double vida){
        this.vida=vida;

    }

    @Override
    int muerte() {
        return -10;
    }

    @Override
    void mostrarMuerte() {
        super.mostrarMuerte();
    }
}

public class Licha extends Personajes{
    private String capacidad;

    public Licha(String capacidad){
        this.capacidad=capacidad;
    }

    void setCapacidad(){
        capacidad= "estoy pendeja";
    }

    @Override
    int muerte() {
        return 0;
    }

    @Override
    void mostrarMuerte() {
        super.mostrarMuerte();

        setCapacidad();

    }
}