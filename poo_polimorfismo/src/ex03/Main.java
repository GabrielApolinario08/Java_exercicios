package ex03;

import java.util.ArrayList;
import java.util.Scanner;

/*3) Uma empresa de recursos humanos, especializada em recolocações no mercado
        (vagas de emprego), solicita a criação de um sistema para informatizar suas ações.
        Assim, ela deseja cadastrar os candidatos com seu nome (String) e idade (int). Os
        candidatos podem ser desempregados, que tem o tempo em meses (int) que não
        trabalha ou empregados, que tem o nome da empresa (String), onde está atualmente.
        As vagas tem a descrição (String) e o salário oferecido (double). As vagas podem ser
        de estágio, que em o tempo em meses (int) ou contrato, que pode ser temporário ou
        não (boolean). Criar um programa em Java para cadastrar os candidatos
        (desempregados ou empregados) e cadastrar as vagas (estágio ou contrato). O
        sistema deve ser capaz de cadastrar os candidatos para as vagas.
        Criar uma classe para criar a empresa de RH (main). Nesta classe deverá haver um
        menu para cadastrar candidatos, cadastrar vagas, cadastrar candidato x vaga, listar
        vagas por tipo, mostrar quantidade de candidatos e sua situação e os candidatos x
        vaga.*/

//Gabriel Apolinário Fabrício
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Candidato> candidatos = new ArrayList<>();
        ArrayList<Vaga> vagas = new ArrayList<>();
        ArrayList<RelacaoCandidatoVaga> relacaoCandidatoVaga = new ArrayList<>();
        int opc;
        do {
            System.out.println("--Menu--");
            System.out.println("[1] Cadastrar Candidato");
            System.out.println("[2] Cadatrar Vaga");
            System.out.println("[3] Cadastrar Relação entre o candidato e a Vaga");
            System.out.println("[4] Listar Vagas por Tipo");
            System.out.println("[5] Quantidade de Candidatos e suas Situações");
            System.out.println("[6] Relação entre o Candidato e a Vaga");
            System.out.println("[7] Preecher Vaga (Contratar)");
            System.out.println("[8] Sair");
            System.out.print("Sua escolha: ");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    cadastraCandidato(candidatos);
                    break;
                case 2:
                    cadastrarVaga(vagas);
                    break;
                case 3:
                    cadastrarRelacao(relacaoCandidatoVaga, vagas, candidatos);
                    break;
                case 4:
                    listarVagas(vagas);
                    break;
                case 5:
                    listarSituacaoCandidatos(candidatos);
                    break;
                case 6:
                    mostrarRelacao(relacaoCandidatoVaga);
                    break;
                case 7:
                    preecherVaga(relacaoCandidatoVaga);
                    break;
                case 8:
                    System.out.println("Encerrado.");
                    break;

                default:
                    System.out.println("[ERRO] Escolha um número do menu!");
                    break;
            }

        }while (opc != 8);
    }

    static void cadastraCandidato(ArrayList<Candidato> candidatos) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        Candidato candidato;
        System.out.println("Nome do candidato: ");
        String nome = scannerStr.nextLine();
        System.out.println("Idade do candidato: ");
        int idade = scanner.nextInt();
        System.out.println("Candidato empregado ou desempregado? [e/d]");
        if (scannerStr.nextLine().equalsIgnoreCase("e")) {
            System.out.println("Nome da empresa que trabalha: ");
            String nomeEmpresa = scannerStr.nextLine();
            candidato = new Empregado(nome, idade, nomeEmpresa);
        } else {
            System.out.println("Tempo desempregado: [meses]");
            int tempoDesen = scanner.nextInt();
            candidato = new Desempregado(nome, idade, tempoDesen);
        }
        candidatos.add(candidato);
    }

    static void cadastrarVaga(ArrayList<Vaga> vagas) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        Vaga vaga;
        System.out.println("Qual a descrição da vaga: ");
        String descricao = scannerStr.next();
        System.out.println("Salário ofereido pela vaga: ");
        double salario = scanner.nextDouble();
        System.out.println("Vaga de estágio ou contrato? [e/c]");
        if (scannerStr.next().equalsIgnoreCase("e")) {
            System.out.println("Tempo de duração do estágio: [meses]");
            int tempo = scanner.nextInt();
            vaga = new Estagio(tempo, descricao, salario);
        } else {
            System.out.println("Contrato temporario: [s/n]");
            boolean temp = scannerStr.next().equalsIgnoreCase("s");
            vaga = new Contrato(temp, descricao, salario);
        }
        vagas.add(vaga);
    }

    static void cadastrarRelacao(ArrayList<RelacaoCandidatoVaga> relacaoCandidatoVaga, ArrayList<Vaga> vagas, ArrayList<Candidato> candidatos) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        System.out.println("Escolha Uma Vaga: ");
        listarVagas(vagas);
        System.out.println("Número da Vaga Escolhida: ");
        int numVaga = scanner.nextInt();

        System.out.println("Escolha Um Candidato: ");
        listarCandidatos(candidatos);
        System.out.println("Número do Candidato Escolhido: ");
        int numCandidato = scanner.nextInt();

        System.out.println("Adicionar o Candidato a Vaga? [s/n]");
        boolean opc = scannerStr.next().equalsIgnoreCase("s");
        if (opc) {
            relacaoCandidatoVaga.add(new RelacaoCandidatoVaga(candidatos.get(numCandidato - 1), vagas.get(numVaga - 1), false));
            System.out.println("Candidato Adicionado com Sucesso!");
        } else {
            System.out.println("Candidato Não Adicionado.");
        }
    }

    static void listarVagas(ArrayList<Vaga> vagas) {
        System.out.println("Lista de Vagas!");
        for (int i = 0 ; i < vagas.toArray().length ; i++) {
            System.out.println((i + 1) + ") " + vagas.get(i).toString() + " | Tipo da vaga: " + (vagas.get(i) instanceof Estagio ? "Estágio" : "Contrato"));
        }
    }

    static void listarCandidatos(ArrayList<Candidato> candidatos) {
        System.out.println("Lista de Candidatos!");
        for (int i = 0 ; i < candidatos.toArray().length ; i++) {
            System.out.println((i + 1) + ") " + candidatos.get(i).toString());
        }
    }

    static void listarSituacaoCandidatos(ArrayList<Candidato> candidatos) {
        System.out.println("Situação dos Candidatos!");
        for (Candidato candidato : candidatos) {
            System.out.println((candidatos.indexOf(candidato) + 1) + ") " + candidato + " [Situação: " + (candidato instanceof Empregado ? "Empregado" : "Desempregado") + "]");
        }
    }

    static void mostrarRelacao(ArrayList<RelacaoCandidatoVaga> relacaoCandidatoVaga) {
        System.out.println("Relação Entre Candidato e Vaga!");
        for (RelacaoCandidatoVaga relacao:relacaoCandidatoVaga) {
            System.out.println((relacaoCandidatoVaga.indexOf(relacao) + 1) + ") " + relacao);
        }
    }

    static void preecherVaga(ArrayList<RelacaoCandidatoVaga> relacaoCandidatoVaga) {
        Scanner scanner = new Scanner(System.in);
        mostrarRelacao(relacaoCandidatoVaga);
        System.out.print("Escolha Uma Relação Para Contratar: ");
        int escolha = scanner.nextInt();
        for (RelacaoCandidatoVaga relacao:relacaoCandidatoVaga) {
            if (relacaoCandidatoVaga.indexOf(relacao) == (escolha - 1)) {
                relacao.setContratado(true);
            }
        }
    }
}
