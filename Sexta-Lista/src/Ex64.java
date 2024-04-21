// 64) Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a soma dos termos.
import java.util.Scanner;;
// Gabriel Apolinário Fabrício
public class Ex64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int termos, cont = 0, n1 = 0, n2 = 1, n3 = n2 + n1, primo = 2, i;
        double soma = 0;
        System.out.println("Quantos termos deseja mostrar: ");
        termos = scanner.nextInt();
        while (cont < termos) {
            soma += (double)n2 / primo;
            System.out.printf("%d/%d - ", n2, primo);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;

            primo++;
            while (true) {
                for (i = 2; i <= Math.sqrt(primo) ; i++) {
                    if (primo % i == 0) {
                        break;
                    }
                }
                if (!(i <= Math.sqrt(primo))) {
                    break;
                }
                primo++;
            }
            cont++;
            soma -= (double)n2 / primo;
            System.out.printf("%d/%d + ", n2, primo);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;

            primo++;
            while (true) {
                for (i = 2; i <= Math.sqrt(primo) ; i++) {
                    if (primo % i == 0) {
                        break;
                    }
                }
                if (!(i <= Math.sqrt(primo))) {
                    break;
                }
                primo++;
            }
            cont++;
        }
        System.out.print("FIM!!");
        System.out.printf("\n\tSoma: %.3f\n", soma);
    }
}
