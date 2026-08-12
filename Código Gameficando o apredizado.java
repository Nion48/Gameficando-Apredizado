import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameEstudos {
    public static void main(String[] args) {
        List<String> historico = new ArrayList<>();
        Scanner scanner = new scanner(System.in);
        int opçao = 0;

        //Minhas variáveis (personagem de game)
        int xpAtual = 0;
        int nivel = 1;
        int xpParaUpar = 100;

        while (opçao != 3) {
            //Toda vez que o menu aparece, mostra o Status atual
            System.out.println("\n=== STATUS ===");
            System.out.println("NÍVEL: " + nível);
            System.out.println("XP: " + xpAtual + " / " + xpParaUpar);
            System.out.println("==========");

            System.out.println("1. Registrar Exercício Concluído (+XP)");
            System.out.println("2. Ver Histórico do Treino");
            System.out.println("3. Sair do Jogo");
            System.out.println("Escolha uma acao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //Limpa o buffer

            if (opcao == 1) {
                System.out.println("\nQual tipo de exercicio você fez?");
                System.out.println("A) Leitura/Teoria (+10 XP)");
                System.out.println("B) Prática no Coddy/Faculdade (+30 XP)");
                System.out.println("Escolha (A ou B): ");
                String tipo =  scanner.nextLine();
                
            }
        }
    }
}