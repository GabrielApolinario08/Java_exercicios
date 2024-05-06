package ex01;

public class Lampada {
    private String marca;
    private String modelo;
    private String tipo;
    private boolean acesa;

    public Lampada() {
        marca = "";
        modelo = "";
        tipo = "";
        acesa = false;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isAcesa() {
        return acesa;
    }

    public void ligar() {
        acesa = true;
    }

    public void desligar() {
        acesa = false;
    }
}
