# 📚 Curso 4 - Herança e Polimorfismo em Java

Este repositório contém exercícios práticos desenvolvidos durante o **Bootcamp NTT Data - Java e IA para Iniciantes**, no curso sobre **Herança e Polimorfismo em Java**.

---

## Estrutura dos Exercícios

Cada exercício está contido em seu próprio pacote para melhor organização e separação de responsabilidades.

---

### 📦 `Exercicio 01`

**Objetivo:**  
Criar uma hierarquia de classes para representar diferentes tipos de ingressos de cinema.

**Descrição:**  
- Classe base: `Ingresso` com os atributos:
  - `preco`: valor base do ingresso
  - `titulo`: nome do filme
  - `formatoAudio`: indica se é DUBLADO ou LEGENDADO;
- Subclasses:
  - `MeiaEntrada`: retorna o valor com 50% de desconto
  - `IngressoFamilia`: aplica desconto de 5% caso o número de pessoas seja maior que 3

**Conceitos trabalhados:** Herança, polimorfismo, sobrescrita de métodos.

---

### 📦 `Exercício 02`

**Objetivo:**  
Modelar os diferentes tipos de usuários de um sistema com comportamentos e atributos distintos.

**Descrição:**  
- Classe base: `Funcionario` com atributos comuns (`nome`, `email`, `senha`, `administrador` (verdadeiro ou falso))
- Subclasses:
  - `Gerente`: sempre com permissão de administrador
  - `Vendedor`: possui quantidade de vendas e não é administrador
  - `Atendente`: possui controle de caixa e não é administrador

**Principais métodos:**
- Login e logoff
- Alteração de dados, senha, administrador;
- Funcionalidades específicas:
  - Gerente: gerar relatórios, consultar vendas
  - Vendedor: realizar e consultar vendas
  - Atendente: receber pagamentos e fechar caixa

**Conceitos trabalhados:** Herança, encapsulamento, métodos específicos por tipo de usuário.

---

### 📦 `Exercicio 03`

**Objetivo:**  
Criar uma hierarquia de classes para representar relógios em diferentes formatos de hora.

**Descrição:**  
- Classe base: `Clock` com atributos:
  - `hora`, `minuto`, `segundo` com validações
- Método abstrato: `Clock convertClock(Clock outherClock)`
- Subclasses:
  - `BRClock`: usa formato 24h
  - `USClock`: usa formato 12h com sufixo AM/PM

**Conceitos trabalhados:** Abstração, herança, métodos abstratos, validação de dados.

---

## Como executar os exemplos

1. Clone o repositório:
   ```bash
   git clone https://github.com/roseli-nakaoka/bootcamp-nttdata-java
   ```
2. Importe o projeto em sua IDE Java (como IntelliJ ou Eclipse).
3. Execute a classe `Main` presente em cada pacote de exercício para ver os exemplos em ação.

---

## Tecnologias Utilizadas

- Java 17+
- IDE: IntelliJ IDEA
- Paradigma: Programação Orientada a Objetos (POO)

---

## Autor

Desenvolvido como parte da trilha de estudos do Bootcamp NTT Data - Java e IA para Iniciantes em Java.

---
