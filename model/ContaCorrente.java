package model;

public class ContaCorrente {
    // atributos
    private int numero;
    private String titular;
    private float saldo;

    // constructor
    public ContaCorrente (int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    // métodos
    public boolean sacar (float valor) {
        // verifica se o valor de saque é positivo
        if (valor < 0) {
            System.out.println("O valor de saque deve ser positivo"); return false;
        }

        // coloca o limite de saque de 10000
        if (valor > 10000) {
            System.err.println("O limite de saque é de R$: 10.000.");
            return false;
        }

        // verifica se o saque é possível (menor que o saldo)
        if (valor > saldo) {
            System.out.printf("Saldo insuficiente para o saque. O saldo atual é de R$: %.2f \n", saldo);
            return false;
        }

        // faz o saldo
        saldo = saldo - valor;
        System.out.printf("Saque de R$: %2.f realizado.", valor);
        return true;
    }

    public boolean depositar (float valor) {
        // verifica se o valor do depósito é positivo
        if (valor <= 0) {
            System.out.println("O valor do depósito deve ser positivo.");
            return false;
        }

        // verifica se o valor a ser sacado é menor que 10.000
        if (valor > 10000) {
            System.out.println("O limite de depósito é de 10.000.");
            return false;
        }

        // realiza o depósito
        saldo = saldo + valor;
        System.out.printf("Depósito de R$: %.2f realizado.", valor);
        return true;
    }

    public float consultarSaldo() {
        return saldo;
    }

    // getters
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }
}
