
# 📚 Curso 3 - Java e a Arte da Abstração com Classes e Encapsulamento

Este repositório contém exercícios práticos desenvolvidos durante o **Bootcamp NTT Data - Java e IA para Iniciantes**, no curso **Estruturas de Controle em Java**.

---


# 💳 Exercício 1 - Sistema Bancário em Java

Este é um projeto simples de simulação de um sistema bancário feito em Java, com operações básicas como cadastro de contas, depósitos, saques, pagamentos e verificação de uso do cheque especial. Foi desenvolvido com foco em aprendizado de orientação a objetos, boas práticas e validação de entradas do usuário via console.

---

## 📦 Estrutura do Projeto

O sistema é composto pelas seguintes classes:

### 🔹 `BankAccount`
Representa uma conta bancária. Armazena CPF, nome, número da conta (gerado automaticamente), saldo, limite e taxa de cheque especial. Contém métodos para acessar e atualizar esses dados e verificar uso do limite.

### 🔹 `BankService`
Contém a lógica de negócio do sistema: cadastro de contas, saques, depósitos, pagamento de boletos e consultas. Implementa regras de validação, aplicação de taxas e atualização de saldos.

### 🔹 `BankApp`
Interface principal do programa. Exibe o menu, captura a escolha do usuário e delega a execução para os métodos da `BankService`.

### 🔹 `InputReader`
Classe utilitária que encapsula a leitura de dados do usuário com validação de tipos: `String`, `int`, `double` e `LocalDate`. Garante que o programa só continue com entradas válidas.

### 🔹 `Validator`
Classe auxiliar com métodos para validar o nome (apenas letras e espaços) e CPF (exatamente 11 dígitos).

---

## 🖥️ Funcionalidades

- ✅ Cadastro de conta bancária com CPF, nome e depósito inicial
- ✅ Geração automática de número da conta
- ✅ Definição dinâmica do limite de cheque especial
- ✅ Depósito e saque com verificação de limite
- ✅ Pagamento de boletos com aviso de vencimento
- ✅ Verificação de uso do cheque especial e taxas aplicadas
- ✅ Validação de dados de entrada

---

## 🚀 Como Executar

1. Compile todas as classes:

```bash
javac *.java
```

2. Execute o programa principal:

```bash
java BankApp
```

3. Siga as instruções no menu exibido no console.

---

## 📘 Exemplo de Uso

```
------------  Sistema Bancário -------------

----  1 - Cadastrar Conta Bancária
----  2 - Consultar Saldo
----  3 - Consultar Cheque Especial
----  4 - Depositar Dinheiro
----  5 - Sacar Dinheiro
----  6 - Pagar um boleto
----  7 - Verificar uso de cheque especial
----  0 - Sair
```

---

## 📚 Requisitos

- Java 8 ou superior
- Terminal/console para entrada de dados

---

## ✍️ Autor

Desenvolvido com fins didáticos por Roseli Nakaoka.

---
