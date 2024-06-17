package ex02;

public class Arvore extends Planta{
    private  boolean frutifera;
    public Arvore(String tipo, String especie, boolean frutifera) {
        setTipo(tipo);
        setEspecie(especie);
        setFrutifera(frutifera);
    }

    public boolean isFrutifera() {
        return frutifera;
    }

    public void setFrutifera(boolean frutifera) {
        this.frutifera = frutifera;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tCaracterística: " + (frutifera ? "Frutifera" : "Não Frutifera");
    }
}
