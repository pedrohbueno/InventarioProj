package br.edu.unifaj.cc.poo.aula5;

public class Cadeira extends Patrimonio {
    private String tipo;
    private String cor;

    public Cadeira(String codigo, String descricao, String tipo, String cor) {
        super(codigo, descricao);
        this.tipo = tipo;
        this.cor  = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("--- Cadeira ---");
        System.out.println("Codigo: "    + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Tipo: "      + tipo);
        System.out.println("Cor: "       + cor);
        System.out.println("Alocada a:");
        for (Funcionario f : funcionarios)
            System.out.println("  " + f.getNome());
    }
}
