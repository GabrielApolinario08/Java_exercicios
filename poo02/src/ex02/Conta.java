package ex02;

public class Conta {
    private double valorConta;

    private int qtdPessoas;

    private boolean pagarTaxa;

    public Conta() {
        valorConta = 0;
        qtdPessoas = 0;
        pagarTaxa = false;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public double getValorConta() {
        return valorConta;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setPagarTaxa(boolean pagarTaxa) {
        this.pagarTaxa = pagarTaxa;
        if (this.pagarTaxa) {
            valorConta += ((double) 10 /100 * valorConta);
        }
    }

    public boolean getPagarTaxa() {
        return pagarTaxa;
    }

    public double valorContaIndividual() {
        return valorConta / qtdPessoas;
    }
}
