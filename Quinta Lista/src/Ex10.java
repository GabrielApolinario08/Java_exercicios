/*10) Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo
vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
salário total.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o salário fixo: ");
        double salarioFixo = scanner.nextDouble();
        System.out.println("Informe o valor das vendas efetuadas: ");
        double vendas = scanner.nextDouble();
        scanner.close();

        double salarioTotal;
        if (vendas <= 1500) {
            salarioTotal = salarioFixo + ((double) 3 / 100 * vendas);
        } else {
            double excede1500 = vendas - 1500;
            salarioTotal = salarioFixo + (((double) 3 / 100 * 1500) + (double) 5 / 100 * excede1500);
        }
        System.out.printf("Saláio total: R$%.2f", salarioTotal);
    }
}
