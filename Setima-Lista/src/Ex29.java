/*29) Escreva um programa que apresente um menu com 3 opções:
        1 – Criptografar
        2 – Descriptografar
        3 – Sair*/

import java.text.Normalizer;
import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ESCOLHA UMA DAS OPÇÕES");
            System.out.println("\t1 - Criptografar");
            System.out.println("\t2 - Descriptografar");
            System.out.println("\t3 - Sair");
            System.out.print("Sua escolha (digite 1, 2 ou 3): ");
            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    criptografar();
                    break;
                case 2:
                    descriptografar();
                    break;
                case 3:
                    System.out.println("Finalizado com sucesso.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\nERRO! Digite uma opção válida!");
            }
        }
    }
    public static void criptografar() {
        Scanner scannerString = new Scanner(System.in);
        System.out.println("Digite o texto que deseja criptografar: ");
        String texto = scannerString.nextLine();
        String normalized = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = normalized.replaceAll("[^\\p{ASCII}]", "");

        System.out.println("\n\tSeu texto criptografado: '" + criptografaDescriptografa(texto) + "'\n");
    }

    public static void descriptografar() {
        Scanner scannerString = new Scanner(System.in);
        System.out.println("Digite o texto que deseja descriptografar: ");
        String texto = scannerString.nextLine();
        System.out.println("\n\tSeu texto descriptografado: '" + criptografaDescriptografa(texto) + "'\n");
    }

    public static String criptografaDescriptografa(String texto) {
        String textoAlterado = "";
        for (int i = 0 ; i < texto.length() ; i++) {
            // z ou p
            if (texto.charAt(i) == 'z' || texto.charAt(i) == 'Z') {
                textoAlterado += texto.charAt(i) == 'z' ? 'p' : 'P';
            }
            if (texto.charAt(i) == 'p' || texto.charAt(i) == 'P') {
                textoAlterado += texto.charAt(i) == 'p' ? 'z' : 'Z';
            }
            // e ou o
            if (texto.charAt(i) == 'e' || texto.charAt(i) == 'E') {
                textoAlterado += texto.charAt(i) == 'e' ? 'o' : 'O';
            }
            if (texto.charAt(i) == 'o' || texto.charAt(i) == 'O') {
                textoAlterado += texto.charAt(i) == 'o' ? 'e' : 'E';
            }
            // n ou l
            if (texto.charAt(i) == 'n' || texto.charAt(i) == 'N') {
                textoAlterado += texto.charAt(i) == 'n' ? 'l' : 'L';
            }
            if (texto.charAt(i) == 'l' || texto.charAt(i) == 'L') {
                textoAlterado += texto.charAt(i) == 'l' ? 'n' : 'N';
            }
            // i ou a
            if (texto.charAt(i) == 'i' || texto.charAt(i) == 'I') {
                textoAlterado += texto.charAt(i) == 'i' ? 'a' : 'A';
            }
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
                textoAlterado += texto.charAt(i) == 'a' ? 'i' : 'I';
            }
            // t ou r
            if (texto.charAt(i) == 't' || texto.charAt(i) == 'T') {
                textoAlterado += texto.charAt(i) == 't' ? 'r' : 'R';
            }
            if (texto.charAt(i) == 'r' || texto.charAt(i) == 'R') {
                textoAlterado += texto.charAt(i) == 'r' ? 't' : 'T';
            }
            // nenhum dos casos
            if (texto.charAt(i) != 'z' && texto.charAt(i) != 'Z' && texto.charAt(i) != 'p' && texto.charAt(i) != 'P' &&
                    texto.charAt(i) != 'e' && texto.charAt(i) != 'E' && texto.charAt(i) != 'o' && texto.charAt(i) != 'O' &&
                    texto.charAt(i) != 'n' && texto.charAt(i) != 'N' && texto.charAt(i) != 'l' && texto.charAt(i) != 'L' &&
                    texto.charAt(i) != 'i' && texto.charAt(i) != 'I' && texto.charAt(i) != 'a' && texto.charAt(i) != 'A' &&
                    texto.charAt(i) != 't' && texto.charAt(i) != 'T' && texto.charAt(i) != 'r' && texto.charAt(i) != 'R') {
                textoAlterado += texto.charAt(i);
            }
        }
        return textoAlterado;
    }
}
