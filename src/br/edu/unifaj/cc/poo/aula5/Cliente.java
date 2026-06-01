package br.edu.unifaj.cc.poo.aula5;

public class Cliente extends Pessoa {
    private String cpf;
    private String email;

    public Cliente(int id, String nome, String cpf, String email) {
        super(id, nome);
        this.cpf = cpf;
        this.email = email;
    }

    public String getCpf() { return cpf; }
    public String getEmail() { return email; }

    @Override
    public void exibirDados() {
        System.out.println("[Cliente] ID: " + id + " | Nome: " + nome
                + " | CPF: " + cpf + " | Email: " + email);
    }

    @Override
    public String gerarRelatorio() {
        return "=== CLIENTE ===\n"
                + "  ID    : " + id + "\n"
                + "  Nome  : " + nome + "\n"
                + "  CPF   : " + cpf + "\n"
                + "  Email : " + email;
    }
}

