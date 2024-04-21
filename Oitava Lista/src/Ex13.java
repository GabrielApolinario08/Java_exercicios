/*13) Escreva um programa para ler um vetor de inteiros P de N elementos (N<=10) e
        imprimir o vetor lido. Ler outro vetor de inteiros Q de M elementos (M<=15) e imprimir
        este vetor lido. Construir outro vetor R com todos os elementos lidos de P e de Q e
        imprimir este vetor obtido. (Concatenação)*/

//Gabriel Apolinário Fabrício
public class Ex13 {
    public static void main(String[] args) {
        int tamanhoP = (int)(Math.random() * 10);
        int[] P = new int[tamanhoP], Q, R;

        int tamanhoQ = (int)(Math.random() * 15);
        Q = new int[tamanhoQ];

        for (int i = 0; i < P.length ; i++) {
            P[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < Q.length ; i++) {
            Q[i] = (int)(Math.random() * 100);
        }
        R = new int[tamanhoP + tamanhoQ];
        for (int i = 0 ; i < P.length ; i++) {
            R[i] = P[i];
        }
        for (int i = 0 ; i < Q.length ; i++) {
            R[i + tamanhoP] = Q[i];
        }

        printVetor(P, 'P');
        printVetor(Q, 'Q');
        printVetor(R, 'R');
    }
    public static void printVetor(int[] vetor, char name) {
        System.out.print("Valores do vetor " + name + ": ");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
