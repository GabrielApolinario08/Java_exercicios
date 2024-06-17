/*7) Escrever uma classe ModeloDeComputador que encapsule valores que definam a configuração de um
        microcomputador (tipo de processador, memória RAM, tamanho do disco rígido, tamanho do monitor, por
        exemplo). Essa classe deve ter um método calcularPreco que calculará o preço do computador como sendo
        a soma do custo de seus componentes:
        • Placa-mãe: R$800
        • Opções de processadores: 1600Mhz a R$700, 1800Mhz a R$830, 1900Mhz a R$910
        • Opções de memória: 1GB, 2GB, 4GB, 6GB ou 8GB, cada 1GB custa R$350.
        • Opções de disco rígido: 500 GB a R$300, 1 TB a R$420, 2TB a R$500.
        • Opções de monitor: 15 polegadas a R$320, 17 polegadas a R$520.*/


//Gabriel Apolinário Fabrício
package ex07;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ModeloDeComputador modeloDeComputador= new ModeloDeComputador();
        int opcProcessador, opcMemoria, opcDisco, opcMonitor;
        System.out.println("INFORME A CONFIGURAÇÂO DESEJADA: ");
        System.out.println("PROCESSADORES");
        System.out.println("(1)1600Mhz");
        System.out.println("(2)1800Mhz");
        System.out.println("(3)1900Mhz");
        System.out.println("Digite 1, 2 ou 3 para a opçao desejada: ");
        opcProcessador = scanner.nextInt();
        modeloDeComputador.setProcessador(opcProcessador == 1 ? 1600 : opcProcessador == 2 ? 1800 : 1900);

        System.out.println("MEMÓRIAS");
        System.out.println("(1)1GB");
        System.out.println("(2)2GB");
        System.out.println("(3)4GB");
        System.out.println("(4)6GB");
        System.out.println("(5)8GB");
        System.out.println("Digite 1, 2, 3, 4 ou 5 para a opçao desejada: ");
        opcMemoria = scanner.nextInt();
        modeloDeComputador.setMemoria(opcMemoria == 1 ? 1 : opcMemoria == 2 ? 2 : opcMemoria == 3 ? 4 : opcMemoria == 4 ? 6 : 8);

        System.out.println("DISCOS");
        System.out.println("(1)500GB");
        System.out.println("(2)1TB");
        System.out.println("(3)2TB");
        System.out.println("Digite 1, 2 OU 3 para a opçao desejada: ");
        opcDisco = scanner.nextInt();
        modeloDeComputador.setDisco(opcDisco == 1 ? 500 : opcDisco == 2 ? 1 : 2);

        System.out.println("MONITORES");
        System.out.println("(1)15 Polegadas");
        System.out.println("(2)17 Polegadas");
        System.out.println("Digite 1 ou 2 para a opçao desejada: ");
        opcMonitor = scanner.nextInt();
        modeloDeComputador.setMonitor(opcMonitor == 1 ? 15 : 17);

        System.out.printf("Preço da configuração: R$%.2f", modeloDeComputador.calcularPreco());
    }
}
