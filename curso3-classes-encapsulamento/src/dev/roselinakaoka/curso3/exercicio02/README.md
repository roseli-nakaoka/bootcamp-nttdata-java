# 📚 Curso 3 - Java e a Arte da Abstração com Classes e Encapsulamento

Este repositório contém exercícios práticos desenvolvidos durante o **Bootcamp NTT Data - Java e IA para Iniciantes**, no curso **Estruturas de Controle em Java**.

---

# 💳 Exercício 2 - Simulador de Carro em Java 🚗

Este é um projeto simples em Java que simula o funcionamento básico de um carro.  
O usuário pode interagir por meio de um menu no terminal para ligar, desligar, acelerar, frear, virar o volante, trocar de marcha e visualizar o estado atual do veículo.

## 📁 Estrutura do Projeto

- `Main.java`: Ponto de entrada da aplicação. Inicia o programa criando uma instância de `CarApp` e executando seu método `run()`.
- `CarApp.java`: Controla o fluxo da aplicação, interage com o usuário, exibe menus e executa ações com base nas escolhas do usuário.
- `Car.java`: Representa o modelo do carro, contendo atributos como nome, estado (ligado/desligado), velocidade e marcha. Contém métodos para alterar e validar o comportamento do carro.

## ▶️ Como Executar

1. **Pré-requisitos**: Ter o Java instalado (Java 11+).
2. Compile os arquivos:
   ```bash
   javac Main.java CarApp.java Car.java
   ```
3. Execute a aplicação:
   ```bash
   java Main
   ```

## 💡 Funcionalidades

- Cadastrar um carro com nome personalizado
- Ligar ou desligar o carro
- Acelerar e frear
- Trocar marchas com validação de velocidade permitida
- Virar para esquerda ou direita
- Ver o status atual do carro

## 📌 Observações Técnicas

- A entrada do usuário é feita com `Scanner`.
- A troca de marchas é validada com base na velocidade atual e na lógica da classe `Car`.
- Métodos auxiliares como `inputInt()` foram criados para validar entradas numéricas.

## 📚 Aprendizados Envolvidos

- Programação orientada a objetos (POO) em Java
- Validação de entrada de dados
- Encapsulamento e boas práticas de modelagem
- Interação com o usuário via terminal

## 🛠️ Melhorias Futuras (opcional)

- Interface gráfica (GUI) com JavaFX ou Swing
- Persistência de dados do veículo
- Suporte a múltiplos carros
- Testes unitários automatizados com JUnit

---

## ✍️ Autor

Desenvolvido com fins didáticos por Roseli Nakaoka.

---