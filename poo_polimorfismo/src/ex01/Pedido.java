package ex01;
public class Pedido {
    private Produtos[] produtos;

    public  Pedido() {
        produtos = new Produtos[100];
    }
    public double[] calculaValorPedido() {
        double[] valores = new double[4];
        for (int i = 0 ; i < produtos.length ; i++) {
            if (produtos[i] != null) {
                switch (produtos[i].getNome()) {
                    case "Frios" :
                        valores[0] += produtos[i].getPreco() * produtos[i].getQuantidade();
                        break;
                    case "Pão" :
                        valores[1] += produtos[i].getPreco() * produtos[i].getQuantidade();
                        break;
                    case "Doces" :
                        valores[2] += produtos[i].getPreco() * produtos[i].getQuantidade();
                        break;
                    default:
                        break;
                }
                valores[3] += produtos[i].getPreco() * produtos[i].getQuantidade();
            }
        }
        return valores;
    }

    public boolean adicionarPedido(Produtos produto, int i) {
        if (i <= 100) {
            produtos[i] = produto;
            return true;
        }
        return false;

    }

    public void listarPedidos() {
        for (int i = 0 ; i < produtos.length ; i++) {
            if (produtos[i] != null) {
                System.out.println("Nome: " + produtos[i].getNome());
                System.out.println("Preço: " + produtos[i].getPreco());
                System.out.println("Quantidade: " + produtos[i].getQuantidade());
            }

        }
    }
}
