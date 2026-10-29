
package br.com.medaltracker.ui;

import br.com.medaltracker.model.CorMedalha;
import br.com.medaltracker.service.MedalhaService;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final MedalhaService service = new MedalhaService();

    public void executar() {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    service.listar();
                    break;
                case 3:
                    atualizar();
                    break;
                case 4:
                    excluir();
                    break;
                case 0:
                    System.out.println("Encerrando o MedalTracker...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n==============================");
        System.out.println("       MEDALTRACKER");
        System.out.println("==============================");
        System.out.println("1 - Cadastrar medalha");
        System.out.println("2 - Listar medalhas");
        System.out.println("3 - Atualizar medalha");
        System.out.println("4 - Excluir medalha");
        System.out.println("0 - Sair");
        System.out.println("==============================");
    }

    private void cadastrar() {
        System.out.println("\n--- CADASTRAR MEDALHA ---");

        int ano = lerInteiro("Ano: ");
        String campeonato = lerTexto("Campeonato: ");
        String categoria = lerTexto("Categoria: ");
        CorMedalha cor = lerCor();

        service.cadastrar(ano, campeonato, categoria, cor);
    }

    private void atualizar() {
        System.out.println("\n--- ATUALIZAR MEDALHA ---");

        int id = lerInteiro("ID da medalha: ");
        int ano = lerInteiro("Novo ano: ");
        String campeonato = lerTexto("Novo campeonato: ");
        String categoria = lerTexto("Nova categoria: ");
        CorMedalha cor = lerCor();

        if (service.atualizar(id, ano, campeonato, categoria, cor)) {
            System.out.println("Medalha atualizada com sucesso!");
        } else {
            System.out.println("Medalha não encontrada.");
        }
    }

    private void excluir() {
        System.out.println("\n--- EXCLUIR MEDALHA ---");

        int id = lerInteiro("ID da medalha: ");

        if (service.excluir(id)) {
            System.out.println("Medalha excluída com sucesso!");
        } else {
            System.out.println("Medalha não encontrada.");
        }
    }

    private CorMedalha lerCor() {
        while (true) {
            System.out.println("Cor da medalha:");
            System.out.println("1 - Ouro");
            System.out.println("2 - Prata");
            System.out.println("3 - Bronze");

            int opcao = lerInteiro("Escolha: ");

            switch (opcao) {
                case 1:
                    return CorMedalha.OURO;
                case 2:
                    return CorMedalha.PRATA;
                case 3:
                    return CorMedalha.BRONZE;
                default:
                    System.out.println("Cor inválida. Tente novamente.");
            }
        }
    }

    private int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }

    private String lerTexto(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String texto = scanner.nextLine().trim();

            if (!texto.isEmpty()) {
                return texto;
            }

            System.out.println("O campo não pode ficar vazio.");
        }
    }
}
