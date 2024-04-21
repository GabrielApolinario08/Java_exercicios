/*30) Da mesma forma que o exercício anterior, implemente um programa para criptografar e
        descriptografar utilizando a cifra ROT-13.*/


import java.text.Normalizer;
import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ESCOLHA UMA DAS OPÇÕES -- ROT-13");
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
        String textoCrip = "";
        int codLetra;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length() ; i++) {
            if (texto.charAt(i) == ' ') {
                textoCrip += ' ';
            } else {
                if ((int)texto.charAt(i) < 13 + 97) {
                    codLetra = (int)texto.charAt(i) + 13;
                    textoCrip += (char)codLetra;
                } else {
                    codLetra = (int)texto.charAt(i) - 13;
                    textoCrip += (char)codLetra;
                }
            }
        }

        return textoCrip;
    }
}
