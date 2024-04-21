/*7) Escreva um programa para ler uma frase fornecida pelo usuário e contar a
        quantidade de cada caractere do alfabeto, imprimindo ao final uma listagem, onde
        consta o caractere e na frente a quantidade de ocorrências. Caso não tenha ocorrência
        apresentar o valor zero. Não diferenciar maiúsculo de minúsculo.*/


import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int contagem = 0;
        System.out.println("Quantidade de vezes que cada letra aparece!");
        for (char i = 'a' ; i <= 'z' ; i++) {
            for (int cont = 0 ; cont < frase.length() ; cont++) {
                if (i == frase.charAt(cont)) {
                    contagem++;
                }
            }
            System.out.println("\t\t" + i + " - " + contagem);
            contagem = 0;
        }
    }
}
