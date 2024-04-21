/* 10) Escreva um programa em Java para ler 10 valores, calcular e escrever a média aritmética desses valores
lidos. */

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int cont = 1;
        while (cont <= 10) {
            System.out.printf("Informe o %d° valor: ", cont);
            int valor = scanner.nextInt();
            soma += valor;
            cont++;
        }
        cont--;
        System.out.println(soma);
        System.out.println(cont);
        System.out.printf("Média aritmética dos valores informados: %.1f", (float) soma / cont);
    }
}
