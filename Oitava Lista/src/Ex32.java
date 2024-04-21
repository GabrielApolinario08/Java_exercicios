/*32) Escreva um programa para solicitar a entrada de um valor String
        (frases). Calcular a quantidade de palavras desta frase. Criar um vetor de
        String AN de dimensão N, sendo N a quantidade de palavras da frase.
        Colocar uma palavra em cada posição do vetor AN. Imprimir o vetor AN
        original. Ordenar o vetor de String AN de forma crescente. Imprimir o vetor
        AN ordenado.
        Ex:
        Frase: “joseverson perdeu o cavalo”
        Quantidade de palavras: 4
        Vetor AN [ “joseverson”, “perdeu”, “o”, “cavalo” ]
        (vetor original - 4 elementos)
        Vetor AN [ “cavalo”, “joseverson”, “o”, “perdeu” ]
        (vetor ordenado - 4 elementos)*/


import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frases;
        int N = 0, j = 0;
        String[] AN, palavras;
        System.out.println("Digite uma frase: ");
        frases = scanner.nextLine();
        palavras = frases.split(" ");
        for (int i = 1 ; i < frases.length() - 1 ; i++) {
            if (frases.charAt(i) == ' ' && frases.charAt(i + 1) != ' ') {
                N++;
            }
        }
        if (frases.charAt(0) != ' ') {
            N++;
        }
        AN = new String[N];
        for (int i = 0 ; i < palavras.length ; i++) {
            if (palavras[i] != " " && palavras[i] != "") {
                AN[j] = palavras[i];
                j++;
            }
        }
        System.out.println("Quantidade de palavras: " + N);
        System.out.println("Vetor AN original: " + Arrays.toString(AN));
        Arrays.sort(AN);
        System.out.println("Vetor AN ordenado: " + Arrays.toString(AN));
    }
}
