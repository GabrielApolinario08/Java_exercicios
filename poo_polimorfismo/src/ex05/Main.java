package ex05;
/*

5) Criar um projeto para cadastrar os animais de um zoológico.
Os animais são conhecidos por seus nomes e especie. Eles podem ser de 3 tipos
Voador, que tem a cor da pena, terrestres, que tem a quantidade de patas e aquáticos,
que podem ou não respirar fora da água.
No zoológico cada animal tem seu habitat. Os habitats do zoológico são cinco, pré definidos: jaula, gaiola, aquário, lago e viveiro. Cada habitat tem uma área e está
localizada em um local do zoológico.
A área é representada pela relação entre Comprimento e Largura.
Criar uma classe para testar todo o zoológico (main). Nesta classe deverá haver um
menu para Cadastrar animais, Listar animais, Quantidade de animais no Zoo,
Quantidade de animais de cada tipo (Voador, Terrestre e Aquático), Quantidade de
animais por tipo de habitat e Área total que os animais ocupam.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animais = new ArrayList<Animal>();
        List<Habtat> habtats = new ArrayList<Habtat>();
        List<AnimalHabitat> animalHabitats = new ArrayList<>();
        String opc;
        int opcInt = 0;
        do {
            try {
                System.out.println(menu());
                System.out.print("Sua opção: ");
                opc = scanner.nextLine();
                opcInt = Integer.parseInt(opc);
                if (opcInt < 1 || opcInt > 7) throw new IllegalArgumentException("Opção não encontrada.");
                switch (opcInt) {
                    case 1 -> cadastrarAnimal(animais, habtats, animalHabitats);
                    case 2 -> criarHabtat(habtats);
                    case 3 -> listarAnimais(animais);
                    case 4 -> qtdAnimais(animais);
                    case 5 -> qtdAnimaisTipo(animais);
                    case 6 -> qtdAnimaisPorHabtat(animais, habtats, animalHabitats);
                    case 7 -> areaTotalAimaisOcupam(habtats);
                    case 8 -> System.out.println("Encerrado.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um número.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Algo deu errado. Tente novamente!" + e.getMessage());
            }

        }while (opcInt != 8);
    }

    public static String menu() {
        return """
                ------------------------Menu----------------------
                    [1] Cadastrar Animal
                    [2] Cadastrar Habtat
                    [3] Listar Animais
                    [4] Quantidade de Animais no Zoo
                    [5] Quantidade de Aimais de Cada Tipo
                    [6] Quantidade de Animais em Cada Habtat
                    [7] Área Total que os Animais Ocupam
                    [8] Encerrar
                --------------------------------------------------""";
    }
    public static void cadastrarAnimal(List<Animal> animais, List<Habtat> habtats, List<AnimalHabitat> animalHabitats) {
        Scanner scanner = new Scanner(System.in);
        String nome, especie;
        Animal animal = new Animal();
        String opc;
        int opcInt;
        System.out.println("Cadastrando Novo Animal!");
        System.out.println("Nome do animal: ");
        nome = scanner.nextLine();
        System.out.println("Especie do animal: ");
        especie = scanner.nextLine();
        System.out.println("Tipo do animal: ");
        System.out.println("""
                \t[1] Terrestre
                \t[2] Aquatico
                \t[3] Voador""");
        System.out.print("Sua opção: ");
        opc = scanner.nextLine();
        opcInt = Integer.parseInt(opc);
        if (opcInt < 1 || opcInt > 3) throw new IllegalArgumentException("Opção não encontrada.");
        switch (opcInt) {
            case 1 -> {
                animal = new Terrestre();
                System.out.println("Quantidade de patas: ");
                ((Terrestre) animal).setQtdPatas(Integer.parseInt(scanner.nextLine()));
            }
            case 2 -> {
                animal = new Aquatico();
                System.out.println("Animal respira fora d'água? [s/n]");
                ((Aquatico) animal).setRespiraForaDaAgua(scanner.nextLine().equalsIgnoreCase("s"));
            }
            case 3 -> {
                animal = new Voador();
                System.out.println("Cor da pena: ");
                ((Voador) animal).setCorPena(scanner.nextLine());
            }
            default -> {}
        }
        animal.setNome(nome);
        animal.setEspecie(especie);

        if (habtats.isEmpty()) {
            System.out.println("Nenhum habtat cadastrado!");
            opc = "1";
        } else {
            System.out.println("Escolhendo Habtat!");
            System.out.println("""
                    [1] Cadastrar Habtat
                    [2] Utilizar Habtat Existente""");
            System.out.println("Sua escolha: ");
            opc = scanner.nextLine();
        }


        opcInt = Integer.parseInt(opc);
        if (opcInt < 1 || opcInt > 2) throw new IllegalArgumentException("Opção não encontrada.");
        if (opcInt == 1) {
            criarHabtat(habtats);
            System.out.println("Novo habtat Cadastrado com Sucesso!");
            System.out.println(habtats.get(habtats.size() - 1));
            animalHabitats.add(new AnimalHabitat(animal, habtats.get(habtats.size() - 1)));
        } else {
            listarHabtats(habtats);
            System.out.println("Qual habtat deseja escolher? (Ex: 1)");
            opcInt = Integer.parseInt(scanner.nextLine());
            if (opcInt < 1 || opcInt > habtats.size()) throw new IllegalArgumentException("Opção não encontrada.");
            animalHabitats.add(new AnimalHabitat(animal, habtats.get(opcInt - 1)));
        }
        animal.setHabtat(habtats.get(opcInt - 1));
        animais.add(animal);
        System.out.println("\tAnimal Cadastrado Com Sucesso!");
    }

    public static  void criarHabtat(List<Habtat> habtats) {
        Scanner scanner = new Scanner(System.in);
        String opc;
        int opcInt;
        System.out.println("Cadastrando um Habtat!");
        System.out.println("Qual Habtat esse animal vai viver? ");
        System.out.println("""
                Habitats
                    [1] Gaiola
                    [2] Jaula
                    [3] Aquário
                    [4] Lago
                    [5] Viveiro""");
        System.out.print("Sua opção: ");
        opc = scanner.nextLine();
        opcInt = Integer.parseInt(opc);
        if (opcInt < 1 || opcInt > 5) throw new IllegalArgumentException("Opção não encontrada.");
        switch (opcInt) {
            case 1 -> {
                criarHabtatEscolhido(habtats, new Gaiola());
            }
            case 2 -> {
                criarHabtatEscolhido(habtats, new Jaula());
            }
            case 3 -> {
                criarHabtatEscolhido(habtats, new Aquario());
            }
            case 4 -> {
                criarHabtatEscolhido(habtats, new Lago());
            }
            case 5 -> {
                criarHabtatEscolhido(habtats, new Viveiro());
            }
        }
    }

    public static  void criarHabtatEscolhido(List<Habtat> habtats, Habtat habtat) {
        Scanner scanner = new Scanner(System.in);
        String opc, loc;
        double opcDouble;
        System.out.println("Área em metros quadrados: ");
        opc = scanner.nextLine();
        opcDouble = Double.parseDouble(opc);
        System.out.println("Localização: ");
        loc = scanner.nextLine();
        habtat.setArea(opcDouble);
        habtat.setLocalizacao(loc);
        habtats.add(habtat);
    }
    public static void listarAnimais(List<Animal> animais) {
        System.out.println("Lista De Todos Animais!");
        for (Animal animal:animais) {
            System.out.println(animal);
        }
    }

    public static void listarHabtats(List<Habtat> habtats) {
        System.out.println("Lista De Todos Habtats!");
        for (Habtat habtat:habtats) {
            System.out.println((habtats.indexOf(habtat) + 1) + ") " + habtat);
        }
    }

    public static void qtdAnimais(List<Animal> animais) {
        System.out.println("Quantidade de Animais Cadastrados: " + animais.size());
    }
    public static void qtdAnimaisTipo(List<Animal> animais) {
        int contTerrestre = 0, contAquatico = 0, contVoador = 0;
        for (Animal animal:animais) {
            if (animal instanceof Terrestre) {
                contTerrestre++;
            } else if(animal instanceof Aquatico) {
                contAquatico++;
            } else {
                contVoador++;
            }
        }
        System.out.println("Quantidade de Animais Terrestres: " + contTerrestre);
        System.out.println("Quantidade de Animais Aquaticos: " + contAquatico);
        System.out.println("Quantidade de Animais Voadores: " + contVoador);
    }
    public static void qtdAnimaisPorHabtat(List<Animal> animais, List<Habtat> habtats, List<AnimalHabitat> animalHabitats) {
        boolean temAnimal;
        if (habtats.isEmpty()) {
            System.out.println("Não existe habtat cadastrado!");
        } else {
            for (Habtat habtat:habtats) {
                System.out.println(habtat);
                System.out.println("Animais presentes no Habtat: ");
                temAnimal = false;
                for (Animal animal:animais) {
                    if (animal.getHabtat() == habtat) {
                        System.out.println("\t" + animal);
                        System.out.println();
                        temAnimal = true;
                    }
                }
                if (!temAnimal) {
                    System.out.println("\tNenhum animal vivendo no habtat!");
                }
            }
        }


    }
    public static void areaTotalAimaisOcupam(List<Habtat> habtats) {
        double totArea = 0;
        if (habtats.isEmpty()) {
            System.out.println("Nenhum habtat cadastrado! Impossível contabilizar a área ocupada.");
        } else {
            for (Habtat habtat:habtats) {
                totArea += habtat.getArea();
            }
            System.out.println("Total de área ocupada pelos animais: " + totArea + "m².");
        }

    }

}
