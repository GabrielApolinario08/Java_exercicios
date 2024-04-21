/*20) Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 2, maior, menor;

        System.out.print("Informe o 1° valor: ");
        int valor = scanner.nextInt();

        menor = valor;
        maior = valor;
        while (cont <= 100) {
            System.out.printf("Informe o %d° valor: ", cont);
            valor = scanner.nextInt();

            if (menor > valor) {
                menor = valor;
            }
            if (maior < valor) {
                maior = valor;
            }
            cont++;
        }
        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Maior valor: %d", maior);
    }
}
