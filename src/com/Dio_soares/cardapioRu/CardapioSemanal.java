package com.Dio_soares.cardapioRu;

import java.util.ArrayList;

public class CardapioSemanal {

    // Lista cardápio
    private ArrayList<Menu> cardapio;
    private final String[] diasDaSemana = {"Segunda-feira ", "Terça-feira ", "Quarta-feira ", "Quinta-feira " + "Sexta-feira"};
    private final String[] turnos = {"Manhã ", "Tarde ", "Noite"};

    // Construtor
    public CardapioSemanal() {
        cardapio = new ArrayList<>();
    }

    // Metodos

    public void adicionarMenu (Menu menu){
        cardapio.add(menu);
    }

    public void imprimirCardapio(){
        for(int i = 0; i < cardapio.size(); i++){
            Menu menu = cardapio.get(i);
            if (menu != null) {
                String dia = diasDaSemana[i /3];
                String turno = turnos[i % 3];
                System.out.println("Salada: " + menu.getRefeicao().getSalada().getNome());
                System.out.println("Prato Principal: " + menu.getRefeicao().getPratoPrincipal().getNome());
                System.out.println("Acompanhamento: " + menu.getRefeicao().getAcompanhamento().getNome());
                System.out.println();
            }
        }
    }

    public String[] getDiasDaSemana(){
        return diasDaSemana;
    }

    public String[] getTurnos() {
        return turnos;
    }
}