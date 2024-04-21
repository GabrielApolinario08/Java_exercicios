/*2) Escreva um programa em Java para geral aleatoriamente os elementos
        (menor que 100) de uma matriz B de 6 linha por 3 colunas, imprimir a matriz
        gerada e imprimir a matriz em ordem invertida.*/

//Gabriel Apolinário Fabrício
public class Ex02 {
    public static void main(String[] args) {
        int[][] B = new int[6][3];
        System.out.println("Matriz B original: ");
        for (int l = 0; l < B.length ; l++) {
            for (int c = 0 ; c < B[l].length ; c++) {
                B[l][c] = (int)(Math.random() * 100);
                System.out.print(B[l][c] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz B em ordem invertida: ");
        for (int l = B.length - 1; l >= 0 ; l--) {
            for (int c = B[l].length - 1 ; c >= 0 ; c--) {
                System.out.print(B[l][c] + "\t");
            }
            System.out.println();
        }
    }
}