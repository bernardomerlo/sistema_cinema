import entidades.Assento;
import entidades.Sessao;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sessao[] sessoes = new Sessao[5];
        int escolha;

        do {
            menu();
            escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha) {
                case 1:
                    sessoes = cadastra(sc);
                    break;
                case 2:
                    vender(sc, sessoes);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 3);
    }

    private static void vender(Scanner sc, Sessao[] sessoes) {
        System.out.println("Essas são as sessões disponíveis:\n");
        for (int i = 0; i < sessoes.length; i++) {
            if (sessoes[i] != null) {
                System.out.println("Sessão " + (i + 1));
                System.out.println("Nome do Filme: " + sessoes[i].getNomeFilme());
                System.out.println("Horário: " + sessoes[i].getHorario());
                System.out.println("Valor: " + sessoes[i].getValor());
                System.out.println();
            }
        }

        System.out.println("Escolha a Sessão (1 a 5): ");
        int escolha = sc.nextInt();
        escolha--;
        sc.nextLine();

        if (escolha >= 0 && escolha < sessoes.length && sessoes[escolha] != null) {
            Sessao sessao = sessoes[escolha];
            System.out.println("Esses são os assentos disponíveis:");
            System.out.println(sessao.getAssentos().mostraLugares());
            System.out.println("Escolha a fila (1 a 5): ");
            int fila = sc.nextInt();
            System.out.println("Escolha o assento (1 a 4): ");
            int assento = sc.nextInt();
            fila--;
            assento--;

            if (fila >= 0 && fila < 5 && assento >= 0 && assento < 4) {
                if (sessao.venda(fila, assento)) {
                    System.out.println("Assento vendido com sucesso!");
                } else {
                    System.out.println("Erro: assento já ocupado.");
                }
            } else {
                System.out.println("Assento inválido.");
            }
        } else {
            System.out.println("Sessão inválida.");
        }
    }

    private static Sessao[] cadastra(Scanner sc) {
        Sessao[] sessoes = new Sessao[5];
        for (int i = 0; i < sessoes.length; i++) {
            System.out.println("Digite o nome do Filme: ");
            String nomeFilme = sc.nextLine();
            System.out.println("Digite o horário da Sessão: ");
            String horario = sc.nextLine();
            sessoes[i] = new Sessao(nomeFilme, horario);
            System.out.println("Sessão " + (i + 1) + " cadastrada com sucesso!\n");
        }
        return sessoes;
    }

    public static void menu() {
        System.out.println("Digite o que deseja fazer: ");
        System.out.println("1 - Cadastrar Sessão");
        System.out.println("2 - Vender Ingresso");
        System.out.println("3 - Sair");
    }
}
