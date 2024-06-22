package ex03;

public class Vaga {
    private String descricao;

    private double salarioOferecido;

    public Vaga() {
        setDescricao("");
        setSalarioOferecido(0);
    }
    public Vaga(String descricao, double salarioOferecido) {
       setDescricao(descricao);
       setSalarioOferecido(salarioOferecido);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSalarioOferecido() {
        return salarioOferecido;
    }

    public void setSalarioOferecido(double salarioOferecido) {
        this.salarioOferecido = salarioOferecido;
    }

    @Override
    public String toString() {
        return "Descrição: " + getDescricao() + " | Salário Oferecido: " + getSalarioOferecido() + " | ";
    }
}
