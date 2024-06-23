package ex05;

public class Jaula extends Habtat {
    public Jaula() {
        super();
    }
    public Jaula(double area, String localizacao) {
        super(area, localizacao);
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tJaula";
    }
}
