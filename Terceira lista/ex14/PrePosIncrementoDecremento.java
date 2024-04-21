package ex14;

// 14 - Crie um arquivo chamado PrePosIncrementoDecremento.java. Complete o código, substituindo
// a seqüência “xxxxx” com os operadores de incremento e decremento. O programa deve exibir os
// valores 1, 3, 3 e 1 nessa ordem. Não é necessário preencher todas as seqüências.
// class PrePosIncrementoDecremento {
//     public static void main(String[] args) {
//         int a = 1;
//         System.out.println( xxxxx a xxxxx );
//         System.out.println( xxxxx a xxxxx );
//         System.out.println( xxxxx a xxxxx );
//         System.out.println( xxxxx a xxxxx );
//     }
// }

// Gabriel Apolinário Fabrício
public class PrePosIncrementoDecremento {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
    }
}
