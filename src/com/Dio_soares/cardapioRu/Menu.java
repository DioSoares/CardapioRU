package com.Dio_soares.cardapioRu;

public class Menu {

// Atributos
    private String dia;
    private String turno;
    private Refeicao refeicao;

// Construtor
    public Menu (String dia, String turno, Refeicao refeicao){
        this.dia = dia;
        this.turno = turno;
        this.refeicao = refeicao;
    }

// Metodos
    public String getDia() {
        return dia;
    }

    public String getTurno() {
        return turno;
    }

    public Refeicao getRefeicao() {
        return refeicao;
    }
}
