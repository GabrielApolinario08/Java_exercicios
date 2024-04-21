/*19) O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque.
        Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS
        MERCADORIAS (S/N)?’. Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em
        estoque.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner opc = new Scanner(System.in);
        int numeroMercadorias, cont = 0;
        double valorMercadoria = 0;
        while (true) {
            cont++;
            System.out.print("Informe o valor da mercadoria: R$");
            valorMercadoria += scanner.nextDouble();

            System.out.print("MAIS MERCADORIAS (S/N)?");
            String continuar = opc.nextLine();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }
        System.out.printf("Valor total em estoque: R$%.2f\nMédia dos valores de cada mercadoria: R$%.2f", valorMercadoria, valorMercadoria / cont);
    }
}
