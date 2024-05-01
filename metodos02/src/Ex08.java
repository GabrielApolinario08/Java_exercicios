/*8) [POO-013] Utilizando o método dado(), criado no exercício [POO-012], lance o dado 1 milhão de vezes.
        Conte quantas vezes cada número saiu. A probabilidade deu certo? Ou seja, a porcentagem dos números
        foi parecida?
        Saída:
            1: 166666 - 16.67%
            2: 166667 - 16.67%
            3: 166667 - 16.67%
            4: 166666 - 16.67%
            5: 166669 - 16.67%
            6: 166665 - 16.67%*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex08 {
    public static void main(String[] args) {
        dado();
    }

    static void dado() {
        int[] contagem = new int[6];
        for (int i = 0 ; i < 1000000 ; i++) {
            int num = ((int)(Math.random() * 6) + 1);
            if (num == 1) {
                contagem[0] += 1;
            } else if (num == 2) {
                contagem[1] += 1;
            } else if (num == 3) {
                contagem[2] += 1;
            } else if (num == 4) {
                contagem[3] += 1;
            } else if (num == 5) {
                contagem[4] += 1;
            } else {
                contagem[5] += 1;
            }
        }

        System.out.printf("1: %d - %.2f%%\n", contagem[0], (double)contagem[0] * 100 / 1000000);
        System.out.printf("2: %d - %.2f%%\n", contagem[1], (double)contagem[0] * 100 / 1000000);
        System.out.printf("3: %d - %.2f%%\n", contagem[2], (double)contagem[0] * 100 / 1000000);
        System.out.printf("4: %d - %.2f%%\n", contagem[3], (double)contagem[0] * 100 / 1000000);
        System.out.printf("5: %d - %.2f%%\n", contagem[4], (double)contagem[0] * 100 / 1000000);
        System.out.printf("6: %d - %.2f%%\n", contagem[5], (double)contagem[0] * 100 / 1000000);

    }
}