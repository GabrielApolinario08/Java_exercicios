package ex05;

import java.util.UUID;

public class Habtat {

    private UUID id;
    private double area;
    private String localizacao;

    public Habtat() {
        setId();
        setArea(0);
        setLocalizacao("");
    }
    public Habtat(double area, String localizacao) {
        setId();
        setArea(area);
        setLocalizacao(localizacao);
    }

    public UUID getId() {
        return id;
    }

    private void setId() {
        this.id = UUID.randomUUID();
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Habtat\n\tÁrea: " + getArea() + "m²\n\tLocalização: " + getLocalizacao();
    }
}
