//Exercicio1, atividade7

#include <stdio.h>

int main()
{
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        
        double perimetro = 2 * (base + altura);

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);

        scanner.close();
    }
}


}