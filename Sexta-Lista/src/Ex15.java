/*15) O mesmo exercício anterior, mas agora, considere que o segundo valor lido poderá ser maior ou menor
        que o primeiro valor lido, ou seja, deve-se testá-los.*/


import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite outro valor: ");
        int valor2 = scanner.nextInt();

        int menor, maior;
        if (valor1 > valor2) {
            menor = valor2;
            maior = valor1;
        } else {
            menor = valor1;
            maior = valor2;
        }
        int soma = 0;
        for (int i = menor ; i <= maior ; i++) {
            soma += i;
        }

        System.out.printf("A soma dos valores entre %d e %d é: %d", menor, maior, soma);
    }
}
