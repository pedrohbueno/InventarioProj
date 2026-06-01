package br.edu.unifaj.cc.poo.aula5;

public class Mesa extends Patrimonio{
    private String material;
    private int tamanho; // em cm

    public Mesa(String codigo, String descricao, String material, int tamanho) {
        super(codigo, descricao);
        this.material = material;
        this.tamanho = tamanho;
    }

    public String getMaterial() { return material; }
    public int getTamanho() { return tamanho; }

    @Override
    public void exibirDados() {
        System.out.println("[Mesa] Código: " + codigo + " | Descrição: " + descricao
                + " | Material: " + material + " | Tamanho: " + tamanho + "cm");
    }

    @Override
    public void gerarRelatorio() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== MESA ===\n");
        sb.append("  Código    : ").append(codigo).append("\n");
        sb.append("  Descrição : ").append(descricao).append("\n");
        sb.append("  Material  : ").append(material).append("\n");
        sb.append("  Tamanho   : ").append(tamanho).append("cm\n");
        if (!funcionarios.isEmpty()) {
            sb.append("  Alocada a:\n");
            for (Funcionario f : funcionarios) {
                sb.append("    - ").append(f.getNome()).append(" [").append(f.getMatricula()).append("]\n");
            }
        }
        return sb.toString();
    }
}
