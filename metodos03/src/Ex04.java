/*4) [POO-017] Um professor, muito legal, fez 3 provas durante um semestre, mas só vai levar em conta as
        duas notas mais altas para calcular a média. Crie um programa que solicite ao usuário o valor double das 3
        notas, mostre como seria a média com essas 3 provas, a média com as 2 notas mais altas, bem como a nota
        mais alta e a nota mais baixa. Tente criar apenas um método para retornar essas médias. Este método
        deverá receber as 3 notas como parâmetros de entrada e retornar os valores solicitados. As notas devem
        ser de zero a dez e qualquer valor diferente deverá ser desconsiderado, assumindo zero.
        Entrada: Saída: Cálculo:
        Entre com a nota 1: 6 Média maiores: 7 [ (6 + 8) / 2 ]
        Entre com a nota 2: 8 Média aritmética: 6 [ (6 + 8 + 4) / 3 ]
        Entre com a nota 3: 4 Maior nota: 8 [ 6, 8, 4 ]
        Menor nota: 4 [ 6, 8, 4 ]
        Entre com a nota 1: 6 Média maiores: 7 [ (6 + 8) / 2 ]
        Entre com a nota 2: 8 Média aritmética: 4,7 [ (6 + 8 + 0 ) / 3 ]
        Entre com a nota 3: 14 Maior nota: 8 [ 6, 8, 0 ]
        Menor nota: 0 [ 6, 8, 0 ]*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("entre com a nota: ");
        n1 = scanner.nextDouble();
        System.out.println("entre com a nota: ");
        n2 = scanner.nextDouble();
        System.out.println("entre com a nota: ");
        n3 = scanner.nextDouble();
        if (!(n1 >= 0) || !(n1 <= 10)) {
            n1 = 0;
        }
        if (!(n2 >= 0) || !(n2 <= 10)) {
            n2 = 0;
        }
        if (!(n3 >= 0) || !(n3 <= 10)) {
            n3 = 0;
        }
        System.out.println(calcula(n1, n2, n3));
    }

    static String calcula(double n1, double n2, double n3) {
        double maiorNota = Math.max((Math.max(n1, n2)), n3);
        double menorNota = Math.min((Math.min(n1, n2)), n3);
        double mediaNota = n1 == maiorNota ? (n2 == menorNota ? n3 : n2) : (n2 == maiorNota ? (n3 == menorNota ? n1 : n3) : n1 == menorNota ? n2 : n1);
        return "Média maiores: " + ((maiorNota + mediaNota) / 2) + "\nMédia Aritmética: " + ((maiorNota + mediaNota + menorNota) / 3) + "\nMaior nota: " + maiorNota + "\nMenor nota: " + menorNota;
    }
}