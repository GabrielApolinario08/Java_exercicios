package ex02;

public class Flor extends Planta{
    private boolean cor;

    public Flor(String tipo, String especie, boolean cor) {
        setTipo(tipo);
        setEspecie(especie);
        setCor(cor);
    }

    public boolean isCor() {
        return cor;
    }

    public void setCor(boolean cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tCaracterística: " + (cor ? "Tem a cor das suas flores" : "Não tem a cor das suas flores");
    }
}
