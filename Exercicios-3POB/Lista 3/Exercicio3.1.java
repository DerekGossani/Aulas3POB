//Exercicio3, atividade1

#include <stdio.h>

int main()
{
import java.util.Scanner;

public class SomaNumerosNaturais {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        /
        System.out.print("Digite um número N: ");
        int N = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= N; i++) {
            soma += i;  
        }

        System.out.println("A soma dos primeiros " + N + " números naturais é: " + soma);

        scanner.close();
    }
}
}