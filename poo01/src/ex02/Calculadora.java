package ex02;

public class Calculadora {
    private int numero01;
    private int numero02;

    public Calculadora() {
        numero01 = 0;
        numero02 = 0;
    }

    public void setNumero01(int numero01) {
        this.numero01 = numero01;
    }

    public void setNumero02(int numero02) {
        this.numero02 = numero02;
    }

    public int getNumero01() {
        return numero01;
    }

    public int getNumero02() {
        return numero02;
    }

    public int soma() {
        return numero01 + numero02;
    }

    public int subtrair() {
        return numero01 - numero02;
    }

    public int multiplicar() {
        return numero01 * numero02;
    }

    public double dividir() {
        return (double) numero01 / numero02;
    }
}