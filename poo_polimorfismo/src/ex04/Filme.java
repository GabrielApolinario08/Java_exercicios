package ex04;

import java.util.ArrayList;

public class Filme extends Midia{
    private String classificacao;
    private int duracaoMinutos;

    public Filme() {
        super(null, "descrição", "tipo", "genero", 0);
        setClassificacao("classificação");
        setDuracaoMinutos(11);
    }
    public Filme(ArrayList<Midia> midias, String descricao, String tipo, String genero, double valorAluguel, String classificacao, int duracaoMinutos) {
        super(midias, descricao, tipo, genero, valorAluguel);
        setClassificacao(classificacao);
        setDuracaoMinutos(duracaoMinutos);
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        if (classificacao.trim().isEmpty()) throw new IllegalArgumentException("Classificação não pode ser vazia.");
        this.classificacao = classificacao;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos > 10) {
            this.duracaoMinutos = duracaoMinutos;
        } else {
            throw new IllegalArgumentException("Filme deve ter mais de 10 minutos.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tClassificação: " + getClassificacao() +
                "\tDuração em Minutos: " + getDuracaoMinutos();
    }
}
