/* 57) Solicite ao usuário a quantidade de termos da sequência de números perfeitos e
        imprima o resultado. (Atenção! Este processamento pode demorar MUITO) */

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 1, termos, numPerfeito = 0;
        long soma = 0;
        System.out.println("Digite a quantidade de termos da sequência de números perfeitos:");
        termos = scanner.nextInt();
        while (numPerfeito < termos) {
            for (int i = 1 ; i < cont ; i++) {
                if (cont % i == 0) {
                    soma += i;
                }
            }
            if (soma == cont) {
                System.out.printf("%d - ", cont);
                numPerfeito++;
            }
            soma = 0;
            cont++;
        }
        System.out.print("FIM!");
    }
}
