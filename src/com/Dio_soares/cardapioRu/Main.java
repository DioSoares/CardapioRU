package com.Dio_soares.cardapioRu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardapioSemanal cardapioSemanal = new CardapioSemanal();

        System.out.println("====Bem-Vindo ao sistema de cadastro do RU====");
        System.out.println("Por favor, insira os detalhes das refeições para cada dia e turno...");

        // Loop para inserir refeições para cada dia e turno
        for (String dia : cardapioSemanal.getDiasDaSemana()) {
            for (String turno : cardapioSemanal.getTurnos()) {
                System.out.println("Cadastrar refeição para " + dia + " (" + turno + ")");

                // Solicitar os alimentos
                System.out.print("Nome da salada: ");
                String saladaNome = scanner.nextLine();
                Alimento salada = new Alimento(saladaNome);

                System.out.print("Nome do prato principal: ");
                String pratoPrincipalNome = scanner.nextLine();
                Alimento pratoPrincipal = new Alimento(pratoPrincipalNome);

                System.out.print("Nome do acompanhamento: ");
                String acompanhamentoNome = scanner.nextLine();
                Alimento acompanhamento = new Alimento(acompanhamentoNome);

                // Criar a refeição e o menu
                Refeicao refeicao = new Refeicao(salada, pratoPrincipal, acompanhamento);
                Menu menu = new Menu(dia, turno, refeicao);

                // Adicionar o menu ao cardápio
                cardapioSemanal.adicionarMenu(menu);
            }
        }

        // Exibir o cardápio semanal completo
        cardapioSemanal.imprimirCardapio();

        scanner.close();
    }
}
