/*2) Declarar uma variável do tipo String com seu valor inicial igual a branco (“”) e a
        seguir atribuir as letras maiúsculas do alfabeto (ABCDE...Z), uma-a-uma, as primeiras
        vinte e seis posições da variável String. Imprimir o resultado.*/

// Gabriel Apolinário Fabrício
public class Ex02 {
    public static void main(String[] args) {
        String alfabetoMaiusc = "";
        for (char i = 'A' ; i <= 'Z' ; i++) {
            alfabetoMaiusc += i;
        }
        System.out.println("Alfabeto maiúsculo: " + alfabetoMaiusc);
    }
}