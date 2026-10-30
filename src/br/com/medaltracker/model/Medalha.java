
package br.com.medaltracker.model;

public class Medalha {

    private int id;
    private int ano;
    private String campeonato;
    private String categoria;
    private CorMedalha cor;

    public Medalha(int id, int ano, String campeonato,
                   String categoria, CorMedalha cor) {
        this.id = id;
        this.ano = ano;
        this.campeonato = campeonato;
        this.categoria = categoria;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public CorMedalha getCor() {
        return cor;
    }

    public void setCor(CorMedalha cor) {
        this.cor = cor;
    }
}
