//Exercicio5, atividade2

#include <stdio.h>

int main()
{
  import java.util.ArrayList;
import java.util.Scanner;

public class RemoverNomeArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            String nome = scanner.nextLine();
            nomes.add(nome);  

        System.out.print("Digite um nome para remover da lista: ");
        String nomeParaRemover = scanner.nextLine();

        boolean removido = nomes.remove(nomeParaRemover);  

        if (removido) {
            System.out.println("\nNome removido com sucesso.");
        } else {
            System.out.println("\nNome não encontrado na lista.");
        }

        System.out.println("\nLista atualizada:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

}

}