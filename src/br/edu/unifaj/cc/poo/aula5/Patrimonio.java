package br.edu.unifaj.cc.poo.aula5;

import java.util.ArrayList;
import java.util.List;

public abstract class Patrimonio implements Relatorio {
    protected String codigo;
    protected String descricao;
    protected List<Funcionario> funcionarios;

    public Patrimonio() {
    }

    public Patrimonio(String codigo, String descricao) {
        this.codigo       = codigo;
        this.descricao    = descricao;
        this.funcionarios = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void alocarFuncionario(Funcionario f) { funcionarios.add(f); }
}
