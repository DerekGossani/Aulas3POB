//Exercicio3,atividade5

#include <stdio.h>

int main()
{
import java.util.Scanner;

public class NumerosPrimosNoIntervalo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (início do intervalo): ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o segundo número (fim do intervalo): ");
        int fim = scanner.nextInt();

        if (inicio <= 0 || fim <= 0 || inicio > fim) {
            System.out.println("Por favor, digite números inteiros positivos válidos (início menor que o fim).");
        } else {
        
            System.out.println("Números primos entre " + inicio + " e " + fim + ":");
            for (int numero = inicio; numero <= fim; numero++) {
                boolean primo = true;

                
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false; 
                        break; 
                    }
                }

            }
        }
    }
}

}