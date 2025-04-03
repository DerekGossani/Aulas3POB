//Exercicio3, atividade3

#include <stdio.h>

int main()
{
import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para iniciar a contagem regressiva: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número positivo.");
        } else {
            
            int contador = numero;
            do {
                System.out.println(contador); 
                contador--; 
            } while (contador >= 0); 
        }

        scanner.close();
    }
}

}