/*12) Desenvolva um programa em Java que receba o preço de um produto e seu código de
origem e mostre o preço do produto junto de sua procedência, o valor calculado do frete e o
valor final a ser pago pelo produto, conforme tabela a seguir:*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Código de Origem     Região de Procedência     Frete");
        System.out.println("      1                     Norte               10%");
        System.out.println("   2, 5, 9                  Sul                 3%");
        System.out.println("3, 10 até 15                Leste               1,2%");
        System.out.println("    7 ou 20                 Oeste               7,3%");
        System.out.println(" Qualquer outro             Importado           22,2%");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.println("Informe o código de origem do produto: ");
        int codigo = scanner.nextInt();
        scanner.close();

        double frete;
        switch (codigo) {
            case 1:
                frete = (double) 10 / 100 * preco;
                System.out.printf("Preço do produto: R$%.2f\nProcêdencia: Norte\nValor do frete: R$%.2f\nValor final: R$%.2f", preco, frete,
                        frete + preco);
                break;

            case 2, 5, 9:
                frete = (double) 3 / 100 * preco;
                System.out.printf("Preço do produto: R$%.2f\nProcêdencia: Sul\nValor do frete: R$%.2f\nValor final: R$%.2f", preco, frete,
                        frete + preco);
                break;

            case 3, 10, 11, 12, 13, 14, 15:
                frete = 1.2 / 100 * preco;
                System.out.printf("Preço do produto: R$%.2f\nProcêdencia: Leste\nValor do frete: R$%.2f\nValor final: R$%.2f", preco, frete,
                        frete + preco);
                break;

            case 7, 20:
                frete = 7.3 / 100 * preco;
                System.out.printf("Preço do produto: R$%.2f\nProcêdencia: Oeste\nValor do frete: R$%.2f\nValor final: R$%.2f", preco, frete,
                        frete + preco);
                break;

            default:
                frete = 22.2 / 100 * preco;
                System.out.printf("Preço do produto: R$%.2f\nProcêdencia: Importado\nValor do frete: R$%.2f\nValor final: R$%.2f", preco, frete,
                        frete + preco);
                break;
        }

    }
}
