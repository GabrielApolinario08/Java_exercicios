/*6) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrever o maior deles.*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.println("Informe o segundo valor: (diferente do primeiro!)");
        int valor2 = scanner.nextInt();
        scanner.close();
        if (valor1 == valor2) {
            System.out.println("ERRO! Informe valores diferentes!");
            System.exit(1);
        }

        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }
    }
}
