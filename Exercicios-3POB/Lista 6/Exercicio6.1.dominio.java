// Pacote: dominio
package dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public double depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
        return saldo;
    }
    public double sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else
package dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
        return saldo;
    }

    public double sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
        return saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
} {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
}