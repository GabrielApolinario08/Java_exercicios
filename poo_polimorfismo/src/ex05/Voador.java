package ex05;

public class Voador extends Animal {
    private String corPena;

    public Voador() {
        super();
        setCorPena("");
    }

    public Voador(String nome, String especie, Habtat habtat, String corPena) {
        super(nome, especie, habtat);
        setCorPena(corPena);
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tVoador\n\tCor da Pena: " + getCorPena();
    }

}
