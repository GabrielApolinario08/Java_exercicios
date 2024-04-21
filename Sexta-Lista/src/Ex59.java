/*59) Solicite ao usuário os dois primeiros termos da sequência de Ricci e depois
        solicite a quantidade de termos que ele deseja gerar. Imprimir o resultado.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3, cont = 1, termos;
        System.out.println("Informe o primeiro número da sequência de Ricci: ");
        n1 = scanner.nextInt();

        System.out.println("Informe o segundo número da sequência de Ricci: ");
        n2 = scanner.nextInt();

        System.out.println("Informe a quantidade de termos da sequência de Ricci: ");
        termos = scanner.nextInt();

        n3 = n1 + n2;

        while (cont <= termos) {
            System.out.printf("%d - ", n1);
            cont++;
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        System.out.print("FIM!!");
    }
}
