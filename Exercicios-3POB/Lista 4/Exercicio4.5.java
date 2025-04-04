//Exercicio4, atividade5

#include <stdio.h>

int main()
{
  import java.util.Scanner;

public class BuscarNumeroArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para buscar no array: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Número não encontrado.");
        }

        scanner.close();
    }
}


}