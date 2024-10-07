package com.Dio_soares.cardapioRu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardapioSemanal cardapioSemanal = new CardapioSemanal();

        System.out.println("Bem-vindo ao sistema de cadastro de cardápio do RU.");

        boolean continuar = true;

        
        while (continuar) {
            System.out.println("Por favor, insira os detalhes das refeições.");

            for (String dia : cardapioSemanal.getDiasDaSemana()) {
                for (String turno : cardapioSemanal.getTurnos()) {
                    System.out.println("\nCadastrar refeição para " + dia + " (" + turno + ")");


                    System.out.print("Digite o nome da salada: ");
                    String saladaNome = scanner.nextLine().trim();
                    Alimento salada = new Alimento(saladaNome);

                    System.out.print("Digite o nome do prato principal: ");
                    String pratoPrincipalNome = scanner.nextLine().trim();
                    Alimento pratoPrincipal = new Alimento(pratoPrincipalNome);

                    System.out.print("Digite o nome do acompanhamento: ");
                    String acompanhamentoNome = scanner.nextLine().trim();
                    Alimento acompanhamento = new Alimento(acompanhamentoNome);

                    Refeicao refeicao = new Refeicao(salada, pratoPrincipal, acompanhamento);
                    Menu menu = new Menu(dia, turno, refeicao);

                    cardapioSemanal.adicionarMenu(menu);

                    System.out.println("\nDeseja continuar adicionando refeições ou imprimir o cardápio?");
                    System.out.println("1 - Continuar cadastrando");
                    System.out.println("2 - Imprimir cardápio");

                    int opcao = scanner.nextInt();
                    scanner.nextLine();

                    if (opcao == 2) {
                        continuar = false;
                        cardapioSemanal.imprimirCardapio();
                        break;
                    }
                }
                if (!continuar) {
                    break;
                }
            }
        }

        scanner.close();
    }
}
