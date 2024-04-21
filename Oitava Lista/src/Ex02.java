/*2) Escreva um programa para ler um vetor B de 15 posições e imprimir em
        ordem invertida.*/

//Gabriel Apolinário Fabrício
public class Ex02 {
    public static void main(String[] args) {
        int[] B = new int[15];
        for (int i = 14; i >= 0; i--) {
            B[i] = (1 + i);
        }

        for (int i = 14; i >= 0; i--) {
            System.out.print(B[i] + " ");
        }

    }
}