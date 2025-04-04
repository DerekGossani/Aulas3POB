//Exercicio2, atividade3

#include <stdio.h>

int main()
{
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);  

        double resultado;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                
                if (num2 == 0) {
                    System.out.println("Erro: Não é possível dividir por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}

}