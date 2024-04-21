/*4 - Crie um arquivo chamado VerificaValorProduto.java. Solicite ao usuário que digite os valores
para as variáveis precoProduto1 e precoProduto2. O programa deve testar o valor digitado pelo
usuário, para as duas variáveis e caso não estejam na faixa de 1 até 1000 (inclusos), exibir a
mensagem VALOR INVALIDO e finalizer o programa. Caso os valores digitados sejam válidos,
exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor.
Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato
deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser
exibida.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto 1: ");
        double precoProduto1 = scanner.nextDouble();
        System.out.println("Digite o valor do produto 2:");
        double precoProduto2 = scanner.nextDouble();
        scanner.close();

        System.out.println(precoProduto1 < 1 || precoProduto1 > 1000 || precoProduto2 < 1 || precoProduto2 > 1000 ? "VALOR INVALIDO!" :
                precoProduto1 < precoProduto2 ? "O produto 1 é o mais barato." : precoProduto2 < precoProduto1 ? "O produto 2 é o mais barato." :
                "Os preços dos dois produtos são iguis.");
    }
}
