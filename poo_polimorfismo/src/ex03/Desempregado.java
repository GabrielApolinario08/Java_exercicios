package ex03;

public class Desempregado extends Candidato{
    private int tempoDesempregado;

    public Desempregado() {
        setTempoDesempregado(0);
    }

    public Desempregado(String nome, int idade, int tempoDesempregado) {
        setNome(nome);
        setIdade(idade);
        setTempoDesempregado(tempoDesempregado);
    }

    public int getTempoDesempregado() {
        return tempoDesempregado;
    }

    public void setTempoDesempregado(int tempoDesempregado) {
        this.tempoDesempregado = tempoDesempregado;
    }

    @Override
    public String toString() {
        return super.toString() + "Tempo Desempregado: " + getTempoDesempregado();
    }
}
