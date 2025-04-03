//Exercicio1, atividade 2

#include <stdio.h>

int main()
{

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo com raio " + raio + " é: " + area);

        scanner.close();
    }
}

}