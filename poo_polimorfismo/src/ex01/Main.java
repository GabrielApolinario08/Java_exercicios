package ex01;

/*
1) Crie um sistema de vendas de produtos, onde cada pedido poderá ter no máximo
        100 itens. O pedido deverá ser capaz de receber vários tipos produtos (superclasse),
        como frios, pães, doces, etc (subclasses). Ao final da entrada dos produtos o pedido
        deverá ter um método que calcule o valor total do pedido, onde ele varrerá o vetor de
        produtos somando seus valores. Desafio: implementar a quantidade de produtos vezes
        seu valor, no cálculo do valor do pedido. Implemente as classes para do modelo
        abaixo:
*/


//Gabriel Apolinário Fabrício
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();
        int opc, cont = 0, qtd;
        double preco;
        do {
            System.out.println("[1] Frios");
            System.out.println("[2] Paes");
            System.out.println("[3] Doces");
            System.out.println("[4] listar pedidos");
            System.out.println("[5] Calcular total");
            System.out.println("[6] Sair");
            System.out.print("Sua escolha: ");
            opc = scanner.nextInt();
            cont++;
            switch (opc) {
                case 1:
                    System.out.println("Preço dos frios: ");
                    preco = scanner.nextDouble();
                    System.out.println("Quantidade de frios: ");
                    qtd = scanner.nextInt();
                    Frios frios = new Frios(preco, qtd);
                    if (!pedido.adicionarPedido(frios, cont)) {
                        System.out.println("Já foram inseridos 100 pedidos!");
                    }

                    break;
                case 2:
                    System.out.println("Preço do pão: ");
                    preco = scanner.nextDouble();
                    System.out.println("Quantidade de pães: ");
                    qtd = scanner.nextInt();
                    Paozinho paozinho = new Paozinho(preco, qtd);
                    if (!pedido.adicionarPedido(paozinho, cont)) {
                        System.out.println("Já foram inseridos 100 pedidos!");
                    }
                    break;
                case 3:
                    System.out.println("Preço do doce: ");
                    preco = scanner.nextDouble();
                    System.out.println("Quantidade de doces: ");
                    qtd = scanner.nextInt();
                    Doces doces = new Doces(preco, qtd);
                    if (!pedido.adicionarPedido(doces, cont)) {
                        System.out.println("Já foram inseridos 100 pedidos!");
                    };
                    break;

                case 4:
                    pedido.listarPedidos();
                    break;

                case 5:
                    System.out.println("Valor frios: R$" + pedido.calculaValorPedido()[0]);
                    System.out.println("Valor pães: R$" + pedido.calculaValorPedido()[1]);
                    System.out.println("Valor doces: R$" + pedido.calculaValorPedido()[2]);
                    System.out.println("Valor total: R$" + pedido.calculaValorPedido()[3]);
                    break;

                case 6:
                    break;
                default:
            }

        } while (opc != 6);


    }

}
