/* 6) Escreva um programa em Java que calcule e imprima a tabuada do 8 (1 a 10). */

// Gabriel Apolinário Fabrício
public class Ex06 {
    public static void main(String[] args) {
        System.out.println("Tabuada do 8!");
        int cont = 0;
        while (cont <= 10) {
            System.out.printf("8 x %d = %d\n", cont, cont * 8);
            cont++;
        }
    }
}
