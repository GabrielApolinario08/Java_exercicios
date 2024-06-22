package ex03;

public class Empregado extends Candidato{

    private String nomeEmpresa;

    public Empregado() {
        setNomeEmpresa("");
    }
    public Empregado(String nome, int idade, String nomeEmpresa) {
        setNome(nome);
        setIdade(idade);
        setNomeEmpresa(nomeEmpresa);
    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public String toString() {
        return super.toString() + "Nome da Empresa do Candidato: " + getNomeEmpresa();
    }
}
