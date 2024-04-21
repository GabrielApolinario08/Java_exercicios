/*49) Solicite ao usuário a quantidade de termos da sequência de números primos
        e imprima a sequência do final para o início.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de números da sequência: ");
        int cont = 1, primo = 1, limite = scanner.nextInt();
        boolean isPrimo = true;
        while (cont <= limite) {
            if (primo == 1) {
                isPrimo = false;
            }

            for (int i = 2 ; i <= Math.sqrt(primo) ; i++) {
                if (primo % i == 0) {
                    isPrimo = false;
                }
            }

            if (isPrimo) {
                cont++;
            }
            isPrimo = true;
            primo++;
        }

        while (primo >= 2) {
            for (int i = 2 ; i <= Math.sqrt(primo) ; i++) {
                if (primo % i == 0) {
                    isPrimo = false;
                }
            }

            if (isPrimo) {
                System.out.printf("%d - ", primo);
                cont++;
            }
            isPrimo = true;
            primo--;
        }
        System.out.print("FIM!!");
    }
}
