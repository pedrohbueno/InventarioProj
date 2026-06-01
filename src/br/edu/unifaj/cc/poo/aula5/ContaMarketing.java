package br.edu.unifaj.cc.poo.aula5;

public class ContaMarketing implements Relatorio{
    private String numero;
    private String dataInicio;
    private String dataFim;
    private Cliente cliente;
    private Funcionario funcionario;

    public Contrato(String numero, String dataInicio, String dataFim,
                    Cliente cliente, Funcionario funcionario) {
        this.numero = numero;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public String getNumero() { return numero; }
    public Cliente getCliente() { return cliente; }
    public Funcionario getFuncionario() { return funcionario; }

    @Override
    public String gerarRelatorio() {
        return "=== CONTRATO ===\n"
                + "  Número      : " + numero + "\n"
                + "  Data Início : " + dataInicio + "\n"
                + "  Data Fim    : " + dataFim + "\n"
                + "  Funcionário : " + funcionario.getNome() + " (" + funcionario.getMatricula() + ")\n"
                + "  Cliente     : " + cliente.getNome() + " (" + cliente.getCpf() + ")";
    }

    @Override
    public void exibirRelatorio() {
        System.out.println(gerarRelatorio());
    }
}
