//Exercicio1, atividade 3

#include <stdio.h>

int main()
{

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");

        
        scanner.close();
    }
}

}