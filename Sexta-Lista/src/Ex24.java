/*24) Escreva um programa em Java que imprima a tabuada do 1 ao 10, para os números de 0 a 10*/

// Gabriel Apolinário Fabrício
public class Ex24 {
    public static void main(String[] args) {
        int cont = 1;
        while (cont <= 10) {
            System.out.println("Tabuada do " + cont);
            System.out.println("==============================");
            for(int i = 0 ; i <= 10 ; i++) {
                System.out.printf("%d x %d = %d\n", cont, i, cont * i);
            }
            System.out.println("==============================");
            cont++;
        }
    }
}
