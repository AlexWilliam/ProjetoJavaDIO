package me.dio.classes;

import java.util.Objects;

public class Cliente {

    private static int SEQUENCIAL = 1;

    private int idCliente;
    private String nome;
    private String cpf;

    public Cliente() {
        this.idCliente = SEQUENCIAL++;
    }

    public Cliente(String nome, String cpf) {
        this.idCliente = SEQUENCIAL++;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf);
    }

    @Override
    public String toString() {
        return "Cliente { \n" +
                "idCliente = '" + idCliente + '\'' + "\n" +
                "nome = '" + nome + '\'' + "\n" +
                ", cpf = '" + cpf + '\'' + "\n" +
                '}';
    }
}
