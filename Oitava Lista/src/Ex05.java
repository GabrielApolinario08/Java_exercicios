/*5) Escreva um programa para ler 2 vetores de dimensão n (n<=15) e calcular a soma
        entre eles gerando um terceiro vetor de mesma dimensão.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de posições dos vetores, menor ou igual a 15: ");
        int N = scanner.nextInt();
        if (N > 15) {
            System.out.println("ERRO! informe um valor menor ou igual a 15.");
        } else  {
            int[] vet01 = new int[N], vet02 = new int[N], vet03 = new int[N];

            int cont = 0;
            while (cont < vet01.length) {
                System.out.println("Informe o valor do " + (cont + 1) + "° elemento do primeiro vetor: ");
                vet01[cont] = scanner.nextInt();

                System.out.println("Informe o valor do " + (cont + 1) + "° elemento do segundo vetor: ");
                vet02[cont] = scanner.nextInt();
                cont++;
            }
            for (int i = 0 ; i < N ; i++) {
                vet03[i] = (vet01[i] + vet02[i]);
            }

            System.out.println("Soma dos dois vetores: ");
            for (int j : vet03) {
                System.out.print(j + " ");
            }
        }
    }
}