/*53) Imprima os números da sequência de Fibonacci que estão presentes na faixa de 1
        até 250.*/

// Gabriel Apolinário Fabrício
public class Ex53 {
    public static void main(String[] args) {
        int n1, n2 , n3;
        n1 = 1;
        n2 = 1;
        n3 = n1 + n2;
        while (n1 <= 250) {
            System.out.printf("%d - ", n1);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        System.out.printf("FIM!");
    }
}
