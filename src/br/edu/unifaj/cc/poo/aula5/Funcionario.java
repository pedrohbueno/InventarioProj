package br.edu.unifaj.cc.poo.aula5;

public class Funcionario extends Pessoa{
    private String matricula;
    private String cargo;
    private List<Cliente> clientes;

    public Funcionario(int id, String nome, String matricula, String cargo) {
        super(id, nome);
        this.matricula = matricula;
        this.cargo = cargo;
        this.clientes = new ArrayList<>();
    }

    public String getMatricula() { return matricula; }
    public String getCargo() { return cargo; }
    public List<Cliente> getClientes() { return clientes; }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    @Override
    public void exibirDados() {
        System.out.println("[Funcionário] ID: " + id + " | Nome: " + nome
                + " | Matrícula: " + matricula + " | Cargo: " + cargo);
    }

    @Override
    public String gerarRelatorio() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== FUNCIONÁRIO ===\n");
        sb.append("  ID         : ").append(id).append("\n");
        sb.append("  Nome       : ").append(nome).append("\n");
        sb.append("  Matrícula  : ").append(matricula).append("\n");
        sb.append("  Cargo      : ").append(cargo).append("\n");
        if (!clientes.isEmpty()) {
            sb.append("  Clientes vinculados:\n");
            for (Cliente c : clientes) {
                sb.append("    - ").append(c.getNome()).append(" (").append(c.getCpf()).append(")\n");
            }
        }
        return sb.toString();
    }
}
