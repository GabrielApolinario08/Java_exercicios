package ex03;

public class RelacaoCandidatoVaga {
    private boolean contratado;
    private Candidato candidato;
    private Vaga vaga;
    public RelacaoCandidatoVaga() {
        setCandidato(null);
        setContratado(false);
        setVaga(null);
    }

    public RelacaoCandidatoVaga(Candidato candidato, Vaga vaga, boolean contratado) {
        setContratado(contratado);
        setCandidato(candidato);
        setVaga(vaga);
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    @Override
    public String toString() {
        return (isContratado() ? "[CONTRATADO]" : "[EM ABERTO]") + "\nCandidato: " +
                getCandidato().toString() + "\nVaga: " + getVaga().toString();
    }
}
