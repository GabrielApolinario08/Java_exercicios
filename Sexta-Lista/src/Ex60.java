/*60) Solicite ao usuário os dois primeiros termos da sequência de Ricci e depois
        solicite a número e verifique se o número informado pertence a sequência de
        Ricci ou não.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3, cont = 1, num;
        boolean pertence = false;
        System.out.println("Informe o primeiro número da sequência de Ricci: ");
        n1 = scanner.nextInt();

        System.out.println("Informe o segundo número da sequência de Ricci: ");
        n2 = scanner.nextInt();

        System.out.println("Informe um número, para ser verificado se ele pertence a sequência de Ricci: ");
        num = scanner.nextInt();

        n3 = n1 + n2;
        System.out.println("Sequência de Ricci:");
        while (cont <= num) {
            System.out.printf("%d - ", n1);
            if (n1 == num) {
                pertence = true;
            }
            cont++;
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        System.out.print("FIM!!\n\n");
        if (pertence) {
            System.out.println("\tO número " + num + " pertence a sequência de Ricci!");
        } else {
            System.out.println("\tO número " + num + " não pertence a sequência de Ricci!");
        }
    }
}
