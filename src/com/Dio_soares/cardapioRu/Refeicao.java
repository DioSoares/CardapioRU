package com.Dio_soares.cardapioRu;

public class Refeicao {

// Atributos
    private Alimento salada;
    private Alimento pratoPrincipal;
    private Alimento acompanhamento;

// Construtor

    public Refeicao (Alimento salada, Alimento pratoPrincipal, Alimento acompanhamento){
        this.salada = salada;
        this.pratoPrincipal = pratoPrincipal;
        this.acompanhamento = acompanhamento;
    }

// Metodos


    public Alimento getSalada() {
        return salada;
    }

    public Alimento getPratoPrincipal() {
        return pratoPrincipal;
    }

    public Alimento getAcompanhamento() {
        return acompanhamento;
    }
}