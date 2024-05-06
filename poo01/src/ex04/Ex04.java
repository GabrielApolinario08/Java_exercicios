/*Elabore um programa em java que contenha um método que aceite um valor inteiro e retorne o
        número com os dígitos invertidos. O valor deve ser solicitado ao usuário.*/

//Gabriel Apolinário Fabrício
package ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Numero num = new Numero();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        num.setNumero(scanner.nextInt());
        System.out.println("Número: " + num.getNumero());
        System.out.println("Número invertido: " + num.inverter());
    }
}
