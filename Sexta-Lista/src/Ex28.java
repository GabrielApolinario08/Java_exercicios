/*28) Escreva um programa em Java que imprima sequência 4:
        1, 2 3 4 5 6 7 8 9 10
        2, 3 4 5 6 7 8 9 10
        3, 4 5 6 7 8 9 10
        4, 5 6 7 8 9 10
        5, 6 7 8 9 10
        6, 7 8 9 10
        7, 8 9 10
        8, 9 10
        9, 10
        10,*/



// Gabriel Apolinário Fabrício
public class Ex28 {
    public static void main(String[] args) {
        int cont = 1, x = 2;
        while (cont <= 10) {
            System.out.printf("%d, ", cont);
            for (int i = x ; i <= 10 ; i++) {
                System.out.printf("%d ", i);
            }
            x++;
            cont++;
            System.out.println();
        }
    }
}
