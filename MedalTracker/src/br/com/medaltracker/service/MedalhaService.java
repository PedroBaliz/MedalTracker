
package br.com.medaltracker.service;

import br.com.medaltracker.model.CorMedalha;
import br.com.medaltracker.model.Medalha;

import java.util.ArrayList;
import java.util.List;

public class MedalhaService {

    private final List<Medalha> medalhas = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrar(int ano, String campeonato,
                          String categoria, CorMedalha cor) {
        Medalha medalha = new Medalha(
            proximoId++, ano, campeonato, categoria, cor
        );

        medalhas.add(medalha);
        System.out.println("Medalha cadastrada com sucesso!");
    }

    public void listar() {
        if (medalhas.isEmpty()) {
            System.out.println("Nenhuma medalha cadastrada.");
            return;
        }

        for (Medalha medalha : medalhas) {
            System.out.println("-------------------------");
            System.out.println("ID: " + medalha.getId());
            System.out.println("Ano: " + medalha.getAno());
            System.out.println("Campeonato: " + medalha.getCampeonato());
            System.out.println("Categoria: " + medalha.getCategoria());
            System.out.println("Cor: " + medalha.getCor());
        }

        System.out.println("-------------------------");
    }

    public boolean atualizar(int id, int ano, String campeonato,
                             String categoria, CorMedalha cor) {
        Medalha medalha = buscarPorId(id);

        if (medalha == null) {
            return false;
        }

        medalha.setAno(ano);
        medalha.setCampeonato(campeonato);
        medalha.setCategoria(categoria);
        medalha.setCor(cor);

        return true;
    }

    public boolean excluir(int id) {
        Medalha medalha = buscarPorId(id);

        if (medalha == null) {
            return false;
        }

        medalhas.remove(medalha);
        return true;
    }

    private Medalha buscarPorId(int id) {
        for (Medalha medalha : medalhas) {
            if (medalha.getId() == id) {
                return medalha;
            }
        }

        return null;
    }
}
