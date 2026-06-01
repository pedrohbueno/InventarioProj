package br.edu.unifaj.cc.poo.aula5;

import java.util.ArrayList;
import java.util.List;

public class Inventario implements Relatorio {
    private int id;
    private List<Patrimonio> itens;
    private List<Funcionario> funcionarios;

    public Inventario(int id) {
        this.id           = id;
        this.itens        = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Patrimonio> getItens() {
        return itens;
    }

    public void setItens(List<Patrimonio> itens) {
        this.itens = itens;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adicionarItem(Patrimonio p)        { itens.add(p); }
    public void adicionarFuncionario(Funcionario f){ funcionarios.add(f); }

    @Override
    public void gerarRelatorio() {
        System.out.println("=== Inventario #" + id + " ===");
        System.out.println("-- Patrimonio --");
        for (Patrimonio p : itens)
            p.gerarRelatorio();
        System.out.println("-- Funcionarios --");
        for (Funcionario f : funcionarios)
            f.gerarRelatorio();
    }
}
