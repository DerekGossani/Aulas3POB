//Exercicio3, atividade2

#include <stdio.h>

int main()
{
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        int contador = 1;

        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;  
        }

        scanner.close();
    }
}

}