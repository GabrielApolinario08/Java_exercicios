package ex05;

public class Gaiola extends Habtat {
    public Gaiola() {
        super();
    }
    public Gaiola(double area, String localizacao) {
        super(area, localizacao);
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tGaiola";
    }
}
