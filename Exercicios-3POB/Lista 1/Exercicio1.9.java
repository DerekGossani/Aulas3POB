//Exercicio1, atividade9

#include <stdio.h>

int main()
{
import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double reais = scanner.nextDouble();

        System.out.print("Digite a cotação do dólar (US$): ");
        double cotacaoDolar = scanner.nextDouble();

        double dolares = reais / cotacaoDolar;
        
        System.out.printf("O valor de R$%.2f equivale a US$%.2f\n", reais, dolares);
        
        scanner.close();
    }
}


}