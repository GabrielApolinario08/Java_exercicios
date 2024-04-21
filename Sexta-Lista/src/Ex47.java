/*47)Imprima somente os números primos existentes na faixa de um 1 até 100.*/

// Gabriel Apolinário Fabrício
public class Ex47 {
    public static void main(String[] args) {
        int cont = 2;
        while (cont <= 100) {
            if (isPrime(cont)) {
                System.out.printf("%d - ", cont);
            }
            cont++;
        }
        System.out.print("FIM!");
    }

    public static boolean isPrime(int cont) {
        if (cont <= 1) {
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(cont) ; i++) {
            if (cont % i == 0) {
                return false;
            }
        }
        return true;
    }

}
