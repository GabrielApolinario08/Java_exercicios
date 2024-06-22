package ex03;

public class Candidato {
    private String nome;
    private int idade;

    public Candidato() {
        setNome("");
        setIdade(0);
    }

    public Candidato(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " | Idade: " + getIdade() + " | ";
    }
}
