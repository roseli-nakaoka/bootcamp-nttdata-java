package dev.roselinakaoka.curso4.exercicio02;

/*
 * Exercício 02- Herança com classes relacionadas a uma estrutura de funcionários de uma loja.
 * A superclasse abstrata `Funcionario` define atributos e comportamentos comuns como nome, email,
 * senha e se o funcionário é administrador. As subclasses `Gerente`, `Vendedor` e `Atendente`
 * especializam a lógica conforme suas funções:
 *
 * - `Gerente` possui acesso de administrador.
 * - `Vendedor` realiza vendas.
 * - `Atendente` realiza atendimentos e não possui acesso administrativo.
 *
 * Esta classe `Main` serve como ambiente de testes, onde são instanciados objetos das subclasses
 * e validadas regras como permissões, inicialização de atributos e chamadas de métodos.
 * Curso: Fundamentos da Linguagem de Programação Java
 * Autor: Roseli Nakaoka
 * Data: 24/07/2025
 */

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Alice", "alice@empresa.com", "1234", true);
        Vendedor vendedor = new Vendedor("Bob", "bob@empresa.com", "4321");
        Atendente atendente = new Atendente("Clara", "clara@empresa.com", "9999");

        gerente.realizarLogin();
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();

        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();

        atendente.realizarLogin();
        atendente.receberPagamento(150);
        atendente.receberPagamento(100);
        atendente.receberPagamento(15);
        atendente.fecharCaixa();
        atendente.realizarLogoff();

    }
}