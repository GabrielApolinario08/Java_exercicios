package ex10;

// 10 - Considere um sistema de gerenciamento de mercadorias de uma loja. Implemente um programa
// que declare variáveis para representar os seguintes dados: número do pedido, código do produto,
// quantidade e valor total da compra. Inicialize essas variáveis com valores apropriados. Por fim,
// exiba os valores armazenados.

// Gabriel Apolinário Fabrício
public class GerenciadorDeMercadoria {
    public static void main(String[] args) {
        long numeroPedido = 1233212l;
        String codigoPedido = "123GAB23";
        short qtdProduto = 10;
        double valorTotalCompra = 1200.50;
        System.err.println("Número do seu pedido: " + numeroPedido + "\nCódigo do pedido: " + codigoPedido + "\nQuantidade: " + qtdProduto + "\nValor total da compra: R$" + valorTotalCompra);
    }
}
