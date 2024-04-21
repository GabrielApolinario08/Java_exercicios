/*5) [POO-005] Baseado no exercício anterior, crie uma nova versão, que calcula as raízes de uma equação do
        segundo grau: ax² + bx + c = 0. Para ela existir, o coeficiente 'a' deve ser diferente de zero. Caso o delta seja
        maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as reais serão complexas e da forma,
        assim retorne zero.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex05 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o valor de a: (diferente de zero)");
            a = scanner.nextDouble();
            if (a != 0) {
                System.out.println("Digite o valor de b: ");
                b = scanner.nextDouble();
                System.out.println("Digite o valor de c: ");
                c = scanner.nextDouble();
                break;
            }
        }


        System.out.println("x' é " + raizes(a, b, c)[0] + ".");
        System.out.println("x'' é " + raizes(a, b, c)[1] + ".");
    }

    static double[] raizes(double a, double b, double c) {
        double[] xs = new double[2];
        double delta, x1, x2;
        delta = Math.pow(b, 2) - (4 * a * c);
        if (!(delta < 0)) {
            delta = Math.sqrt(delta);
            x1 = (-b + delta) / 2 * a;
            x2 = (-b - delta) / 2 * a;
            xs[0] = x1;
            xs[1] = x2;
        }
        return xs;
    }
}