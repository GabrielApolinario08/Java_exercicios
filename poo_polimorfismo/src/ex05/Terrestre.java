package ex05;

public class Terrestre  extends Animal {
    private int qtdPatas;
    public Terrestre() {
        super();
        setQtdPatas(0);
    }

    public Terrestre(String nome, String especie, Habtat habtat, int qtdPatas) {
        super(nome, especie, habtat);
        setQtdPatas(0);
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tTerreste\n\tQuantidade de Patas: " + getQtdPatas();
    }
}
