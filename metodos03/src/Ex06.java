/*6) [POO-019] Crie um programa que solicite ao usuário dois números inteiros. Estes, devem ser passados
        como parâmetros de entrada para um método que irá gerar todos os números primos existentes no
        intervalo fechado desses dois valores e retornar uma array com a resposta. O programa principal ficará com
        a responsabilidade de imprimir o array de primos retornado pelo método. O método deve aceitar e
        entender como sendo a mesma coisa passar, por exemplo, os valores 1 e 100 ou 100 e 1.
        Entrada: Saída:
        Entre com um valor: 10 >> 11 13 17 19 23 29 31 37 41 43 47
        Entre com outro valor: 50
        Entre com um valor: 231 >> 211 223 227 229
        Entre com outro valor: 205
        Entre com um valor: 19 >> 19
        Entre com outro valor: 19*/


import java.util.ArrayList;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        int valor01 = scanner.nextInt();
        System.out.println("Entre com outro valor: ");
        int valor02 = scanner.nextInt();
        int menor = Math.min(valor01, valor02), maior = Math.max(valor01, valor02);
        menor = Math.max(menor, 2);
        System.out.println(">> " + geradorPrimos(menor, maior));
    }

    static ArrayList<Integer> geradorPrimos(int menor, int maior) {
        ArrayList<Integer> primos = new ArrayList<Integer>();
        for (int i = menor ; i <= maior ; i++) {
            if (ehPrimo(i)) {
                primos.add(i);
            }
        }

        return primos;
    }

    static boolean ehPrimo(int valor) {
        for (int i = 2; i < valor ; i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }
}
