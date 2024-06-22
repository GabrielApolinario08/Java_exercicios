package ex04;

/*4) Criar um projeto para uma locadora. Esta locadora deve poder alugar filmes, livros
        e jogos. O projeto deverá permitir o aluguel qualquer tipo de mídia citada
        anteriormente. Uma mídia é alugada para um Cliente e o Cliente devolve a mídia
        alugada. O cliente pode pagar no aluguel ou na devolução.
        a. Escreva uma classe para representar a Mídia que será alugada. A mídia tem: um
        código (int); uma descrição ou título (String); um tipo (String), que indica se é
        um CD, DVD, Blu-ray, Brochura, Cartucho ou Digital; um gênero (String); e valor
        (Double), que é o valor do aluguel.
        b. Escreva uma classe para representar o Filme, que é filho da mídia. O filme terá:
        uma classificação (String); e uma duração (int) em minutos.
        c. Escreva uma classe para representar o Livro, que, também é filho de mídia. O
        livro terá: um autor (String); uma editora (String); e uma edição (int).
        d. Escreva uma classe para representar o Jogo, que, também é filho de mídia. O
        jogo terá: console (String).
        e. Escreva uma classe para representar um Cliente. O cliente terá: código (int);
        nome (String); e idade (int).
        f. Escrever uma classe para representar o aluguel. Uma mídia é alugada para um
        cliente. Um cliente pode devolver uma mídia alugada. O aluguel pode ser pago
        no início ou no fim do processo. O dono da locadora deseja saber quanto ele
        recebeu e o cliente quanto tem para pagar.
        Faça todas as adaptações necessárias para que o aluguel e a devolução funcionem.
        Use vetores de objetos para alugar e devolver*/


