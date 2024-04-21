/*7 - Crie um arquivo chamado Saudacao.java. Implemente um programa em Java que declare uma
variável chamada hora. Essa variável deve armazenar a hora do dia. Esse programa deve exibir a
mensagem Zzzzz se a hora estiver no intervalo [0, 6], Bom dia se a hora estiver no intervalo [7, 11],
Boa tarde se a hora estiver no intervalo [12, 17] ou Boa noite se a hora estiver no intervalo [18, 23].
Dê a opção do usuário informar a hora manualmente ou gerar a hora aleatoriamente, sempre
fazendo todas as validações necessárias.*/

import java.util.Random;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja informar o horario manualmente ou gerar uma hora aleatória? 1 - Manualmente ou 2 - Aleatoriamente");
        int decisao = scanner.nextInt();
        int hora;
        if (decisao == 1) {
            System.out.println("Qual horario deseja informar? (entre 0 e 23)");
            hora = scanner.nextInt();
            System.out.println(hora < 0 || hora > 23 ? "ERRO! Digite o valor corretamente!" : hora <= 6 ? "Zzzzz" : hora <= 11 ? "Bom dia!" :
                    hora <= 17 ? "Boa tarde!" : "Boa noite!");
        } else if(decisao == 2) {
            Random num = new Random();
            hora = num.nextInt(23);
            System.out.println("Hora gerada pelo computador: " + hora);
            System.out.println(hora <= 6 ? "Zzzzz" : hora <= 11 ? "Bom dia!" : hora <= 17 ? "Boa tarde!" : "Boa noite!");
        } else {
            System.out.println("ERRO! Digite o valor corretamente!");
        }
        scanner.close();
    }
}
