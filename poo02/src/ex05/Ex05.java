/*5) Criar uma classe para resolver a equação do segundo grau, sendo necessário passar os valores de a, b e
        c. Criar um método interno para o cálculo do delta e um público para mostrar o valor das raízes, ou da raiz
        ou ainda informar que não existem raízes reais. Lembre-se de validar para ver é uma equação do segundo
        grau.*/

//Gabriel Apolinário Fabrício
package ex05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Equacao2Grau equacao2Grau = new Equacao2Grau();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de a: ");
        equacao2Grau.setA(scanner.nextDouble());
        System.out.println("Informe o valor de b: ");
        equacao2Grau.setB(scanner.nextDouble());
        System.out.println("Informe o valor de c: ");
        equacao2Grau.setC(scanner.nextDouble());

        System.out.println("Valor de a: " + equacao2Grau.getA());
        System.out.println("Valor de b: " + equacao2Grau.getB());
        System.out.println("Valor de c: " + equacao2Grau.getC());
        equacao2Grau.calcularRaizes();
    }
}
