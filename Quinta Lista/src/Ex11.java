/*11) Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
e ‘/’. Calcule e mostre a operação efetuada e o seu resultado.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();
        System.out.println("Escolha uma das operações aritméticas: (+, -, * ou /)");
        String escolha = scanner2.nextLine();
        scanner.close();
        scanner2.close();

        char operador = escolha.charAt(0);
        switch (operador) {
            case '+':
                System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
                break;

            case '-':
                System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
                break;

            case '*':
                System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
                break;

            case '/':
                System.out.printf("%d / %d = %.1f", num1, num2, (double)num1 / num2);
                break;

            default:
                System.out.println("ERRO! Informe o operador corretamente!");
                break;
        }
    }
}
