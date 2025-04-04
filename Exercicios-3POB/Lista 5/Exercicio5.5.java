//Exercicio5, atividade5

#include <stdio.h>

int main()
{
 import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        String resposta;

        do {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);  

            System.out.print("Deseja inserir outro número? (sim/não): ");
            resposta = scanner.next();  
        } while (resposta.equalsIgnoreCase("sim"));  

        Collections.sort(numeros);

        System.out.println("\nLista ordenada em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}

}