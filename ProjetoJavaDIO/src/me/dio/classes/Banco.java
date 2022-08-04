package me.dio.classes;

import java.util.List;
import java.util.Objects;

public class Banco {
    private String nome;
    private List<Conta> listaConta;

    public Banco() { }

    public Banco(String nome, List<Conta> listaConta) {
        this.nome = nome;
        this.listaConta = listaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getListaConta() {
        return listaConta;
    }

    public void setListaConta(List<Conta> listaConta) {
        this.listaConta = listaConta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(nome, banco.nome) && Objects.equals(listaConta, banco.listaConta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, listaConta);
    }

    @Override
    public String toString() {
        return "Banco { \n" +
                "nome='" + nome + '\'' + "\n" +
                ", listaConta=" + listaConta  + "\n" +
                '}';
    }
}
