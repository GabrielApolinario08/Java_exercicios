/*45) Solicite ao usuário a quantidade de termos da sequência de fatoriais e imprima a
        sequência do final para o início.*/

// Gabriel Apolinário Fabrício
import java.util.Scanner;
public class Ex45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a quantidade de termos da sequência de fatoriais
        System.out.print("Digite a quantidade de termos da sequência de fatoriais: ");
        int quantidadeTermos = scanner.nextInt();

        // Imprimir os fatoriais
        System.out.println("A sequência de fatoriais é: ");
        for (int i = 1; i <= quantidadeTermos; i++) {
            long fatorial = calcularFatorial(i);
            System.out.println(i + "! = " + fatorial);
        }

        scanner.close();
    }

    private static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }
}
