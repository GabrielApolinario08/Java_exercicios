/*8) Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
iniciar em um dia e terminar no dia seguinte.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hora de início da partida: ");
        int inicio = scanner.nextInt();
        System.out.println("Hora do fim da partida: ");
        int fim = scanner.nextInt();
        scanner.close();

        int tempoPartida;
        if (inicio < fim) {
            tempoPartida = fim - inicio;
            System.out.println("Duração da partida: " + tempoPartida + " horas.");
        } else {
            tempoPartida = (fim - inicio) + 24;
            System.out.println("Duração da partida: " + tempoPartida + " horas.");
        }

    }
}
