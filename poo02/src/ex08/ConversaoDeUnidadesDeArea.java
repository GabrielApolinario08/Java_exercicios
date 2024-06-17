package ex08;

public class ConversaoDeUnidadesDeArea {
    private double metro;
    private double cm;
    private double pe;
    private double milha;
    private double acre;

    public ConversaoDeUnidadesDeArea() {
        metro = cm = pe = milha = acre = 0;
    }

    public double getMetro() {
        return metro;
    }

    public void setMetro(double metro) {
        this.metro = metro;
    }

    public double getCm() {
        return cm;
    }

    public void setCm(double cm) {
        this.cm = cm;
    }

    public double getPe() {
        return pe;
    }

    public void setPe(double pe) {
        this.pe = pe;
    }

    public double getMilha() {
        return milha;
    }

    public void setMilha(double milha) {
        this.milha = milha;
    }

    public double getAcre() {
        return acre;
    }

    public void setAcre(double acre) {
        this.acre = acre;
    }

    public double metroParaPes() {
        return getMetro() * 10.76;
    }

    public double pesParaCm() {
        return getPe() * 929;
    }

    public double milhasParaAcres() {
        return getMilha() * 640;
    }

    public double acresParaPes() {
        return getAcre() * 43560;
    }
}
