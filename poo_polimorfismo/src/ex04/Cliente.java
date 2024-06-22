package ex04;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private int idade;

    public Cliente() {
        setCodigo(null);
        setNome("nome");
        setIdade(18);
    }

    public Cliente(ArrayList<Cliente> clientes, String nome, int idade) {
        setCodigo(clientes);
        setNome(nome);
        setIdade(idade);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(ArrayList<Cliente> clientes) {
        this.codigo = (clientes.size() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) throw new IllegalArgumentException("Nome não pode ser vazio!");
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 18) throw new IllegalArgumentException("Cliente deve ter mais de 18 anos.");
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente \n\tNome: " + getNome() + "\n\tIdade: " + getIdade() + "\n\tCódigo do CLiente: " + getCodigo();

    }

}
