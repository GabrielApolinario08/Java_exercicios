/*9) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
de 50%. Escreva um programa em Java que leia o número de horas trabalhadas em um mês, o
salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.println("Valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();
        scanner.close();

        double salario;
        if (horasTrabalhadas <= 160) {
            salario = horasTrabalhadas * valorHora;
            System.out.printf("Salário do mês referido: R$%.2f", salario);
        } else {
            int horaExtra = horasTrabalhadas - 160;
            salario = (valorHora * 160) + (((double) 50 / 100 * valorHora + valorHora) * horaExtra);
            System.out.printf("Salário do mês referido com hora extra: R$%.2f", salario);
        }
    }
}