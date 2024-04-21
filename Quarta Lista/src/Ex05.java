/*5 - Crie um arquivo chamado ADivisivelPorBRandom.java. Implemente um programa em Java que
guarde dois valores numéricos inteiros: a e b, gerados aleatoriamente, sendo a de 0 até 1000
(inclusos) e b de 0 a 20 (inclusos). Exiba na saída padrão a mensagem É divisível quando a for
divisível por b ou a mensagem Não é divisível, caso contrário.*/

import java.util.Random;

//Gabriel Apolinário Fabrício
public class Ex05 {
    public static void main(String[] args) {
        Random num = new Random();
        int a = num.nextInt(1000);
        int b = num.nextInt(20);
        System.out.println("a: " + a + " b: " + b);
        System.out.println(a % b == 0 ? "É divisível!" : "Não é divisível!");
    }
}
