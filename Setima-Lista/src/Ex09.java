/*9) Fazer um programa para contar quantos espaços em branco existem em uma frase
        fornecida pelo usuário.*/


import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma frase: ");
        String frase = scanner.nextLine();
        int cont = 0;
        for (int i = 0; i < frase.length() ; i++) {
            if (frase.charAt(i) == ' ') {
                cont++;
            }
        }
        System.out.println("Quantidade de espaços em branco contidos na frase: " + cont);
    }
}
