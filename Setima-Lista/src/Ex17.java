/*17) Escreva um programa que leia duas frases e a seguir informe se as frases fornecidas são
        iguais. Observação: realizar esta verificação caractere por caractere.*/


import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma frase: ");
        String frase01 = scanner.nextLine();
        System.out.println("Informe outra frase: ");
        String frase02 = scanner.nextLine();

        boolean isEquals = true;
        if (frase01.length() == frase02.length()) {
            for (int i = 0 ; i < frase01.length() ; i++) {
                if (frase01.charAt(i) != frase02.charAt(i)) {
                    isEquals = false;
                    break;
                }
            /*for (int cont = 0 ; cont < frase02.length() ; cont++) {

            }*/
            }
        } else {
            isEquals = false;
        }

        if (isEquals) {
            System.out.println("AS FRASES SÃO IGUAIS!");
        } else {
            System.out.println("AS FRASES NÃO SÃO IGUAIS!");
        }
    }
}
