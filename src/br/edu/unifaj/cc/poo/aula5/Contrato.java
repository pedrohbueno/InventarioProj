package br.edu.unifaj.cc.poo.aula5;

public class Contrato implements Relatorio {
    private String numero;
    private String dataInicio;
    private String dataFim;
    private Cliente cliente;
    private Funcionario funcionario;

    public Contrato() {
    }

    public Contrato(String numero, String dataInicio, String dataFim,
                    Cliente cliente, Funcionario funcionario) {
        this.numero      = numero;
        this.dataInicio  = dataInicio;
        this.dataFim     = dataFim;
        this.cliente     = cliente;
        this.funcionario = funcionario;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("--- Contrato ---");
        System.out.println("Numero: "      + numero);
        System.out.println("Data Inicio: " + dataInicio);
        System.out.println("Data Fim: "    + dataFim);
        System.out.println("Funcionario: " + funcionario.getNome());
        System.out.println("Cliente: "     + cliente.getNome());
    }
}
