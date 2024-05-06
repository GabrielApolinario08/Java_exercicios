/*Imagine o problema de sair com os amigos para uma refeição em um restaurante e ao final ter que
        dividir a conta para cada pessoa. Outra coisa importante, os 10% do garçom é opcional. Criar uma classe
        para solucionar o problema proposto, onde tem o valor da conta a ser paga (sem os 10% do garçom), a
        quantidade de pessoas que dividirão essa conta e se vai ser pago os 10% do garçom, sim ou não. Valide os
        dados inseridos não permitindo absurdos*/

//Gabriel Apolinário Fabrício
package ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        String pagarTaxa;
        System.out.println("Valor da conta (não incluir as taxas!): ");
        conta.setValorConta(scanner.nextDouble());
        System.out.println("Quantidade de pessoas: ");
        conta.setQtdPessoas(scanner.nextInt());
        System.out.println("Pagar taxa do garçom: (s/n)");
        pagarTaxa = scannerString.nextLine();
        if (pagarTaxa.equalsIgnoreCase("s")) {
            conta.setPagarTaxa(true);
        } else {
            conta.setPagarTaxa(false);
        }


        System.out.println("Valor conta (com taxas se atribuida!): " + conta.getValorConta());
        System.out.println("Quantidade de pessoas: " + conta.getQtdPessoas());
        System.out.println("Pagar a taxa: " + conta.getPagarTaxa());
        System.out.println("Valor da conta para cada uma das " + conta.getQtdPessoas() + " pessoas: " + conta.valorContaIndividual());


    }
}
