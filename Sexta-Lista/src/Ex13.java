/*13) Escreva um programa em Java para ler 10 números. Todos os números lidos com valor inferior a 40
        devem ser somados. Escreva o valor final da soma efetuada.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor, soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %d° número: ", i);
            valor = scanner.nextInt();

            if (valor < 40) {
                soma += valor;
            }
        }
        System.out.println("Soma dos valores inferiores a 40: " + soma);
    }
}
