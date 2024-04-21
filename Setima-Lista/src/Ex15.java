/*15) Escreva um programa que informe se em uma frase fornecida pelo usuário existem
        caracteres numéricos.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma frase: ");
        String frase = scanner.nextLine();
        boolean isNumerico = false;
        for (int i = 0 ; i < frase.length() ; i++) {
            if (existeCrtNumerico(frase.charAt(i))) {
                isNumerico = true;
                break;
            }
        }

        if (isNumerico) {
            System.out.println("EXISTE CARACTERE NÚMERICO NA FRASE!");
        } else {
            System.out.println("NÃO EXISTE CARACTERE NÚMERICO NA FRASE!");
        }
    }
    public static boolean existeCrtNumerico(char crt) {
        for (char i = '0' ; i <= '9' ; i++) {
            if (i == crt) {
                return true;
            }
        }
        return false;
    }

}

