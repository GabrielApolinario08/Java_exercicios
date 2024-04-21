/* 9) Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos estão no
intervalo [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo. */

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estaNoIntervalo = 0, naoEstaNoIntervalo = 0;

        for (int i = 1 ; i <= 10 ; i++) {
            System.out.printf("Informe o %d° valor: ", i);
            int valor = scanner.nextInt();
            if (valor >= 10 && valor <= 20) {
                estaNoIntervalo++;
            } else {
                naoEstaNoIntervalo++;
            }
        }
        System.out.printf("Quantidade de valores dentro do intervalo de 10 a 20: %d\n", estaNoIntervalo);
        System.out.printf("Quantidade de valores fora do intervalo de 10 a 20: %d", naoEstaNoIntervalo);
    }
}
