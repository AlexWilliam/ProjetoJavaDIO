package me.dio.classes;

import me.dio.interfaces.IConta;

public abstract class Conta implements IConta {
    private int agencia;
    private int numeroConta;
    private double saldo;

    public int getAgencia(){
        return this.agencia;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

}
