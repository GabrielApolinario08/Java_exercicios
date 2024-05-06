package ex05;

public class Equacao2Grau {
    private double a, b, c, delta;
    public Equacao2Grau() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.delta = 0;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    private void calculaDelta() {
        this.delta = Math.pow(this.b, 2) - (4 * this.a * this.c);
        System.out.println("Delta: " + this.delta);
    }

    public void calcularRaizes() {
        if (this.a == 0) {
            System.out.println("Não é uma equação do segundo grau!");
            return;
        }
        calculaDelta();
        if (this.delta == 0) {
            double x = -this.b / 2 * this.a;
            System.out.println("A equação tem apenas uma solução real: " + x);
        } else if(this.delta > 0) {
            double x1 = (-this.b + Math.sqrt(this.delta)) / 2 * this.a;
            double x2 = (-this.b - Math.sqrt(this.delta)) / 2 * this.a;
            System.out.println("A equação tem 2 soluções reais: " + x1 + " e " + x2);
        } else {
            System.out.println("A equação não possui solução real!");
        }
    }
}
