package ex06;

public class Sala {
    private String nome;
    private Pessoa[] pessoa;

    public Sala() {
        setNome("");
        this.pessoa = new Pessoa[0];
    }
    public Sala(int qtdPessoas) {
        this.pessoa = new Pessoa[qtdPessoas];
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPessoa(Pessoa pessoa) {
        for (int i = 0 ; i < this.pessoa.length ; i++) {
            if (this.pessoa[i] == null) {
                this.pessoa[i] = pessoa;
                return;
            }
        }
    }

    public Pessoa[] getPessoa() {
        return this.pessoa;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }
}
