/*24) Desenvolva um programa que leia uma String (que representa uma sequência de dígitos
        0's e 1's) e que determine o tamanho da maior sequência consecutiva de números 1 existente
        na String. No exemplo seguinte a maior cadeia consecutiva de números 1 tem tamanho 8
        (oito).
        001010100110110100001011101111111101101001011000*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma sequência de digitos 0 e 1: ");
        String digitos = scanner.nextLine();
        int contador = 0, maiorSequencia = 0;
        for (int i = 0 ; i < digitos.length() ; i++) {
            if (digitos.charAt(i) == '1') {
                contador++;
                if (contador > maiorSequencia){
                    maiorSequencia = contador;
                }
            } else {
                contador = 0;
            }
        }
        System.out.println("Maior sequência de números 1 consecutivos existente: " + maiorSequencia);
    }
}   
