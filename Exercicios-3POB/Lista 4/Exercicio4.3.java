//Exercicio4, atividade3

#include <stdio.h>

int main()
{
  import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];

        System.out.println("Digite 6 números inteiros:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();  

        System.out.println("\nOs números na ordem inversa são:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(numeros[i]);  

        scanner.close();
    }
        }
    }
}
    


}