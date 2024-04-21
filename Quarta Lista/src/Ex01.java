/*1 - Crie um arquivo chamado AprovadoReprovadoRandom.java. Gere um número aleatório com
valores entre 0 e 10 (inclusos) e atribua a variável nota. O programa deve exibir a mensagem
REPROVADO quando a nota do aluno for menor do que 6 ou APROVADO caso contrário.*/

import java.util.Random;

//Gabriel Apolinário Fabrício
public class Ex01 {
    public static void main(String[] args) {
        Random valor = new Random();
        int nota = valor.nextInt(10);
        System.out.println("Nota: " + nota);
        System.out.println(nota < 6 ? "REPROVADO!" : "APROVADO!");
    }
}