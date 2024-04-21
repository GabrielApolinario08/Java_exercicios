/*9) Escreva um programa para ler 5 elementos do vetor G de inteiros. Criar e imprimir
        um novo vetor H, tal que, este seja formado pelos elementos pares do vetor G lido.
        Supor que o vetor poderá não ter nenhum elemento com esta propriedade e neste
        caso, mostrar uma mensagem e encerrar o programa.*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] G = new int[5], H;
        int j = 0, qtdPar = 0;
        boolean temPar = false;
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("Digite a " + (i + 1) + "° posição do vetor: ");
            G[i] = scanner.nextInt();
            if (G[i] % 2 == 0) {
                qtdPar++;
            }
        }
        H = new int[qtdPar];
        for (int valor : G) {
            if (valor % 2 == 0) {
                H[j] = valor;
                j++;
                temPar = true;
            }
        }

        if (temPar) {
            System.out.println("Vetor H com os elementos pares de G: ");
            for (int valor : H) {
                System.out.print(valor + " ");
            }
        } else {
            System.out.println("Nenhum valor par informado!");
        }
    }
}