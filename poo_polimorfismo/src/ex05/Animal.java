package ex05;

import java.util.UUID;

public class Animal {

    private UUID id;
    private String nome;
    private String especie;

    private Habtat habtat;

    public  Animal() {
        setId();
        setNome("");
        setEspecie("");
        setHabtat(null);
    }

    public  Animal(String nome, String especie, Habtat habtat) {
        setId();
        setNome(nome);
        setEspecie(especie);
        setHabtat(habtat);
    }

    public UUID getId() {
        return id;
    }

    private void setId() {
        this.id = UUID.randomUUID();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Habtat getHabtat() {
        return habtat;
    }

    public void setHabtat(Habtat habtat) {
        this.habtat = habtat;
    }

    @Override
    public String toString() {
        return "Animal\n\tNome: " + getNome() + "\n\tEspecie: " + getEspecie();
    }
}
