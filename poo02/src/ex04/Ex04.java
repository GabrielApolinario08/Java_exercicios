/*4) Criar uma classe para representar uma Data, onde teremos dia, mês e ano. Criar um método booleano
        que indicará se uma data inserida é válida ou não. Outro método necessário é o mostrar data.*/

//Gabriel Apolinário Fabrício
package ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        System.out.println("Informe o dia: ");
        data.setDia(scanner.nextInt());
        System.out.println("Informe o mês: ");
        data.setMes(scanner.nextInt());
        System.out.println("Informe o ano: ");
        data.setAno(scanner.nextInt());

        System.out.println("Dia informado: " + data.getDia());
        System.out.println("Mês informado: " + data.getMes());
        System.out.println("Ano informado: " + data.getAno());
        System.out.println("Data informada: " + data.mostrarData());
        System.out.println("Data é válida: " + data.isValida());
    }
}
