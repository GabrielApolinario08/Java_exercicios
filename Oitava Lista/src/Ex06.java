/*6) Escreva um programa para ler 2 vetores de dimensão n (n<=15) e
        comparar os elementos do primeiro vetor com o segundo e informar a
        posição em que os elementos são iguais.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de posições dos vetores, menor ou igual a 15: ");
        int N = scanner.nextInt();
        if (N > 15) {
            System.out.println("ERRO! informe um valor menor ou igual a 15.");
        } else  {
            int[] vet01 = new int[N], vet02 = new int[N];

            int cont = 0;
            while (cont < vet01.length) {
                System.out.println("Informe o valor do " + (cont + 1) + "° elemento do primeiro vetor: ");
                vet01[cont] = scanner.nextInt();

                System.out.println("Informe o valor do " + (cont + 1) + "° elemento do segundo vetor: ");
                vet02[cont] = scanner.nextInt();
                cont++;
            }

            System.out.println("Posições em que os valores são iguais entre os dois vetores: ");
            for (int i = 0 ; i < N ; i++) {
                if (vet01[i] == vet02[i]) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}