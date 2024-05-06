/*3) [POO-016] ===Desafio!!!=== Semelhante ao exercício [POO-015] Crie um programa de conversão de
        temperaturas, mas agora com três possibilidades de unidade de medida: Celsius, Fahrenheit e Kelvin. A
        saída deverá ser as outras duas temperaturas, exemplo: entrada em Celsius, a saída deve ser em Fahrenheit
        e Kelvin. O processo de conversão deverá ser feito através de um ou mais métodos que recebe a
        temperatura fornecida como parâmetro de entrada e retorne as temperaturas convertidas. Para os cálculos
        de conversão, utilize as fórmulas C = 5 * (F - 32) / 9, F = (9 * C / 5) + 32 e K = C + 273. O programa deve ser
        executado enquanto o usuário desejar.
        Entrada: Saída: Cálculo:
        [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: M
        Opção Inválida!
        [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: C [ F = (9 * 0 / 5) + 32 ]
        Entre com a temperatura: 0 F: 32 e K: 273 [ K = 0 + 273 ]
        [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S
        [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S
        [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: C [ F = (9 * 100 / 5) + 32 ]
        Entre com a temperatura: 100 F: 212 e K: 373 [ K = 100 + 273 ]
        [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: F [ C = 5 * (86 – 32) / 9 ]
        Entre com a temperatura: 86 C: 30 e F: 303 [ F = (9 * 100 / 5) + 32 ]
        [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: K [ C = 0 – 273 ]
        Entre com a temperatura: 0 C: -273 e F: -459,4 [ F = (9 * (0 – 273) / 5) + 32 ]
        [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S*/

//Gabriel Apolinário Fabrício
import java.io.PrintStream;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        double temp = 0.0;

        String opc;
        do {
            System.out.println("[C]Celsius, [F]Fahrenheit, [K] Kelvin e [S]Sair: ");
            opc = scannerString.nextLine();
            PrintStream var10000;
            String var10001;
            if (opc.equalsIgnoreCase("C")) {
                System.out.println("Entre com a temperatura: ");
                temp = scanner.nextDouble();
                var10000 = System.out;
                var10001 = conversor(temp, opc);
                var10000.println("A temperatura em Fahrenheit é: " + var10001);
            } else if (opc.equalsIgnoreCase("F")) {
                System.out.println("Entre com a temperatura: ");
                temp = scanner.nextDouble();
                var10000 = System.out;
                var10001 = conversor(temp, opc);
                var10000.println("A temperatura em Celsius é: " + var10001);
            } else if (opc.equalsIgnoreCase("K")) {
                System.out.println("Entre com a temperatura: ");
                temp = scanner.nextDouble();
                var10000 = System.out;
                var10001 = conversor(temp, opc);
                var10000.println("A temperatura em Celsius é: " + var10001);
            } else if (!opc.equalsIgnoreCase("S")) {
                System.out.println("Opção inválida!");
            }
        } while(!opc.equalsIgnoreCase("S"));

    }

    static String conversor(double temp, String opc) {
        if (opc.equalsIgnoreCase("C")) {
            return "F: " + (9.0 * temp / 5.0 + 32.0) + " e K: " + (temp + 273.0);
        } else {
            return opc.equalsIgnoreCase("F") ? "C: " + 5.0 * (temp - 32.0) / 9.0 + " e K: " + (temp / 9.0 + 273.0) : "C: " + 5.0 * (temp - 32.0) / 9.0 + " e F: " + (9.0 * temp / 5.0 + 32.0);
        }
    }
}