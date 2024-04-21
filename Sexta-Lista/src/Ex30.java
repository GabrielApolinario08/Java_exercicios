/*30) Escreva um programa em Java que imprima sequência 6:
        1, 1
        2, 2 4
        3, 1 3 5
        4, 2 4 6 8
        5, 1 3 5 7 9
        6, 2 4 6 8 10 12
        7, 1 3 5 7 9 11 13
        8, 2 4 6 8 10 12 14 16
        9, 1 3 5 7 9 11 13 15 17
        10, 2 4 6 8 10 12 14 16 18 20*/

// Gabriel Apolinário Fabrício
public class Ex30 {
    public static void main(String[] args) {
        int cont = 1, x = 1, y = 4;
        while (cont <= 10) {
            System.out.printf("%d, ", cont);
            for (int i = 1 ; i <= x ; i += 2) {
                System.out.printf("%d ", i);
            }
            cont++;
            x += 4;
            System.out.println();

            System.out.printf("%d, ", cont);
            for (int i = 2 ; i <= y ; i += 2) {
                System.out.printf("%d ", i);
            }
            cont++;
            y += 4;
            System.out.println();
        }
    }
}
