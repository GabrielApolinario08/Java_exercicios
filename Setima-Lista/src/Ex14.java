/*14) Escreva um programa para ler uma frase e um caractere. Sempre que o caractere lido
        aparecer na frase ele deve ser substituído por asterisco. Por exemplo, se os valores fornecidos
        fossem para a frase: o dia esta nublado, e para o caractere: a, o programa deverá fornecer o
        seguinte resultado: o di* est* nubl*do.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma frase: ");
        String frase = scanner.nextLine().toLowerCase();
        System.out.println("Informe uma letra: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);

        String fraseNova = "";
        for (int i = 0 ; i < frase.length() ; i++) {
            if (frase.charAt(i) == letra) {
                fraseNova += '*';
            } else {
                fraseNova += frase.charAt(i);
            }
        }
        System.out.println("Frase alterada: " + fraseNova);
    }
}
