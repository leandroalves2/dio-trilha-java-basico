# Desafio Sintaxe

Este projeto foi desenvolvido como parte dos exercícios do módulo de Sintaxe. O objetivo é praticar e consolidar os conceitos aprendidos, implementando um sistema que recebe dados via terminal para criar uma conta bancária, e exibe uma mensagem de confirmação com os dados fornecidos.

## Funcionalidades

- **Entrada de Dados via Terminal**: O sistema solicita ao usuário as informações de uma conta bancária e recebe os dados via terminal.
  - **Atributos da Conta**:
    - **Numero**: Número inteiro representando o número da conta (Exemplo: 1234).
    - **Agencia**: Texto representando o número da agência (Exemplo: 567-8).
    - **Nome Cliente**: Texto representando o nome do cliente (Exemplo: LEANDRO ALVES).
    - **Saldo**: Número decimal representando o saldo inicial da conta (Exemplo: 237.48).

- **Interatividade**: O sistema solicita cada dado com uma mensagem específica, por exemplo:
  - Programa: "Por favor, digite o número da Agência: "
  - Usuário: 567-8

- **Mensagem de Confirmação**: Após a inserção de todos os dados, o sistema exibe uma mensagem de confirmação com os dados fornecidos, formatada da seguinte maneira:
  - "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."

## Estrutura do Projeto

- **ContaBanco**: Nome do projeto.
- **ContaTerminal.java**: Classe principal que contém a lógica do programa.

## Como Executar

1. Clone o repositório para o seu ambiente local.
2. Navegue até o diretório do projeto.
3. Compile a classe Java:
   ```sh
   javac ContaTerminal.java
