package me.dio.classes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setCpf("11111111111");
        cliente1.setNome("Cliente 1");

        Conta corrente = new ContaCorrente(cliente1);
        corrente.depositar(99.35);
        corrente.imprimirExtrato();

        Cliente cliente2 = new Cliente("Cliente 2", "22222222222");

        Conta poupanca = new ContaPoupanca(cliente2);
        poupanca.depositar(50.50);
        poupanca.imprimirExtrato();

        corrente.transferir(35, poupanca);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco banco = new Banco();
        List<Conta> listaContas = new ArrayList<>(){{
            add(corrente);
            add(poupanca);
        }};
        banco.setNome("Banco Teste");
        banco.setListaConta(listaContas);

        System.out.println(banco.toString());
    }
}