package ex01;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.altura = 0;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void fazAniversario() {
        idade++;
    }
}
