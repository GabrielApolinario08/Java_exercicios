package ex09;

// 9 - Crie um arquivo chamado TestaTiposPrimitivos.java. Implemente um programa em Java que
// declare uma variável de cada um dos tipos primitivos da linguagem Java. Essas variáveis devem ser
// inicializadas com valores adequados. Por fim, exiba os valores dessas variáveis na saída padrão.

// Gabriel Apolinário Fabrício
public class TestaTiposPrimitivos {
    public static void main(String[] args) {
        byte varByte = 127;
        short varShort = 32767;
        int varInt = 2147483647;
        long varLong = 922337203685475807L;
        float varFloat = 3.14f;
        double varDouble = 3.141592653589793;
        boolean varBoolean = false;
        char varChar = 'G';
        System.out.println("Valor byte: " + varByte);
        System.out.println("Valor short: " + varShort);
        System.out.println("Valor int: " + varInt);
        System.out.println("Valor long: " + varLong);
        System.out.println("Valor float: " + varFloat);
        System.out.println("Valor double: " + varDouble);
        System.out.println("Valor boolean: " + varBoolean);
        System.out.println("Valor char: " + varChar);
    }
}
