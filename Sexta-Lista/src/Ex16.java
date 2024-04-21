/*16) Escreva um programa em Java que calcule e escreva a média aritmética dos números inteiros entre 15
        (inclusive) e 100 (inclusive).*/

// Gabriel Apolinário Fabrício
public class Ex16 {
    public static void main(String[] args) {
        int cont = 15, soma = 0;
        while (cont <= 100) {
            soma += cont;
            cont++;
        }
        System.out.printf("A média aritmética da soma dos números entre 15 e 100 é %.2f", (double) soma / (100 - 14));
    }
}

