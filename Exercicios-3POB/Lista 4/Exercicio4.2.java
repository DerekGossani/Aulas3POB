//Exercicio4, atividade2

#include <stdio.h>

int main()
{
    import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];

        System.out.println("Digite 4 notas:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble(); 
        }

        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += notas[i];  
        }

        double media = soma / 4;

       
        System.out.println("A média das notas é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        }
    }
}

}