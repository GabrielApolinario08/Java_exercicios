/*50) Solicite ao usuário o termo inicial e a quantidade de termos da sequência de
        números primos e imprima o resultado.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o termo inicial da sequência de primos:");
        int termoInicial = scanner.nextInt();

        System.out.println("Digite a quantidade de termos que terá a sequência de primos:");
        int quantidadeTermos = scanner.nextInt();

        int cont = 1, primo = termoInicial;
        boolean isPrimo = true;
        while (cont <= quantidadeTermos) {
            if (primo == 1) {
                isPrimo = false;
            }

            for (int i = 2 ; i <= Math.sqrt(primo) ; i++) {
                if (primo % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.printf("%d - ", primo);
                cont++;
            }
            isPrimo = true;
            primo++;
        }
        System.out.print("FIM!!");
    }
}
