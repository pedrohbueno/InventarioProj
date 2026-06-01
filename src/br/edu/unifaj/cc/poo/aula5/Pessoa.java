package br.edu.unifaj.cc.poo.aula5;

public abstract class Pessoa implements Relatorio {
    protected int id;
    protected String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }

    public abstract void exibirDados();

    @Override
    public void exibirRelatorio() {
       gerarRelatorio();
    }
}
