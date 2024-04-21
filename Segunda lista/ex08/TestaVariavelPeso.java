package ex08;

// 8 - Crie um arquivo chamado TestaVariavelPeso.java. Implemente um programa em Java que
// declare uma variável do tipo double chamada peso. Essa variável deve ser inicializada com o valor
// do seu peso. No final, exiba o valor dessa variável na saída padrão usando o println() e o printf().

// Gabriel Apolinário Fabrício
public class TestaVariavelPeso {
    public static void main(String[] args) {
        double peso = 62;
        System.out.println("Meu peso utilizando println: " + peso + "kg");
        System.out.printf("%s%2f%s", "Meu peso utilizando printf: ", peso, "kg");
    }
}
