/*54) Solicite ao usuário o termo inicial e o termo final da sequência de Fibonacci
        (intervalo fechado) e imprima o resultado*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio, fim, n1, n2, n3, cont = 1;
        System.out.println("Digite o termo inicial da sequência de Fibonacci: ");
        inicio = scanner.nextInt();

        System.out.println("Digite o termo final da sequência de Fibonacci: ");
        fim = scanner.nextInt();
        n1 = 0;
        n2 = 1;
        n3 = n1 + n2;
        while (cont <= fim) {
            if (cont >= inicio) {
                System.out.printf("%d - ", n1);
            }
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            cont++;
        }
        System.out.printf("FIM!!");
    }
}
