/*3) [POO-003] Com base nos dois exercícios anteriores, crie programa que solicite ao usuário um número
        tipo double. Após verifique se o número é positivo, negativo ou zero. As verificações devem ser feitas
        através de métodos.
        Entrada:                        Saída:
        Entre com um número: -1,48      O número -1.48 é negativo.
        Entre com um número: 3,14       O número 3.14 é positivo.
        Entre com um número: 0          O número 0.0 é zero.*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        double num = scanner.nextDouble();
        if (isZero(num)) {
            System.out.println("O número " + num + " é zero.");
        } else if (isPositivo(num)){
            System.out.println("O número " + num + " é positivo.");
        } else {
            System.out.println("O número " + num + " é negativo.");
        }
    }

    static boolean isZero(double num) {
        return num == 0;
    }
    static boolean isPositivo(double num) {
        return num >= 0;
    }
}