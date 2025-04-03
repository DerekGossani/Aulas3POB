//Exercicio1, atividade8

#include <stdio.h>

int main()
{
import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.println("O volume da esfera é: " + volume);

        scanner.close();
    }
}



}