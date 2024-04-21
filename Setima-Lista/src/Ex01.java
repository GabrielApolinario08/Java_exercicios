/*1) Exibir na tela os caracteres da tabela de códigos ASCII (American Standard Code for
        Information Interchange).*/

// Gabriel Apolinário Fabrício
public class Ex01 {
    public static void main(String[] args) {
        for(int i = 0; i <= 255 ; i++) {
            System.out.println("Cod. ASCII = " + i + " | Caractere = " + (char)i);
        }
    }
}