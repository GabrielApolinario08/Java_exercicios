/*14) Escreva um programa para ler um vetor de inteiros S de 10 elementos e
        imprimir o vetor lido. Ler outro vetor de inteiros T de 15 elementos e
        imprimir este vetor lido. Construir outro vetor U com todos os elementos
        lidos de S e de T e imprimir este vetor obtido. (Intercalação)*/

//Gabriel Apolinário Fabrício
public class Ex14 {
    public static void main(String[] args) {
        int[] S = new int[10], T = new int[15], U = new int[25];
        int j = 0;
        for (int i = 0 ; i < 10 ; i++) {
            S[i] = (int)(Math.random() * 50);
        }
        for (int i = 0 ; i < 15 ; i++) {
            T[i] = (int)(Math.random() * 50);
        }
        for (int i = 0 ; i < U.length ; i++) {
            if (j < 10) {
                U[i] = S[j];
                i++;
            }
            U[i] = T[j];
            j++;
        }

        printVetor(S, 'S');
        printVetor(T, 'T');
        printVetor(U, 'U');

    }
    public static void printVetor(int[] vetor, char name) {
        System.out.print("Valores do vetor " + name + ": ");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
