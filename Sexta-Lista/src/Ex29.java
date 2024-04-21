/*29) Escreva um programa em Java que imprima sequência 5:
        1, 1 3 5 7 9
        2, 2 4 6 8 10
        3, 1 3 5 7 9
        4, 2 4 6 8 10
        5, 1 3 5 7 9
        6, 2 4 6 8 10
        7, 1 3 5 7 9
        8, 2 4 6 8 10
        9, 1 3 5 7 9
        10, 2 4 6 8 10*/

// Gabriel Apolinário Fabrício
public class Ex29 {
    public static void main(String[] args) {
        int cont = 1;
        while (cont <= 10) {
            System.out.printf("%d, ", cont);
            for (int i = 1 ; i <= 9 ; i += 2) {
                System.out.printf("%d ", i);
            }
            cont++;
            System.out.println();
            System.out.printf("%d, ", cont);
            for (int i = 2 ; i <= 10 ; i += 2) {
                System.out.printf("%d ", i);
            }
            cont++;
            System.out.println();
        }
    }
}
