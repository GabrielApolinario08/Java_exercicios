/*27) Escreva um programa para ler um vetor AH de dimensão definida e com
        elementos fornecidos pelo usuário (>=25). Criar outro vetor AI (2 <= N <= 5)
        posições e gerar os elementos. Verificar se o vetor AI está contido no vetor AH. Caso
        não esteja contido dar mensagem de erro. Caso esteja, informar a posição inicial no
        vetor AH.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] AH, AI;
        int j = 0;
        System.out.println("Informe o tamanho do vetor AH: (>=25)");
        AH = new int[scanner.nextInt()];
        while (AH.length < 25) {
            System.out.println("Informe o tamanho do vetor AH: (>=25)");
            AH = new int[scanner.nextInt()];
        }
        for (int i = 0 ; i < AH.length ; i++) {
            System.out.println("Informe o valor do " + (i + 1) + "° elemento do vetor AH: ");
            AH[i] = scanner.nextInt();
        }

        System.out.println("Informe o tamanho do vetor AI: (2 <= N <= 5)");
        AI = new int[scanner.nextInt()];
        while (AI.length < 2 || AI.length > 5) {
            System.out.println("Informe o tamanho do vetor AH: (2 <= N <= 5)");
            AI = new int[scanner.nextInt()];
        }
        for (int i = 0 ; i < AI.length ; i++) {
            System.out.println("Informe o valor do " + (i + 1) + "° elemento do vetor AI: ");
            AI[i] = scanner.nextInt();
        }
        int contido = 0;
        for (int i = 0 ; i < AH.length ; i++ ) {
            if (AI[j] == AH[i]) {
                if (j == 0) {
                    contido = i;
                }
                j++;
                if (j == AI.length) {
                    break;
                }
            } else if (j != 0){
                j = 0;
            }
        }
        if (j == AI.length) {
            System.out.print("O vetor AI está contido a partir da posição " + contido + " do vetor AH.");
        } else {
            System.out.println("O vetor AI não está contido dentro do vetor AH.");
        }
    }
}
