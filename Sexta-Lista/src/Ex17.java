/*17) Escreva um programa em Java para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a
        média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
        Ao final da execução a mensagem 'NOVO CÁLCULO (S/N)?' deve ser apresentada. Se for respondido 'S' deve
        retornar e executar um novo cálculo, caso contrário deverá encerrar o programa.*/

import java.util.Locale;
import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner continuar = new Scanner(System.in);
        while (true) {
            System.out.println("Informe a nota da 1a: ");
            float a1 = scanner.nextFloat();

            System.out.println("Informe a nota da 2a: ");
            float a2 = scanner.nextFloat();

            if (a1 < 0 || a1 > 10 || a2 < 0 || a2 > 10) {
                System.out.println("ERRO! Informe os valores corretamente!");
            } else {
                System.out.println("A sua média é " + (a2 + a2) / 2);
                System.out.println("NOVO CÁLCULO (S/N)?");
                String opc = continuar.nextLine();
                if (!opc.equalsIgnoreCase("S")) {
                    break;
                }
            }
        }
    }
}
