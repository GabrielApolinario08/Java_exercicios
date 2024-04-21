/*62) Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a
        soma dos termos.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int termos, cont = 0, numerador = 2, denominador = 1;
        double soma = 2;
        System.out.println("Quantos termos deseja mostrar: ");
        termos = scanner.nextInt();
        while (cont < termos) {
            System.out.printf("%d/%d - ", numerador, denominador);
            cont++;
            if (cont == termos) {
                break;
            }
            numerador += 2;
            denominador += 2;
            soma -= (double)numerador/denominador;


            System.out.printf("%d/%d + ", numerador, denominador);
            cont++;
            if (cont == termos) {
                break;
            }
            numerador += 2;
            denominador += 2;
            soma += (double)numerador/denominador;


        }
        System.out.print("FIM!!");
        System.out.printf("\n\tSoma: %.3f", soma);
    }
}
