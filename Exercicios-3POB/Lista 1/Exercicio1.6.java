//Exercicio1, atividade6

#include <stdio.h>

int main()
{
import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor do desconto do INSS: ");
        double descontoINSS = scanner.nextDouble();

        double salarioLiquido = salarioBruto - descontoINSS;
        
        System.out.println("O salário líquido do funcionário é: " + salarioLiquido);

        scanner.close();
    }
}

}