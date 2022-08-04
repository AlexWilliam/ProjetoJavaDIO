package me.dio.classes;

import me.dio.interfaces.IConta;

import java.util.Objects;

public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    private int agencia;
    private int numeroConta;
    private double saldo;

    private Cliente titularConta;

    public Conta(Cliente titular){
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.titularConta = titular;
    }

    public int getAgencia(){
        return this.agencia;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setTitularConta(Cliente titularConta) {
        this.titularConta = titularConta;
    }
    public Cliente getTitularConta() {
        return titularConta;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return agencia == conta.agencia && numeroConta == conta.numeroConta && Double.compare(conta.saldo, saldo) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numeroConta, saldo);
    }

    @Override
    public String toString() {
        return "Titular = " + titularConta.getNome() + "\n" +
                "agencia = " + agencia + "\n" +
                "numeroConta = " + numeroConta + "\n" +
                "saldo = " + saldo  + "\n";
    }
}
