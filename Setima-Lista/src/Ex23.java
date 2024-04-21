/*23) Elabore um programa para obter o nome completo de uma pessoa e a seguir forneça o
        sobrenome do nome completo informado. Por exemplo, para o nome completo: Omero
        Francisco Bertol, o programa deverá fornecer como resultado: Bertol.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome completo: ");
        String[] nome = scanner.nextLine().split(" ");
        String sobrenome = nome[nome.length - 1];
        System.out.println("Sobrenome do nome informado: " + sobrenome);
    }
}
