/*39) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
        o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
        positivo imprimir a sequência de termos: 1/50 + 2/49, 3/48 + ... + 50/1. Exemplo com entrada de 50
        termos. Apresentar a soma desta sequência no final.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int termos = scanner.nextInt();
        int i = 1;
        double soma = 0;
        while (true) {
            if (termos < 0) {
                System.out.println("Digite outro número maior que zero: ");
                termos = scanner.nextInt();
            } else if (termos == 0) {
                System.out.println("Programa finalizado!");
                break;
            } else {
                /*System.out.println("--" + termos + "--");*/
                soma += (double) i / termos;
                System.out.printf("%.2f + ",  (double) i / termos);

                termos--;
                i++;
                if (termos == 0) {
                    System.out.print("FIM!!");
                    System.out.printf("\n\tA soma de todos os números imprimidos é de %.1f", soma);
                    break;
                }
            }
        }
    }
}
