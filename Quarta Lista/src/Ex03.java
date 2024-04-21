/*3 - Crie um arquivo chamado VerificaValorProdutoRandom.java. Gere dois números aleatórios
entre 1 e 1000 (inclusos), atribuindo as variáveis precoProduto1 e precoProduto2. O programa deve
exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor.
Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato
deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser
exibida.*/

import java.util.Random;

//Gabriel Apolinário Fabrício
public class Ex03 {
    public static void main(String[] args) {
        Random num = new Random();
        int precoProduto1 = num.nextInt(1, 1000);
        int precoProduto2 = num.nextInt(1, 1000);
        System.out.println("Preço produto 1: " + precoProduto1);
        System.out.println("Preço produto 2: " + precoProduto2);
        System.out.println(precoProduto1 < precoProduto2 ? "O produto 1 é o mas barato." : precoProduto1 > precoProduto2 ?
                "O produto 2 é o mais barato." : "Os preços dos produtos são iguais.");
    }
}
