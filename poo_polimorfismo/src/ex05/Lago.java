package ex05;

public class Lago extends Habtat {
    public Lago() {
        super();
    }
    public Lago(double area, String localizacao) {
        super(area, localizacao);
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tLago";
    }
}
