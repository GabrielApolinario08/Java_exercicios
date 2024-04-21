/*51) Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima
        o resultado.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int termos, n1, n2, n3, cont = 3;

        System.out.println("Digite a quantidade de termos da sequência de Fibonacci: ");
        termos = scanner.nextInt();

        n1 = 0;
        n2 = 1;
        n3 = n1 + n2;
        System.out.printf("%d - %d - ", n1, n2);
        while (cont <= termos) {
            System.out.printf("%d - ", n3);
            cont++;
            n1 = n2;
            n2 = n3;
            n3 = n2 + n1;
        }
        System.out.print("FIM!!");
    }
}
