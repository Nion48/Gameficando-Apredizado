import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamificandoOAprendizado {
    public static void main(String[] args) {
        List<String> historicoExercicios = new ArrayList<>();
        List<String> codigosAprendidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opçao = 0;

        //Minhas variáveis (personagem de game)
        int xpAtual = 0;
        int nivel = 1;
        int xpParaUpar = 100;

        while (opçao != 3) {
            //Toda vez que o menu aparece, mostra o Status atual
            System.out.println("\n=== STATUS ===");
            System.out.println("NÍVEL: " + nivel);
            System.out.println("XP: " + xpAtual + " / " + xpParaUpar);
            System.out.println("==========");

            System.out.println("1. Registrar Exercício Concluído (+XP)");
            System.out.println("2. Anotar Novo Código Aprendido (+XP)");
            System.out.println("3. Ver Histórico Completo");
            System.out.println("Sair do Jogo");
            System.out.println("Escolha uma acao: ");
            opçao = scanner.nextInt();
            scanner.nextLine(); //Limpa o buffer

            if (opçao == 1) {
                System.out.println("\nQual tipo de exercicio ou estudos você fez?");
                System.out.println("A) Leitura/Teoria (+10 XP)");
                System.out.println("B) Prática no Coddy/Faculdade (+30 XP)");
                System.out.println("C) Exercícios Físicos");
                System.out.println("Escolha (A, B ou C): ");
                String tipo =  scanner.nextLine();

                if (tipo.equalsIgnoreCase("A")) {
                    xpAtual = xpAtual + 10;
                    codigosAprendidos.add("Estudou Teoria.");
                    System.out.println("Boa! Ganhou 10 de XP.");
                } else if (tipo.equalsIgnoreCase("B")) {
                    xpAtual = xpAtual + 30;
                    codigosAprendidos.add("Praticou Código.");
                    System.out.println("Excelente! Ganhou 30 de XP.");
                } else if (tipo.equalsIgnoreCase("C")){
                    xpAtual = xpAtual + 20;
                    historicoExercicios.add("Praticou Exercício Físico.");
                    System.out.println("Muito Bem! Você Está Mais Próximo da Sua Melhor Forma Física Ganhou 20 de XP.");
                }

                // Lógica de subir de nível (If em ação!)
                if (xpAtual >= xpParaUpar) {
                    nivel = nivel + 1;       // Sobe de nível
                    xpAtual = xpAtual - xpParaUpar; // Reseta o XP mantendo a sobra
                    xpParaUpar = xpParaUpar + 50;   // A próxima fase fica mais difícil!
                    System.out.println("\n🥳 SUBIU DE NÍVEL! Você agora está no nível " + nivel + "!");
                }
            } else if (opçao == 2) {
                System.out.println("\n--- Histórico de Conquistas ---");
                for (int i = 0; i < historicoExercicios.size(); i++) {
                    System.out.println("- " + historicoExercicios.get(i));
                }
            }    
        }
        scanner.close();
    }
            
}