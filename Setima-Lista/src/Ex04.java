/*4) Declarar uma variável do tipo String com seu valor inicial igual a branco (“”) e a
        seguir atribuir os caracteres numéricos (0123456789), um-a-um, as primeiras dez
        posições da variável String. Imprimir o resultado.*/

// Gabriel Apolinário Fabrício
public class Ex04 {
    public static void main(String[] args) {
        String numeros = "";
        for (char i = '0';i <= '9'; i++) {
            numeros += i;
        }
        System.out.println("Números: " + numeros);
    }
}