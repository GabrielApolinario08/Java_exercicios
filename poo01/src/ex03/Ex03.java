/*Elabore um programa em java que contenha um método booleano que teste se um ano é ou não
        bissexto. Anos divisíveis por 4 são bissextos, exceto para aqueles divisíveis por 100, ao menos que
        sejam também divisíveis por 400.*/

//Gabriel Apolinário Fabrício
package ex03;

public class Ex03 {
    public static void main(String[] args) {
        Ano ano = new Ano();
        ano.setAno(2000);
        System.out.println("ano: " + ano.getAno());
        System.out.println("É bissexto: " + ano.ehBissexto());

        ano.setAno(2014);
        System.out.println("ano: " + ano.getAno());
        System.out.println("É bissexto: " + ano.ehBissexto());

        ano.setAno(2024);
        System.out.println("ano: " + ano.getAno());
        System.out.println("É bissexto: " + ano.ehBissexto());
    }
}
