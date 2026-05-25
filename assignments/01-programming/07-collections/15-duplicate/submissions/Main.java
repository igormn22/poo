import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> nomes = new HashSet<>();

        System.out.println("Digite os nomes (digite 'fim' para encerrar):");

        while (true) {
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            nomes.add(nome.toLowerCase());
        }

        System.out.println("\nNomes cadastrados:");
        System.out.println(nomes);

        System.out.println("\nPesquisar nomes (digite 'sair' para encerrar):");

        while (true) {
            String pesquisa = scanner.nextLine();

            if (pesquisa.equalsIgnoreCase("sair")) {
                break;
            }

            if (nomes.contains(pesquisa.toLowerCase())) {
                System.out.println("Nome encontrado.");
            } else {
                System.out.println("Nome não encontrado.");
            }
        }

        scanner.close();
    }
}
