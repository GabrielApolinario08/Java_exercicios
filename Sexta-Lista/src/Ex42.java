/*42) Construa um programa para mostrar o fatorial dos números inteiros na
        faixa de 1 a 10.*/

// Gabriel Apolinário Fabrício
public class Ex42 {
    public static void main(String[] args) {
        int i = 1, resultado = 1, fatorial = 0;
        System.out.printf("%d! -> ", i);
        System.out.printf("%d\n", i);
        i++;
        while (i <= 10) {
            System.out.printf("%d! -> ", i);
            fatorial = i;
            while (true) {
                System.out.printf("%d * ", fatorial);
                resultado = resultado * fatorial;
                if (fatorial == 2) {
                    fatorial--;
                    System.out.printf("%d = %d\n", fatorial, resultado);
                    resultado = 1;
                    break;
                }
                fatorial--;
            }
            i++;
        }
    }
}
