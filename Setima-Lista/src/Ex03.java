/*3) Declarar uma variável do tipo String com seu valor inicial igual a branco (“”) e a
        seguir atribuir as letras minúsculas do alfabeto (abcde...z), uma-a-uma, as primeiras
        vinte e seis posições da variável String. Imprimir o resultado.*/

// Gabriel Apolinário Fabrício
public class Ex03 {
    public static void main(String[] args) {
        String alfabetoMinusc = "";

        for (char i = 'a' ; i <= 'z' ; i++) {
            alfabetoMinusc += i;
        }
        System.out.println("Alfabeto minúsculo: " + alfabetoMinusc);
    }
}