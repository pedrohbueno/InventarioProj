package br.edu.unifaj.cc.poo.aula5;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private String matricula;
    private String cargo;
    private List<Cliente> clientes;

    public Funcionario(int id, String nome, String matricula, String cargo) {
        super(id, nome);
        this.matricula = matricula;
        this.cargo     = cargo;
        this.clientes  = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("--- Funcionario ---");
        System.out.println("ID: "        + id);
        System.out.println("Nome: "      + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Cargo: "     + cargo);
        System.out.println("Clientes:");
        for (Cliente c : clientes)
            c.gerarRelatorio();
    }
}
