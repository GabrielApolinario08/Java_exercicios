/*26) Escreva um programa para ler um vetor AG de dimensão e com
        elementos fornecidos pelo usuário e colocar, somente, os elementos PRIMOS
        em ordem crescente. Ao final imprimir o vetor AG ordenado.*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de elementos do vetor AG: ");
        int[] AG = new int[scanner.nextInt()], primos;
        int cont = 0, j = 0;

        for (int i = 0 ; i < AG.length ; i++) {
            System.out.println("Informe o " + (i + 1) + "° valor do vetor: ");
            AG[i] = scanner.nextInt();
            if (isPrimo(AG[i])) {
                cont++;
            }
        }
        primos = new int[cont];
        for (int i = 0 ; i < AG.length ; i++) {
            if (isPrimo(AG[i])) {
                primos[j] = AG[i];
                j++;
            }
        }

        Arrays.sort(primos);
        j = 0;
        for (int i = 0 ; i < AG.length ; i++) {
            if (isPrimo(AG[i])) {
                AG[i] = primos[j];
                j++;
            }
        }

        System.out.print("Vetor AG com os elementos primos em ordem crescente: ");
        for (int valor : AG) {
            System.out.print(valor + " ");
        }
    }

    public static boolean isPrimo(int valor) {
        if (valor == 1) {
            return false;
        }
        for (int i = 2 ; i < valor ; i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }
}
