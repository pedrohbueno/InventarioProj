package br.edu.unifaj.cc.poo.aula5;

public class Cadeira extends Patrimonio {
    private String tipo;
    private String cor;

    public Cadeira(String codigo, String descricao, String tipo, String cor) {
        super(codigo, descricao);
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() { return tipo; }
    public String getCor() { return cor; }

    @Override
    public void exibirDados() {
        System.out.println("[Cadeira] Código: " + codigo + " | Descrição: " + descricao
                + " | Tipo: " + tipo + " | Cor: " + cor);
    }

    @Override
    public String gerarRelatorio() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== CADEIRA ===\n");
        sb.append("  Código    : ").append(codigo).append("\n");
        sb.append("  Descrição : ").append(descricao).append("\n");
        sb.append("  Tipo      : ").append(tipo).append("\n");
        sb.append("  Cor       : ").append(cor).append("\n");
        if (!funcionarios.isEmpty()) {
            sb.append("  Alocada a:\n");
            for (Funcionario f : funcionarios) {
                sb.append("    - ").append(f.getNome()).append(" [").append(f.getMatricula()).append("]\n");
            }
        }
        return sb.toString();
    }
}
