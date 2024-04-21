/*18) Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa em
        Java que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o
        valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número total de mercadorias em estoque: ");
        int totalMercadorias = scanner.nextInt();

        int cont = 1;
        double valorMercadoria, valorTotal = 0;
        while (cont <= totalMercadorias) {
            System.out.printf("Informe o valor da %d° mercadoria: R$", cont);
            valorMercadoria = scanner.nextDouble();
            valorTotal += valorMercadoria;
            cont++;
        }
        System.out.printf("Valor total em estoque: R$%.2f\nMédia do valor das mercadorias: R$%.2f", valorTotal, valorTotal / totalMercadorias);
    }
}
