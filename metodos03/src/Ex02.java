/*2) [POO-015] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit e vice-versa. O
        usuário deverá escolher se o valor de temperatura que será informado em Celsius ou em Fahrenheit. Se a
        entrada for em Celsius, a saída deverá ser em Fahrenheit e o contrário, também, é verdade. O processo de
        conversão deverá ser feito através de um ou mais métodos que recebe a temperatura fornecida como
        parâmetro de entrada e retorne a temperatura convertida. Para os cálculos de conversão, utilize as
        fórmulas C = 5 * (F - 32) / 9 e F = (9 * C / 5) + 32. O programa deve ser executado enquanto o usuário
        desejar.
        Entrada: Saída: Cálculo:
        [C]Celsius, [F] Fahrenheit e [S] Sair: V
        Opção Inválida!
        [C]Celsius, [F] Fahrenheit e [S] Sair: C
        Entre com a temperatura: 0 Saída: 32 [ F = (9 * 0 / 5) + 32 ]
        [C]Celsius, [F] Fahrenheit e [S] Sair: S
        [C]Celsius, [F] Fahrenheit e [S] Sair: S
        [C]Celsius, [F] Fahrenheit e [S] Sair: C
        Entre com a temperatura: 100 Saída: 212 [ F = (9 * 100 / 5) + 32 ]
        [C]Celsius, [F] Fahrenheit e [S] Sair: F
        Entre com a temperatura: 86 Saída: 30 [ C = 5 * (86 – 32) / 9 ]
        [C]Celsius, [F] Fahrenheit e [S] Sair: S*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        String opc;
        double temp = 0;
        do {
            System.out.println("[C]Celsius, [F]Fahrenheit e [S]Sair: ");
            opc = scannerString.nextLine();
            if (opc.equalsIgnoreCase("C")) {
                System.out.println("Entre com a temperatura: ");
                temp = scanner.nextDouble();
                System.out.println("A temperatura em Fahrenheit é: " + conversor(temp, opc));

            } else if(opc.equalsIgnoreCase("F")) {
                System.out.println("Entre com a temperatura: ");
                temp = scanner.nextDouble();
                System.out.println("A temperatura em Celsius é: " + conversor(temp, opc));

            } else if(!opc.equalsIgnoreCase("S")){
                System.out.println("Opção inválida!");
            }


        } while (!opc.equalsIgnoreCase("S"));

    }

    static double conversor(double temp, String opc) {
        if (opc.equalsIgnoreCase("C")) {
            return (9 * temp / 5) + 32;
        } else {
            return 5 * (temp - 32) / 9;
        }
    }
}