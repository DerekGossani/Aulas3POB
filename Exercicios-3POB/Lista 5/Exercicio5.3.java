//Exercicio5, atividade3

#include <stdio.h>

int main()
{
 import java.util.ArrayList;
import java.util.Scanner;

public class SomaEMediaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> numeros = new ArrayList<>();

        double numero;

        System.out.println("Digite números para adicionar à lista. Digite -1 para finalizar.");
        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextDouble();
            
            if (numero == -1) {
                break;
            }
            
            numeros.add(numero);
        }

        double soma = 0;
        double media = 0;

        for (double num : numeros) {
            soma += num;
        }

        if (numeros.size() > 0) {
            media = soma / numeros.size();
        }

        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}

}