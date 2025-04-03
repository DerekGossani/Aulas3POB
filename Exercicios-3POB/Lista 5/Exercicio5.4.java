//Exercicio5, atividade4

#include <stdio.h>

int main()
{
 import java.util.ArrayList;
import java.util.Scanner;

public class ContarOcorrenciasArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);  

        System.out.print("Digite um número para contar as ocorrências na lista: ");
        int numeroParaContar = scanner.nextInt();

        int contador = 0;
        for (int num : numeros) {
            if (num == numeroParaContar) {
                contador++;
            }
        }

        System.out.println("O número " + numeroParaContar + " aparece " + contador + " vez(es) na lista.");

        scanner.close();
    }
}

}
}