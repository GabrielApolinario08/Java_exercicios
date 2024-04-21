/*28) Melhore o exercício anterior, implementando a possibilidade de ocorrer
        mais de uma vez o vetor AI dentro do vetor AH. Mostre todas as ocorrências
        com as devidas posições iniciais.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] AH, AI;
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

        boolean contido = false;

        for (int i = 0; i <= AH.length - AI.length; i++) {
            boolean encontrou = true;
            for (int j = 0; j < AI.length; j++) {
                if (AH[i + j] != AI[j]) {
                    encontrou = false;
                    break;
                }
            }
            if (encontrou) {
                contido = true;
                System.out.println("O vetor AI está contido no vetor AH a partir da posição " + i + ".");
            }
        }

        if (!contido) {
            System.out.println("O vetor AI não está contido no vetor AH.");
        }


    }
}
