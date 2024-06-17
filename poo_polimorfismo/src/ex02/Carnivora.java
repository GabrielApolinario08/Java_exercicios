package ex02;

public class Carnivora extends Planta{
    private boolean venenosa;
    public Carnivora(String tipo, String especie, boolean venenosa) {
        setTipo(tipo);
        setEspecie(especie);
        setVenenosa(venenosa);
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tCaracterística: " + (venenosa ? "Venenosa" : "Não Venenosa");

    }
}
