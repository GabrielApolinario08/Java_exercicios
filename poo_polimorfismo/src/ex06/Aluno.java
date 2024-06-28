package ex06;

public class Aluno extends Pessoa{
    private String curso;
    private double mensalidade;

    public Aluno() {
        super("", 0);
        setCurso("");
        setMensalidade(0);
    }
    public Aluno(String nome, int idade, String curso, double mensalidade) {
        super(nome, idade);
        setCurso(curso);
        setMensalidade(mensalidade);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncurso='" + curso + '\'' +
                ", mensalidade=" + mensalidade +
                '}';
    }
}
