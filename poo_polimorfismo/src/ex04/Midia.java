package ex04;

import java.util.ArrayList;

public class Midia {
    private int codigo;
    private String descricao;
    private String tipo;
    private String genero;
    private double valorAluguel;

    public Midia() {
        setCodigo(null);
        setDescricao("descrição");
        setTipo("tipo");
        setGenero("genero");
        setValorAluguel(0);
    }
    public Midia(ArrayList<Midia> midias, String descricao, String tipo, String genero, double valorAluguel) {
        setCodigo(null);
        setDescricao(descricao);
        setTipo(tipo);
        setGenero(genero);
        setValorAluguel(valorAluguel);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(ArrayList<Midia> midias) {
        if (midias == null) {
            this.codigo = 1;
        } else {
            this.codigo = (midias.size() + 1);
        }

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    @Override
    public String toString() {
        return "Midia:" +
                "\tCodigo: " + codigo +
                "\tDescricao: " + descricao +
                "\tTipo: " + tipo +
                "\tGenero: " + genero +
                "\tValor do Aluguel: " + valorAluguel;
    }
}
