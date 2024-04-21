//1) Escreva um programa para ler um vetor A de 15 posições e imprimir seus
//        elementos.

//Gabriel Apolinário Fabrício
public class Ex01 {
    public static void main(String[] args) {
        int[] A = new int[15];
        for (int i = 0; i < 15 ; i++) {
            A[i] = (1 + i);
        }
        for (int i = 0; i < 15 ; i++) {
            System.out.print(A[i] + " ");
        }
    }
}