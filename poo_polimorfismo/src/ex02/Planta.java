package ex02;

public class Planta {
    private String tipo;
    private String especie;

    public Planta() {
        this.tipo = "";
        this.especie = "";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    @Override
    public String toString() {
       return "\n\tTipo: " + getTipo() + "\n\tEspécie: " + getEspecie();
    }
}