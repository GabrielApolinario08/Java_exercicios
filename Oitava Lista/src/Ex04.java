/*4) Escreva um programa para ler um vetor D de N posições, onde N é menor
        ou igual a 20 e imprimir seus elementos. O usuário deve informar o número
        de posições e os elementos. O programa deve validar a quantidade de
        posições, não permitindo que o usuário forneça um valor inválido.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de posições do vetor, menor ou igual a 20: ");
        int N = scanner.nextInt();
        if (N > 20) {
            System.out.println("ERRO! informe um valor menor ou igual a 20.");
        } else  {
            int[] D = new int[N];
            int cont = 0;
            while (cont < D.length) {
                System.out.println("Informe o valor do " + (cont + 1) + "° elemento: ");
                D[cont] = scanner.nextInt();
                cont++;
            }
            for (int i : D) {
                System.out.print(i + " ");
            }
        }

    }
}