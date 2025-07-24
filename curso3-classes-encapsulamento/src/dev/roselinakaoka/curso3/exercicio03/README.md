# 🛁 Pet Wash Machine

Este projeto simula o funcionamento de uma máquina de banho para pets em um petshop, com controle de recursos (água e shampoo) e regras de operação. Desenvolvido em Java, o programa utiliza quatro classes principais para estruturar a aplicação.

---

## 🧱 Estrutura do Projeto

- **Main.java**  
  Classe principal que inicia a aplicação executando o método `run()` da classe `PetWashApp`.

- **Pet.java**  
  Representa um pet com nome, tipo e estado de limpeza (`limpo` ou `sujo`).

- **PetWashApp.java**  
  Controla o fluxo da aplicação, interagindo com o usuário via terminal.

- **PetWashMachine.java**  
  Simula a máquina de banho, gerenciando a entrada e saída do pet, o consumo e abastecimento de água e shampoo, e a limpeza da máquina.

---

## ⚙️ Regras de Operação

- A máquina só permite **1 pet por vez**.
- Cada **banho consome**:
  - 10 litros de água
  - 2 litros de shampoo
- Capacidade máxima da máquina:
  - 30 litros de água
  - 10 litros de shampoo
- O abastecimento adiciona **2 litros por vez** (tanto para água quanto shampoo).
- Se um pet **sair sujo**, a máquina precisa ser **limpa** antes de outro banho.
  - A limpeza consome:
    - 3 litros de água
    - 1 litro de shampoo

---

## ▶️ Como Executar

1. Compile os arquivos `.java`:

   ```bash
   javac Main.java Pet.java PetWashApp.java PetWashMachine.java
   ```

2. Execute o programa:

   ```bash
   java Main
   ```

---

## 📚 Exemplo de Uso

Ao rodar o programa, o usuário poderá:
- Colocar um pet na máquina
- Dar banho
- Retirar o pet
- Abastecer água ou shampoo
- Limpar a máquina
- Verificar os níveis dos insumos

---

## 🧼 Objetivo Didático

Este projeto tem fins educacionais, com foco em:
- Prática de POO (Programação Orientada a Objetos)
- Modelagem de regras de negócio
- Manipulação de estado com atributos privados e métodos públicos
