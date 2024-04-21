/*44) Solicite ao usuário a quantidade de termos da sequência de fatoriais e
        imprima o resultado.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos termos serão fatorados?");
        int quantidadeTermos = scanner.nextInt();
        int fatorial , resultado = 1;

        if (quantidadeTermos == 1) {
            System.out.printf("%d! -> ", 1);
            System.out.printf("%d\n", 1);
            System.exit(0);
        }
        int i = 1;
        while (i <= quantidadeTermos) {
            if (i == 1) {
                System.out.printf("%d! -> ", i);
                System.out.printf("%d\n", i);
                i++;
            }
            fatorial = i;
            System.out.printf("%d! -> ", fatorial);
            while (i != 1) {
                System.out.printf("%d * ", fatorial);
                resultado *= fatorial;
                if (fatorial == 2) {
                    fatorial--;
                    System.out.printf("%d = %d\n", fatorial, resultado);
                    resultado = 1;
                    break;
                }
                fatorial--;
            }
            i++;
        }
    }
}
