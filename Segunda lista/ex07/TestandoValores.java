package ex07;

// 7 – Indique os tipos da linguagem Java que aceitam cada valor da lista abaixo. 
// a. "Bom dia" -> String
// b. 3 -> byte, short, int, long, float e double 
// c. 235.13 -> float e double
// d. true -> boolean
// e. -135 -> short, int, long, float e double
// f. 256.23F -> float, double
// g. 'A' -> char
// h. 6463275245745L -> long, float e double
// Obs: faça os testes necessários com um programa escrito em Java para identificar os tipos.

// Gabriel Apolinário Fabrício
public class TestandoValores {
    public static void main(String[] args) {
        String valor01 = "Bom dia";
        byte valor02 = 3;
        double valor03 = 235.13;
        boolean valor04 = true;
        short valor05 = -135;
        double valor06 = 235.23F;
        char valor07 = 'A';
        long valor08 = 6463275245745L;
        System.out.println(valor01);
        System.out.println(valor02);
        System.out.println(valor03);
        System.out.println(valor04);
        System.out.println(valor05);
        System.out.println(valor06);
        System.out.println(valor07);
        System.out.println(valor08);

    }
}
