# Projeto Curso 5 - Interfaces e Lambda em Java

## Descrição do Projeto

Este repositório reúne os exercícios práticos do **Curso 5 - Interfaces e Lambda em Java**, com foco na aplicação dos conceitos de interfaces tradicionais, interfaces funcionais e expressões lambda.

O projeto contém três exercícios principais:

1. **Envio de Mensagens**  
   Implementação da interface `Messager` com diferentes canais (`Sms`, `Email`, `SocialMedia`, `WhatsApp`). O programa permite que o usuário escolha o canal e envie uma mensagem abstrata via polimorfismo.

2. **Cálculo de Tributos por Categoria**  
   Uso da interface funcional `TaxGetter` para calcular impostos sobre produtos de diferentes categorias (`Food`, `HealthWellBeing`, `Clothing`, `Culture`). Um menu interativo permite selecionar a categoria e informar o valor do produto para cálculo do imposto.

3. **Cálculo de Área de Formas Geométricas**  
   Aplicação da interface `GeometricShapes` com classes `Square`, `Rectangle` e `Circle`. Um menu interativo solicita as dimensões para calcular e exibir a área da forma escolhida.

---

## Estrutura do Projeto

```plaintext

curso5
├── exercicio01
│   ├── Email.class
│   ├── Main.class
│   ├── Messager.class
│   ├── Sms.class
│   ├── SocialMedia.class
│   └── WhatsApp.class
├── exercicio02
│   ├── Clothing.class
│   ├── Culture.class
│   ├── Food.class
│   ├── HealthWellBeing.class
│   ├── Main.class
│   └── TaxGetter.class
└── exercicio03
    ├── Circle.class
    ├── GeometricShapes.class
    ├── Main.class
    ├── Rectangle.class
    └── Square.class
```
---

## Como Executar

1. Clone este repositório:

   ```bash
   git clone https://github.com/roseli-nakaoka/bootcamp-nttdata-java/curso5-interface-lambda/
```