import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Midia> midias = new ArrayList<Midia>();
        ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
        int opc = 0;
        do {
            System.out.println(menu());
            opc = scanner.nextInt();
            switch (opc) {
                case 1 -> cadastrarCliente(clientes);
                case 2 -> cadastrarMidia(midias);
                case 3 -> alugarMidia(clientes, midias, alugueis);
                case 4 -> System.out.println();
                case 5 -> pagarAluguel(alugueis);
                case 6 -> listarClientes(clientes);
                case 7 -> listarMidias(midias);
                case 8 -> listarAlugueis(alugueis);
                case 9 -> System.out.println("Encerrado.");
            }

        } while (opc != 9);
    }

    public static String menu() {
        return """
                --------------Locadora-----------
                    [1] Cadastrar Cliente
                    [2] Cadastrar Mídia
                    [3] Alugar Mídia
                    [4] Devolver Mídia Alugada
                    [5] Pagar Mídia Alugada
                    [6] Listar Todos os Clientes
                    [7] Listar Todas as Midias
                    [8] Listar Todos os Alugueis
                    [9] Encerrar 
                ---------------------------------  
                Sua Escolha: """;
    }

    public static void cadastrarCliente(ArrayList<Cliente> clientes) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        String nome, idadeStr;
        int idade;
        while (true) {
            try {
                System.out.println("Nome do Novo Cliente: ");
                nome = scannerStr.nextLine();

                System.out.println("Idade do Novo Cliente: (Deve ser maior que 18 anos!)");
                idadeStr = scanner.nextLine();
                idade = Integer.parseInt(idadeStr);

                clientes.add(new Cliente(clientes, nome, idade));
                break;
            } catch (Exception e) {
                System.out.println("ERRO! Insira os dados novamente!");
            }
        }
    }

    public static void cadastrarMidia(ArrayList<Midia> midias) {
        Scanner scannerStr = new Scanner(System.in);
        String opc;
        while (true) {
            try {
                System.out.println("Qual Mídia Deseja Cadastrar? ");
                System.out.println("\t[1] Filme");
                System.out.println("\t[2] Livro");
                System.out.println("\t[3] Jogo");
                opc = scannerStr.nextLine();
                if (Integer.parseInt(opc) < 1 || Integer.parseInt(opc) > 3) {
                    throw new IllegalArgumentException("São aceitas apenas as opções 1, 2 e 3.");
                }

                switch (Integer.parseInt(opc)) {
                    case 1 -> cadastrarMidiaEscolhida(midias, new Filme());
                    case 2 -> cadastrarMidiaEscolhida(midias, new Livro());
                    case 3 -> cadastrarMidiaEscolhida(midias, new Jogo());

                }
                break;
            } catch (Exception e) {
                System.out.println("ERRO! Insira os dados novamente!: " + e.getMessage());
            }
        }
    }

    public static void cadastrarMidiaEscolhida(ArrayList<Midia> midias, Midia midia) {
        Scanner scanner = new Scanner(System.in);
        String descricao, opcTipo, genero, valorAlugel;

        midia.setCodigo(midias);
        System.out.println("Descrição da Mídia: ");
        descricao = scanner.nextLine();
        if (descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser vazia.");
        }
        midia.setDescricao(descricao);
        System.out.println("Tipo da Mídia: ");
        System.out.println("\t[1] CD");
        System.out.println("\t[2] DVD");
        System.out.println("\t[3] Blue-Ray");
        System.out.println("\t[4] Brochura");
        System.out.println("\t[5] Cartucho");
        System.out.println("\t[6] Digital");
        System.out.print("Sua opção: ");
        opcTipo = scanner.nextLine();
        if (Integer.parseInt(opcTipo) < 1 && Integer.parseInt(opcTipo) > 6) {
            throw new IllegalArgumentException("São aceitas apenas as opções 1, 2, 3, 4 ,5 e 6.");
        }

        switch (Integer.parseInt(opcTipo)) {
            case 1 -> midia.setTipo("CD");
            case 2 -> midia.setTipo("DVD");
            case 3 -> midia.setTipo("Blue-Ray");
            case 4 -> midia.setTipo("Brochura");
            case 5 -> midia.setTipo("Cartucho");
            case 6 -> midia.setTipo("Digital");
        }
        System.out.println("Gênero da Mídia: ");
        genero = scanner.nextLine();
        if (genero.trim().isEmpty()) {
            throw new IllegalArgumentException("Gênero não pode ser vazio.");
        }
        midia.setGenero(genero);

        System.out.println("Valor do Aluguel: ");
        valorAlugel = scanner.nextLine();
        if (Double.parseDouble(valorAlugel) < 0) {
            throw new IllegalArgumentException("Valor no aluguel não pode ser negativo.");
        }
        midia.setValorAluguel(Double.parseDouble(valorAlugel));

        if (midia instanceof Filme) {
            String classificacao, duracao;
            System.out.println("Classificação do Filme: ");
            classificacao = scanner.nextLine();
            ((Filme) midia).setClassificacao(classificacao);
            System.out.println("Duração em Minutos: (Filme deve ter mais que 10 minutos)");
            duracao = scanner.nextLine();
            ((Filme) midia).setDuracaoMinutos(Integer.parseInt(duracao));
        } else if (midia instanceof Livro) {
            String autor, editora, edicao;
            System.out.println("Autor do livro: ");
            autor = scanner.nextLine();
            System.out.println("Editora do Livro: ");
            editora = scanner.nextLine();
            System.out.println("Edição do Livro: ");
            edicao = scanner.nextLine();
            ((Livro) midia).setAutor(autor);
            ((Livro) midia).setEditora(editora);
            ((Livro) midia).setEdicao(Integer.parseInt(edicao));

        } else {
            String console;
            System.out.println("Qual o Console Usado para o Jogo: ");
            console = scanner.nextLine();
            ((Jogo) midia).setConsole(console);
        }
        midias.add(midia);
        System.out.println("Mídia Candastrada Com Sucesso!");
        System.out.println(midia);
    }

    public static void alugarMidia(ArrayList<Cliente> clientes, ArrayList<Midia> midias, ArrayList<Aluguel> alugueis) {
        Scanner scanner = new Scanner(System.in);
        String opc;
        Aluguel aluguel = new Aluguel();
        while (true) {
            try {
                listarClientes(clientes);
                System.out.print("Digite o código do cliente que deseja alugar a mídia: ");
                opc = scanner.nextLine();
                for (Cliente cliente:clientes) {
                    if (cliente.getCodigo() == Integer.parseInt(opc)) {
                        aluguel.setCliente(cliente);
                    }
                }
                if (aluguel.getCliente() == null) throw new IllegalArgumentException("Cliente não encontrado.");

                listarMidias(midias);
                System.out.print("Digite o Código da Mídia que Deseja Alugar: ");
                opc = scanner.nextLine();
                for (Midia midia:midias) {
                    if (midia.getCodigo() == Integer.parseInt(opc)) {
                        aluguel.setMidia(midia);
                    }
                }
                if (aluguel.getMidia() == null) throw new IllegalArgumentException("Mídia não encontrada.");

                System.out.println("Efetuar Pagamento Antecipado do Aluguel? [s/n]");
                opc = scanner.nextLine().toLowerCase();
                if (opc.equals("s")) {
                    pagarAluguel(alugueis);
                } else if (!opc.equals("n")) {
                    throw new IllegalArgumentException("Digite apenas 's' para SIM ou 'n' para NÃO.");
                }
                System.out.println("Aluguel Concluido com Sucesso!");
                System.out.println(aluguel);
                alugueis.add(aluguel);
                break;
            } catch (Exception e) {
                System.out.println("Algum problema foi encontrado!\n" + e.getMessage());
            }
        }
    }

    public static void pagarAluguel(ArrayList<Aluguel> alugueis) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluguel> alugueisNaoPagos = new ArrayList<Aluguel>();
        String opc;
        while (true) {
            try {
                System.out.println("Lista de Alugueis Não Pagos!");
                for (Aluguel aluguel:alugueis) {
                    if (!aluguel.isPagamento()) {
                        alugueisNaoPagos.add(aluguel);
                        System.out.println(alugueisNaoPagos.size() + ") " + aluguel);
                    }
                }
                System.out.println("Qual Aluguel Deseja Confirmar o Pagamento? ");
                opc = scanner.nextLine();
                if (Integer.parseInt(opc) < 1 || Integer.parseInt(opc) > alugueisNaoPagos.size()) throw new IllegalArgumentException("Aluguel não encontrado.");
                for (Aluguel a:alugueis) {
                    if (a == alugueisNaoPagos.get(Integer.parseInt(opc))) {
                        a.setPagamento(true);
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println("Algum problema foi encontrado!\n" + e.getMessage());
            }
        }
    }

    public static void listarClientes(ArrayList<Cliente> clientes) {
        System.out.println("Lista de Todos os Clientes!");
        for (Cliente cliente:clientes) {
            System.out.println(cliente);
        }
    }

    public static void listarMidias(ArrayList<Midia> midias) {
        System.out.println("Lista de Todas as Mídias!");
        for (Midia midia:midias) {
            System.out.println(midia);
        }
    }
    public static void listarAlugueis(ArrayList<Aluguel> alugueis) {
        System.out.println("Lista de Todos os Alugueis!");
        for (Aluguel aluguel:alugueis) {
            System.out.println(aluguel);
        }
    }

}
