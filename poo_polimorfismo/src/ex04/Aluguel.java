package ex04;

import java.util.ArrayList;

public class Aluguel {
    private Cliente cliente;
    private Midia midia;
    private boolean pagamento;
    private int codigo;

    public Aluguel() {
        setCliente(null);
        setMidia(null);
        setPagamento(false);
        setCodigo(null);
    }

    public Aluguel(ArrayList<Aluguel> alugueis, Cliente cliente, Midia midia, boolean pagamento) {
        setCodigo(alugueis);
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(ArrayList<Aluguel> alugueis) {
        if (alugueis == null) {
            this.codigo = 1;
        } else {
            this.codigo = alugueis.size() + 1;
        }

    }

    @Override
    public String toString() {
        return "Aluguel \n\tCódigo do ALuguel: " + getCodigo() + "\n\t" + getCliente() + "\n\t" + getMidia() + "\n\tAluguel Pago: " + (isPagamento() ? "Sim":"Não");
    }
}
