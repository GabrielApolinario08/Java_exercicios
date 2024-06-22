package ex02;

import java.util.Scanner;

/*
2) Se a mãe natureza pudesse criar um programa em Java para criar plantas de uma
        floresta e as plantas sendo conhecidas por seus nomes e espécie, podendo ser de 3
        tipos:
        Árvore, que pode ou não ser frutífera;
        Flor, que tem a cor dos suas flores; e
        Carnívora, que pode ou não ser venenosa.
        Como seria a criação de uma floresta?
        Criar uma classe para criar uma floresta (main). Nesta classe deverá haver um menu
        para cadastrar plantas, listar plantas, mostrar quantidade de plantas na floresta e
        mostrar a quantidade de plantas de cada tipo (Árvore, Flor e Carnívora).
*/


//Gabriel Apolinário Fabrício
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        Planta[] plantas = new Planta[100];
        String especie;
        boolean frutifera, cor, venenosa;
        int qtdPlanta = 0;
        int opc;
        do {
            System.out.println("MENU");
            System.out.println("[1] Cadastrar planta");
            System.out.println("[2] Listar plantas");
            System.out.println("[3] Mostrar quantidade de plantas na floresta");
            System.out.println("[4] Mostrar quantidade de plantas de cada tipo");
            System.out.println("[5] Sair");
            System.out.print("Sua escolha: ");
            opc = scanner.nextInt();

            switch (opc ) {
                case 1:
                    System.out.println("Qual planta deseja cadastrar?");
                    System.out.println("[1] Arvore");
                    System.out.println("[2] Flor");
                    System.out.println("[3] Carnívora");
                    System.out.print("Sua escolha: ");
                    opc = scanner.nextInt();
                    switch (opc) {
                        case 1:
                            System.out.println("Espécie da árvore: ");
                            especie = scannerStr.nextLine();
                            System.out.println("Frutífera ou não? [s/n]");
                            frutifera = scannerStr.nextLine().equalsIgnoreCase("s");
                            plantas[qtdPlanta] = new Arvore("Árvore", especie, frutifera);
                            qtdPlanta++;
                            break;
                        case 2:
                            System.out.println("Espécie da flor: ");
                            especie = scannerStr.nextLine();
                            System.out.println("Tem a cor das suas flores? [s/n]");
                            cor = scannerStr.nextLine().equalsIgnoreCase("s");
                            plantas[qtdPlanta] = new Flor("Flor", especie, cor);
                            qtdPlanta++;
                            break;
                        case 3:
                            System.out.println("Espécie da carnívora: ");
                            especie = scannerStr.nextLine();
                            System.out.println("Venenosa ou não? [s/n]");
                            venenosa = scannerStr.nextLine().equalsIgnoreCase("s");
                            plantas[qtdPlanta] = new Carnivora("Carnívora", especie, venenosa);
                            qtdPlanta++;
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    for (Planta planta : plantas) {
                        if (planta != null) {
                            System.out.println(planta);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Na floresta contem " + qtdPlanta + " plantas!");
                    break;
                case 4:
                    int qtdArvore = 0, qtdFlor = 0, qtdCarnivora = 0;
                    for (Planta planta : plantas) {
                        if (planta instanceof Arvore) {
                            qtdArvore++;
                        } else if (planta instanceof Flor) {
                            qtdFlor++;
                        } else if (planta instanceof Carnivora) {
                            qtdCarnivora++;
                        }
                    }
                    System.out.println("Quantidade de Árvore: " + qtdArvore);
                    System.out.println("Quantidade de Flor: " + qtdFlor);
                    System.out.println("Quantidade de Carnívora: " + qtdCarnivora);
                    break;
                case 5:
                    System.out.println("Encerrado.");
                    break;
                default:
                    break;
            }
        } while (opc != 5);
    }
}
