/*6) Utilizando o exercício 4 (Data) criar uma classe testadora de datas, onde o haverá duas datas e métodos
        para comparar se são iguais, qual é a maior e a menor e a diferença, em dias, de uma para a outra. Supor
        anos de 365 dias*/

//Gabriel Apolinário Fabrício
package ex06;

import java.util.Date;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestaData testaData = new TestaData();

        System.out.println("PRIMEIRA DATA!");
        System.out.println("Informe o dia: ");
        testaData.setDia01(scanner.nextInt());

        System.out.println("Informe o mês: ");
        testaData.setMes01(scanner.nextInt());

        System.out.println("Informe o ano: ");
        testaData.setAno01(scanner.nextInt());

        System.out.println("SEGUNDA DATA!");
        System.out.println("Informe o dia: ");
        testaData.setDia02(scanner.nextInt());

        System.out.println("Informe o mês: ");
        testaData.setMes02(scanner.nextInt());

        System.out.println("Informe o ano: ");
        testaData.setAno02(scanner.nextInt());

        System.out.println("Primeira data: " + testaData.getData01());
        System.out.println("Segunda data: " + testaData.getData02());
        System.out.println("As datas são iguais? " + testaData.datasIguais());
        System.out.println("Qual a maior data? " + testaData.dataMaior());
        System.out.println("Qual a menor data? " + testaData.dataMenor());
        System.out.println("Qual a diferença das duas datas em dias? " + testaData.diferencaDias());
    }
}
