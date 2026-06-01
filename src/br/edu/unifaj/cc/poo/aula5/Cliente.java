package br.edu.unifaj.cc.poo.aula5;

public class Cliente extends Pessoa {
    private String cpf;
    private String email;



    public Cliente(int id, String nome, String cpf, String email) {
        super(id, nome);
        this.cpf   = cpf;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("--- Cliente ---");
        System.out.println("ID: "    + id);
        System.out.println("Nome: "  + nome);
        System.out.println("CPF: "   + cpf);
        System.out.println("Email: " + email);
    }
}
