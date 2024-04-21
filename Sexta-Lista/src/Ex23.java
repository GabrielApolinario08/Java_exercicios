/*23) A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Escreva um programa em
        Java para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
        a) Média de salário da população;
        b) Média do número de filhos;
        c) Maior salário dos habitantes;
        d) Percentual de pessoas com salário menor que R$ 150,00.
        Obs.: O final das leituras dos dados se dará com a entrada de um “salário negativo”.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0, maior = 0;
        int populacao = 0, qtdFilhos = 0, salarioMenor150 = 0;
        while (true)  {
            System.out.println("Digite o salário: ");
            double salario = scanner.nextDouble();

            if (salario < 0) {
                System.out.println("Encerrado!");
                break;
            }

            System.out.println("Digite o número de filhos: ");
            int filhos = scanner.nextInt();

            populacao++;
            soma += salario;
            qtdFilhos += filhos;
            maior = Math.max(maior, salario);
            salarioMenor150 += salario < 150 ? 1 : 0;
        }
        System.out.printf("Média do salário da pupulação: R$%.2f\n", soma / populacao);
        System.out.println("Média do número de filhos da população: " + (double)qtdFilhos / populacao);
        System.out.printf("Maior salário dos habitantes: R$%.2f\n", maior);
        System.out.printf("Percentual de pessoas com salário menor que R$150,00: %.1f", (double)salarioMenor150 * 100 / populacao);
    }
}
