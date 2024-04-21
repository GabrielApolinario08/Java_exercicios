/*6) Escreva um programa que calcule e escreva a quantidade de vezes que um
        caractere fornecido pelo usuário aparece em uma frase, também, fornecida pelo
        mesmo. Nota Importante: para a contagem, o caractere pode ser maiúsculo ou
        minúsculo.*/


import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um caractere: ");
        char caractere = scanner.nextLine().charAt(0);

        System.out.println("Informe uma frase: ");
        String frase = scanner.nextLine();

        int cont = 0;
        frase = frase.toLowerCase();
        caractere = Character.toLowerCase(caractere);
        for (int i = 0 ; i < frase.length() ; i++) {
            if (caractere == frase.charAt(i)) {
                cont++;
            }
        }
        System.out.println("Quantidade de vezes que o caractere '" + caractere + "' aparecereu na frase: " + cont);
    }
}
