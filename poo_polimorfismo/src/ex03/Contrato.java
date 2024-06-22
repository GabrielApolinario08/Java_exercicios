package ex03;

public class Contrato extends Vaga{
    private boolean temporario;

    public Contrato() {
        setTemporario(false);
    }
    public Contrato(boolean temporario, String descricao, double salarioOfereido) {
        setTemporario(temporario);
        setDescricao(descricao);
        setSalarioOferecido(salarioOfereido);
    }

    public boolean isTemporario() {
        return temporario;
    }

    public void setTemporario(boolean temporario) {
        this.temporario = temporario;
    }

    @Override
    public String toString() {
        return super.toString() + "Temporário: " + (isTemporario() ? "Sim" : "Não");
    }
}
