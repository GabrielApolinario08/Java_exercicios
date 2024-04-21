/*61) Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a
        soma dos termos.*/


import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int termos, cont = 1, numerador = 2, denominador = 1;
        double soma = 0;
        System.out.println("Quantos termos deseja mostrar: ");
        termos = scanner.nextInt();
        while (cont <= termos) {
            System.out.printf("%d/%d + ", numerador, denominador);
            soma += (double)numerador / denominador;
            numerador += 2;
            denominador += 2;
            cont++;
        }
        System.out.print("FIM!!");
        System.out.printf("\n\tSoma: %.1f", soma);
    }
}
