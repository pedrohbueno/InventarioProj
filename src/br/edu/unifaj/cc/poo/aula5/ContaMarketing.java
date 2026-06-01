package br.edu.unifaj.cc.poo.aula5;

public class ContaMarketing implements Relatorio {
    private String id;
    private String plataforma;
    private Cliente cliente;
    private Funcionario funcionario;

    public ContaMarketing() {
    }

    public ContaMarketing(String id, String plataforma,
                          Cliente cliente, Funcionario funcionario) {
        this.id          = id;
        this.plataforma  = plataforma;
        this.cliente     = cliente;
        this.funcionario = funcionario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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
        System.out.println("--- Conta Maketing ---");
        System.out.println("ID: "          + id);
        System.out.println("Plataforma: "  + plataforma);
        System.out.println("Funcionario: " + funcionario.getNome());
        System.out.println("Cliente: "     + cliente.getNome());
    }
}
