/*18) Desenvolva um programa que leia uma cadeia de caracteres e através de uma mensagem
        indique se esta cadeia representa uma sequência binária de 8 bit’s ou não.
        Ex:
        - não é uma sequência de 8bit’s: 01101, 10192898, 10001jaA
        - é uma sequência de 8bit’s: 01101011, 10110101, 10000000*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma sequência de caracteres de 8 bits: ");
        String seq = scanner.nextLine();
        boolean is8bits = true;
        if (seq.length() != 8) {
            is8bits = false;
        } else {
            for (int i = 0 ; i < seq.length() ; i++) {
                if (seq.charAt(i) != '0' && seq.charAt(i) != '1') {
                    is8bits = false;
                    break;
                }
            }

        }
        if (is8bits) {
            System.out.println("É UMA SEQUÊNCIA DE 8 BITS!");
        } else {
            System.out.println("NÃO É UMA SEQUÊNCIA DE 8 BITS!");
        }

    }
}
