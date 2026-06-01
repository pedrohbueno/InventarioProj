package br.edu.unifaj.cc.poo.aula5;


import java.util.ArrayList;
import java.util.List;

public class Inventario implements Relatorio {
    private int id;
    private List<Patrimonio> itens;
    private List<Funcionario> funcionarios;

    public Inventario(int id) {
        this.id = id;
        this.itens = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public int getId() { return id; }
    public List<Patrimonio> getItens() { return itens; }
    public List<Funcionario> getFuncionarios() { return funcionarios; }

    public void adicionarItem(Patrimonio p) {
        itens.add(p);
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("RELATÓRIO DO INVENTÁRIO #" + id);

        System.out.println("\n--- ITENS DE PATRIMÔNIO ---");
        for (Patrimonio p : itens) {
            System.out.println(p.gerarRelatorio());
        }

        System.out.println("\n--- FUNCIONÁRIOS ---");
        for (Funcionario f : funcionarios) {
            System.out.println(f.gerarRelatorio());
        }
    }

    @Override
    public void exibirRelatorio() {
        gerarRelatorio();
    }
}
