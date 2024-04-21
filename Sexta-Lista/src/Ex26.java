/*26) Escreva um programa em Java que imprima sequência 2:
        1, 1
        2, 1 2
        3, 1 2 3
        4, 1 2 3 4
        5, 1 2 3 4 5
        6, 1 2 3 4 5 6
        7, 1 2 3 4 5 6 7
        8, 1 2 3 4 5 6 7 8
        9, 1 2 3 4 5 6 7 8 9
        10, 1 2 3 4 5 6 7 8 9 10*/


// Gabriel Apolinário Fabrício
public class Ex26 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d, ", i);
            for (int x = 1; x <= i; x++) {
                System.out.printf("%d ", x);
            }
            i++;
            System.out.println();
        }
    }
}
