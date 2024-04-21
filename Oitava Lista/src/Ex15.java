/*15) Escreva um programa para ler um vetor de inteiros S de N elementos (N<=10) e
        imprimir o vetor lido. Ler outro vetor de inteiros T de M elementos (M<=15) e imprimir
        este vetor lido. Construir outro vetor U com todos os elementos lidos de S e de T e
        imprimir este vetor obtido. (Intercalação)*/

//Gabriel Apolinário Fabrício
public class Ex15 {
    public static void main(String[] args) {
        int N = (int)(Math.random() * 10), M = (int)(Math.random() * 15), j = 0;
        int[] S = new int[N], T = new int[M], U = new int[N + M], menor, maior;
        for (int i = 0 ; i < N ; i++) {
            S[i] = (int)(Math.random() * 50);
        }
        for (int i = 0 ; i < M ; i++) {
            T[i] = (int)(Math.random() * 50);
        }   
        menor = S.length < T.length || S.length == T.length ? S : T;
        maior = T.length > S.length || T.length == S.length ? T : S;

        for (int i = 0 ; i < U.length ; i++) {
            if (j < menor.length) {
                U[i] = menor[j];
                i++;
            }

            U[i] = maior[j];
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
