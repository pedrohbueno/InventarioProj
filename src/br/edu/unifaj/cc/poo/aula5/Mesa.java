package br.edu.unifaj.cc.poo.aula5;

public class Mesa extends Patrimonio {
    private String material;
    private int tamanho;

    public Mesa(String codigo, String descricao, String material, int tamanho) {
        super(codigo, descricao);
        this.material = material;
        this.tamanho  = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("--- Mesa ---");
        System.out.println("Codigo: "    + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Material: "  + material);
        System.out.println("Tamanho: "   + tamanho + "cm");
        System.out.println("Alocada a:");
        for (Funcionario f : funcionarios)
            System.out.println("  " + f.getNome());
    }
}
