package ex05;

public class Viveiro extends Habtat {
    public Viveiro() {
        super();
    }
    public Viveiro(double area, String localizacao) {
        super(area, localizacao);
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tViveiro";
    }
}
