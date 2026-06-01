package br.edu.unifaj.cc.poo.aula5;

public class Main {

    public static void main(String[] args) {

        System.out.println("RA: 12530354 | Nome: Pedro Henrique Bueno Dos Santos");
        System.out.println("Disciplina: POO | Aula 5 - Inventário");
        System.out.println();

        // ---- Criar Clientes ----
        Cliente cl1 = new Cliente(1, "Maria Oliveira", "111.222.333-44", "maria@email.com");
        Cliente cl2 = new Cliente(2, "Pedro Santos",   "555.666.777-88", "pedro@email.com");

        // ---- Criar Funcionários ----
        Funcionario f1 = new Funcionario(1, "Ana Lima",    "F1", "Analista");
        Funcionario f2 = new Funcionario(2, "Carlos Melo", "F2", "Gerente de Marketing");

        f1.adicionarCliente(cl1);
        f2.adicionarCliente(cl2);

        // ---- Criar Patrimônio ----
        Mesa    m1 = new Mesa   ("M1", "Mesa de escritório",   "MDF",   150);
        Mesa    m2 = new Mesa   ("M2", "Mesa de reunião",      "Madeira", 200);
        Cadeira c1 = new Cadeira("C1", "Cadeira ergonômica",   "Giratória", "Preta");
        Cadeira c2 = new Cadeira("C2", "Cadeira de recepção",  "Fixa",      "Cinza");

        // Alocar Mesas
        m1.alocarFuncionario(f1);
        m1.alocarFuncionario(f2);
        m2.alocarFuncionario(f2);

        // Alocar Cadeiras
        c1.alocarFuncionario(f1);
        c2.alocarFuncionario(f2);

        // ---- Criar Contrato
        Contrato co1 = new Contrato("CO-2024-001", "01/01/2024", "31/12/2024", cl1, f1);

        // ---- Criar Conta de Marketing
        ContaMarketing ct1 = new ContaMarketing("CT-MKT-001", "Instagram", cl2, f2);

        // ---- Criar Inventário
        Inventario inv = new Inventario(1);
        inv.adicionarFuncionario(f1);
        inv.adicionarFuncionario(f2);
        inv.adicionarItem(m1);
        inv.adicionarItem(m2);
        inv.adicionarItem(c1);
        inv.adicionarItem(c2);

        // ========================================================
        // RELATÓRIO COMPLETO
        // ========================================================
        System.out.println("========== RELATÓRIO COMPLETO ==========\n");

        System.out.println(">>> CLIENTES <<<");
        cl1.gerarRelatorio();
        System.out.println();
        cl2.gerarRelatorio();
        System.out.println();

        System.out.println(">>> FUNCIONÁRIOS <<<");
        f1.gerarRelatorio();
        System.out.println();
        f2.gerarRelatorio();
        System.out.println();

        System.out.println(">>> PATRIMÔNIO <<<");
        m1.gerarRelatorio();
        System.out.println();
        m2.gerarRelatorio();
        System.out.println();
        c1.gerarRelatorio();
        System.out.println();
        c2.gerarRelatorio();
        System.out.println();

        System.out.println(">>> CONTRATOS <<<");
        co1.gerarRelatorio();
        System.out.println();

        System.out.println(">>> CONTAS DE MARKETING <<<");
        ct1.gerarRelatorio();
        System.out.println();

        System.out.println(">>> INVENTÁRIO COMPLETO <<<");
        inv.gerarRelatorio();
    }
}
