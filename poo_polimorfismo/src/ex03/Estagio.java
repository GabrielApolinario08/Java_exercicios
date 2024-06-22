package ex03;

public class Estagio extends Vaga{
    private int tempo;

    public Estagio() {
        setTempo(0);
    }
    public Estagio(int tempo, String descricao, double salarioOferecido) {
        setTempo(tempo);
        setDescricao(descricao);
        setSalarioOferecido(salarioOferecido);
    }
    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return super.toString() + "Tempo de duração: " + getTempo();
    }
}
