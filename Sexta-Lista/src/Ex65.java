// 65) Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a soma dos termos.

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int termos, cont = 0, num = 1, fatorial = 1, primo = 2, i;
        double soma = 0;
        System.out.println("Quantos termos deseja mostrar: ");
        termos = scanner.nextInt();
        System.out.print("-");
        while (cont < termos) {
            soma -= (double)fatorial / primo;
            System.out.printf("%d/%d + ", fatorial, primo);
            fatorial = 1;
            for (i = num ; i >= 1 ; i--) {
                fatorial *= i;
            }
            num++;
            primo++;
            while (true) {
                for (i = 2; i <= Math.sqrt(primo) ; i++) {
                    if (primo % i == 0) {
                        break;
                    }
                }
                if (!(i <= Math.sqrt(primo))) {
                    break;
                }
                primo++;
            }
            cont++;
            if (cont == termos) {
                break;
            }
            soma += (double)fatorial / primo;

            System.out.printf("%d/%d - ", fatorial, primo);
            fatorial = 1;
            for (i = num ; i >= 1 ; i--) {
                fatorial *= i;
            }
            num++;
            primo++;
            while (true) {
                for (i = 2; i <= Math.sqrt(primo) ; i++) {
                    if (primo % i == 0) {
                        break;
                    }
                }
                if (!(i <= Math.sqrt(primo))) {
                    break;
                }
                primo++;
            }
            cont++;
        }
        System.out.print("FIM!!");
        System.out.printf("\n\tSoma: %.3f\n", soma);
    }
}
