package ex03;

public class Lampada {
    private String estado;

    public Lampada() {
        estado = "";
    }

    public void acender() {
        estado = "Acesa";
    }

    public void apagar() {
        estado = "Apagada";
    }

    public void meiaLuz() {
        estado = "Meia-luz";
    }

    public String getEstado() {
        return estado;
    }
}
