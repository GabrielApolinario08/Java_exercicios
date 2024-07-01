package ex06;
/*

6) Implemente um sistema para controle de um Colégio particular, onde um professor
        ministra várias disciplinas para uma sala (composta por vários alunos).
        a. Cada Pessoa é identificada por seu nome e sua idade.
        b. Os Alunos estão em um curso (fundamental, médio, infantil, etc) e pagam uma
        mensalidade.
        c. Os Professores recebem um salário e ministram disciplinas.
        d. As Salas tem um nome ou descrição (1A, 1B, 2D, etc) e tem a quantidade de
        pessoas que fazem parte dela, exemplo 21 pessoas, 20 alunos e um professor.
        e. Crie as classes Pessoa, Aluno, Professor, Sala e Colegio, conforme descrito na
        figura 2.
        f. A classe Colegio é a classe principal, onde será possível listar e/ou cadastrar as
        Salas (criar um vetor de salas), usando polimorfismo, o professor e/ou os alunos
        de cada sala.
        g. Note alguns itens para facilitar: os métodos toString() para facilitar as
        impressões e a instanciação dos métodos construtores para cada uma das
        classe exceto a principal. Para tanto se utilize, em pelo menos um dos casos de
        criação de objetos (instanciação), o segundo método construtor.
        h. Para cadastro das disciplinas na classe Professor, utilize o código abaixo:
public void setDisciplina( String disciplina ) {
        for (int i = 0 ; i < this.disciplina.length ; i++ ) {
        if ( this.disciplina[i] == null ) {
        this.disciplina[i] = disciplina;
        return;
        }
        }
        }
        i. Extra: criar uma solução para os administradores do colégio verifiquem a
        rentabilidade de cada sala e do colégio.
*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Colegio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sala[] salas = new Sala[100];
        int opc, qtdSala = 0;
        do {
            System.out.println(menu());
            System.out.print("Sua escolha: ");
            opc = scanner.nextInt();
            switch (opc) {
                case 1 -> {
                    cadastrarSala(salas, qtdSala);
                    qtdSala++;
                }
                case 2 -> cadastrarProfessor(salas);
                case 3 -> cadastrarAluno(salas);
                case 4 -> listarSalas(salas);
                case 5 -> listarProfessores(salas);
                case 6 -> listarAlunos(salas);
                case 7 -> verificarRentabilidade(salas);
                case 8 -> System.out.println("Encerrado.");
            }
        } while (opc != 8);
    }

    public static String menu() {
        return """
                -----Cólegio Particular------
                    [1] Cadastrar Sala
                    [2] Cadastrar Professor 
                    [3] Cadastrar Aluno
                    [4] Listar Salas
                    [5] Listar Professores
                    [6] Listar Alunos
                    [7] Rentabilidade
                    [8] Encerrar""";
    }

    public static void cadastrarSala(Sala[] salas, int qtdSala) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String nomeSala;
        System.out.println("Nome da sala: ");
        nomeSala = scannerStr.next();
        System.out.println("Quantidade máxima de pessoas na sala: ");
        salas[qtdSala] = new Sala(scanner.nextInt());
        salas[qtdSala].setNome(nomeSala);
        System.out.println("Sala Cadastrada Com Sucesso!");
    }
    public static void cadastrarProfessor(Sala[] salas) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        Professor professor;
        int numSala, idade, qtdDisc;
        String nome;
        double salario;
        if (salas[0] == null) {
            System.out.println("Nenhuma sala cadastrada!");
        } else {
            listarSalas(salas);
            System.out.print("Número da sala escolhida para cadastrar o professor: ");
            numSala = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nome do professor: ");
            nome = scannerStr.nextLine();
            System.out.println("Idade do professor: ");
            idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Salário do professor: ");
            salario = scanner.nextDouble();
            scanner.nextLine();
            professor = new Professor(nome, idade, salario);
            System.out.println("Quantidade de disciplinas deste professor: ");
            qtdDisc = scanner.nextInt();
            for (int i = 0 ; i < qtdDisc ; i++) {
                System.out.println("Nome da " + (i + 1) + "° disciplina: ");
                professor.setDisciplina(scannerStr.next());
            }
            salas[numSala - 1].setPessoa(professor);

            System.out.println("Professor cadastrado com sucesso!");
        }
    }
    public static void cadastrarAluno(Sala[] salas) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        Aluno aluno;
        int numSala, idade;
        String nome, curso;
        double mensalidade;
        if (salas[0] == null) {
            System.out.println("Nenhuma sala cadastrada!");
        } else {
            listarSalas(salas);
            System.out.print("Número da sala escolhida para cadastrar o aluno: ");
            numSala = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nome do aluno: ");
            nome = scannerStr.nextLine();
            System.out.println("Idade do aluno: ");
            idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Curso do aluno: ");
            curso = scannerStr.nextLine();
            System.out.println("Mensalidade paga pelo aluno: ");
            mensalidade = scanner.nextDouble();
            scanner.nextLine();
            aluno = new Aluno(nome, idade, curso, mensalidade);
            salas[numSala - 1].setPessoa(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        }
    }

    public static void listarSalas(Sala[] salas) {
        if (salas[0] == null) {
            System.out.println("Nenhuma sala cadastrada!");
        } else {
            System.out.println("Lista de todas as salas!");
            for (int i = 0 ; i < salas.length ; i++) {
                if (salas[i] != null) {
                    System.out.println((i + 1) + ") " + salas[i]);
                } else {
                    return;
                }

            }
        }
    }

    public static void listarProfessores(Sala[] salas) {
        Scanner scanner = new Scanner(System.in);
        boolean temProf = false;
        int numSala;
        if (salas[0] == null) {
            System.out.println("Nenhuma sala cadastrada!");
        } else {
            listarSalas(salas);
            System.out.print("Número da sala escolhida para listar o professor: ");
            numSala = scanner.nextInt();
            for (Pessoa pessoa:salas[numSala - 1].getPessoa()) {
                if (pessoa instanceof Professor) {
                    System.out.println("Professor: " + pessoa);
                    temProf = true;
                }
            }
            if (!temProf) System.out.println("Nenhum professor cadastrado!");
        }
    }


    public static void listarAlunos(Sala[] salas) {
        Scanner scanner = new Scanner(System.in);
        boolean temAluno = false;
        int numSala;
        if (salas[0] == null) {
            System.out.println("Nenhuma sala cadastrada!");
        } else {
            listarSalas(salas);
            System.out.print("Número da sala escolhida para listar os alunos: ");
            numSala = scanner.nextInt();

                for (Pessoa pessoa:salas[numSala - 1].getPessoa()) {
                    if (pessoa instanceof Aluno) {
                        System.out.println("Aluno: " + pessoa);
                        System.out.println();
                        temAluno = true;
                    }
                }
                if (!temAluno) System.out.println("Nenhum aluno cadastrado!");

        }
    }

    public  static void verificarRentabilidade(Sala[] salas) {
        double totMensalidade = 0, totSalario = 0, rentColegio = 0;
        int cont = -1;
        double[] totSala = new double[salas.length];

        if (salas[0] == null) {
            System.out.println("Rentabilidade: R$ 0, pois não existe sala cadastrada!");
            return;
        }
        System.out.println("Rentabilidade de cada sala!");
        for(Sala sala:salas) {
            if (sala == null) break;
            cont++;
            for (Pessoa pessoa:sala.getPessoa()) {
                if (pessoa instanceof Professor) {
                    totSalario += ((Professor) pessoa).getSalario();
                } else if (pessoa instanceof Aluno){
                    totMensalidade += ((Aluno) pessoa).getMensalidade();
                } else if (sala.getPessoa()[0] == null){
                    break;
                }
            }
            totSala[cont] -= totSalario;
            totSala[cont] += totMensalidade;
            System.out.println("\t" + (cont + 1) + ") Rentabilidade sala " + sala.getNome() + ": R$" + totSala[cont]);
            rentColegio += totSala[cont];
            totSalario = totMensalidade = 0;
        }
        System.out.println("\nRentabilidade total do colégio: R$" + rentColegio);
    }

}
