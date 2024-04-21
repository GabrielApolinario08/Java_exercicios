package ex07;

// 7-Crie um arquivo chamado OverflowUnderflow.java.Complete o código,substituindo a seqüência“xxxxx”com valores literais.O programa deve exibir os números-2147483648 e 2147483647 nessa ordem.
// public class OverflowUnderflow {
//     public static void main(String[] args) {
//         System.out.println(xxxxx + 1);
//         System.out.println(xxxxx - 1);
//     }
// }

// Gabriel Apolinário Fabrício
public class OverflowUnderflow {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);
    }
}
