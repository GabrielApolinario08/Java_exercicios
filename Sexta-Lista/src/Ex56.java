/*56)Imprima os números perfeitos na faixa de 1 a 900.*/

// Gabriel Apolinário Fabrício
public class Ex56 {
    public static void main(String[] args) {
        int cont= 1, soma = 0;
        while (cont <= 900) {
            for (int i = 1 ; i < cont ; i++) {
                if (cont % i == 0) {
                    soma += i;
                }
            }
            if (soma == cont) {
                System.out.printf("%d - ", cont);
            }
            soma = 0;
            cont++;
        }
        System.out.print("FIM!");
    }
}
