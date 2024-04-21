/*48) Solicite ao usuário a quantidade de termos da sequência de números primos e
        imprima o resultado.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de números primos que devem ser imprimidos: ");
        int cont = 1, x = 1, limite = scanner.nextInt();
        boolean isPrimo = true;
        while (x <= limite) {
            if (cont == 1) {
                cont++;
            }
            for (int i = 2; i <= Math.sqrt(cont) ; i++) {
                if (cont % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.printf("%d - ", cont);
                x++;
            }
            isPrimo = true;
            cont++;
        }
        System.out.print("FIM!");
    }
}
