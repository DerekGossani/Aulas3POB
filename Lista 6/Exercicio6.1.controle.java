// Pacote: controle


package controle;

import dominio.ContaBancaria;

public class GerenciadorConta {

    // Método para depositar
    public void depositar(ContaBancaria conta, double valor) {
        double saldoAtual = conta.depositar(valor);
        System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + saldoAtual);
    }

    // Método para sacar
    public void sacar(ContaBancaria conta, double valor) {
        double saldoAtual = conta.sacar(valor);
        System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + saldoAtual);
    }

    // Método para verificar saldo
    public void verificarSaldo(ContaBancaria conta) {
        System.out.println("Saldo da conta de " + conta.getTitular() + ": R$ " + conta.getSaldo());
    }

    // Método main para testar
    public static void main(String[] args) {
        // Criando objetos
        dominio.ContaBancaria conta = new dominio.ContaBancaria("João Silva", 1000.0);
        GerenciadorConta gerenciador = new GerenciadorConta();

        // Exibindo saldo inicial
        gerenciador.verificarSaldo(conta);

        // Realizando operações
        gerenciador.depositar(conta, 500.0);
        gerenciador.sacar(conta, 200.0);

        // Exibindo saldo final
        gerenciador.verificarSaldo(conta);
    }
}