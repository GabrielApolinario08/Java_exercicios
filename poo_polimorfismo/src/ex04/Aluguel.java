package ex04;

public class Aluguel {
    private Cliente cliente;
    private Midia midia;
    private boolean pagamento;
    private double valorPagamento;

    public Aluguel() {
        setCliente(null);
        setMidia(null);
        setPagamento(false);
    }

    public Aluguel(Cliente cliente, Midia midia, boolean pagamento) {
        setCliente(cliente);
        setMidia(midia);
        setPagamento(pagamento);
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Aluguel \n\tCliente: " + getCliente() + "\n\tMídia: " + getMidia() + "\n\tAluguel Pago: " + (isPagamento() ? "Sim":"Não");
    }
}
