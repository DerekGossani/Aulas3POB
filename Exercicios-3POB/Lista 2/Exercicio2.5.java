//Exercicios2, atividade5

#include <stdio.h>

int main()
{
import java.util.Scanner;

public class ConceitoNota {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota (0 a 10): ");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida.");
        } else {
     
            switch ((int) nota) {
                case 10:
                case 9:
                    System.out.println("Conceito: A");
                    break;
                case 8:
                case 7:
                    System.out.println("Conceito: B");
                    break;
                case 6:
                case 5:
                    System.out.println("Conceito: C");
                    break;
                case 4:
                case 3:
                    System.out.println("Conceito: D");
                    break;
                case 2:
                case 1:
                case 0:
                    System.out.println("Conceito: E");
                    break;
                default:
                   
                    break;
            }
        }

        scanner.close();
    }
}


}