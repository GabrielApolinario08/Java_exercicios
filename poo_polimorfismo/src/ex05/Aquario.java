package ex05;

public class Aquario extends Habtat {
    public Aquario() {
        super();
    }
    public Aquario(double area, String localizacao) {
        super(area, localizacao);
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tAquario";
    }
}
