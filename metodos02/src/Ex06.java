/*6) [POO-011] Crie um programa que solicite ao usuário números inteiros. A cada número inserido,
        perguntar ao usuário se ele deseja informar outro número. Através de um método, verifique e retorne o
        menor dos valores.
        Entrada:                                Saída:
            Entre com um número inteiro: 8          O menor é: 2
            Inserir outro [s/n]: s
            Entre com um número inteiro: 2
            Inserir outro [s/n]: n
            Entre com um número inteiro: -48        O menor é: -48
            Inserir outro [s/n]: n
            Entre com um número inteiro: 17         O menor é: 17
            Inserir outro [s/n]: s
            Entre com outro número inteiro: 17
            Inserir outro [s/n]: s
            Entre com outro número inteiro: 34
            Inserir outro [s/n]: n*/

import java.util.ArrayList;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        String opc;
        ArrayList<Integer> numeros = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Entre com um número inteiro: ");
            int num = scanner.nextInt();
            numeros.add(num);

            System.out.println("Inserir outro? [s/n]");
            opc = scannerString.nextLine().toLowerCase();


            if (opc.equals("n")) continuar = false;
        }
        System.out.println("O menor é: " + menor(numeros));
    }

    static int menor(ArrayList<Integer> numeros) {
        int menor = numeros.get(0);
        for (int valor : numeros) {
            if (menor > valor) {
                menor = valor;
            }
        }
        return menor;
    }
}