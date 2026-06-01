package br.edu.unifaj.cc.poo.aula5;

public abstract class Pessoa implements Relatorio {
    protected int id;
    protected String nome;

    public Pessoa() {
    }

    public Pessoa(int id, String nome) {
        this.id   = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
