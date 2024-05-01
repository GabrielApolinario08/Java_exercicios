import java.util.Scanner;

/*7) [POO-012] Crie um programa que pergunte ao usuário se ele deseja lançar/jogar um dado. Por meio de
        um método chamado dado(), retorne, através de sorteio aleatório, um número de 1 até 6. O programa
        deve ser executado enquanto o usuário quiser continuar jogando o dado.
        Entrada:                    Saída:
            Jogar o dado [s/n]: s       Saiu: 4
            Jogar o dado [s/n]: s       Saiu: 3
            Jogar o dado [s/n]: s       Saiu: 1
            Jogar o dado [s/n]: n
            Jogar o dado [s/n]: s       Saiu: 6
            Jogar o dado [s/n]: n
            Jogar o dado [s/n]: n*/
//Gabriel Apolinário Fabrício
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogar o dado [s/n]: ");
        String opc = scanner.nextLine();
        if (opc.equals("s")) {
            System.out.println("Saiu: " + dado());
        }
    }

    static int dado() {
        return ((int)(Math.random() * 6) + 1);
    }
}