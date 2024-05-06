/*14) [POO-027] Crie um programa que solicite ao usuário um número inteiro. Através de um método que
        receba esse número inteiro como parâmetro de entrada, inverta dígito-a-dígito e retorne um valor inteiro
        com o número invertido.
        Entrada: Saída:
        Entre com um número: 12 >> 21
        Entre com um número: 430 >> 34
        Entre com um número: -27 >> -72
        Entre com um número: 0 >> 0*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int valor = scanner.nextInt();

        System.out.println("Número informado invertido: " + invertiNum(valor));
    }

    static int invertiNum(int num) {
        String numeroString = String.valueOf(Math.abs(num));
        String numeroRetornado = "";
        int cont = 1;
        for (int i = 0 ; i < numeroString.length() ; i++) {
            numeroRetornado += numeroString.charAt(numeroString.length() - cont);
            cont++;
        }
        if (num < 0) {
            numeroRetornado = "-" + numeroRetornado;
        }
        return Integer.parseInt(numeroRetornado);
    }
}
