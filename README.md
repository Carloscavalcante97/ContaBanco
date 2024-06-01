# Projeto ContaBanco
Criador: <a href="https://github.com/glysns" previewlistener="true">Gleyson Sampaio</a>
Este projeto tem como objetivo criar um programa que receberá dados via terminal, contendo as características de uma conta bancária conforme os atributos abaixo. O programa será implementado na classe `ContaTerminal.java`.

## Atributos da Conta

| Atributo     | Tipo    | Exemplo        |
|--------------|---------|----------------|
| Numero       | Inteiro | 1021           |
| Agencia      | Texto   | 067-8          |
| Nome Cliente | Texto   | MARIO ANDRADE  |
| Saldo        | Decimal | 237.48         |

## Instruções

1. **Regras de Declaração de Variáveis**
   - Revise a declaração de variáveis necessárias para armazenar os atributos da conta.

2. **Entrada de Dados via Terminal**
    - Utilize a classe `Scanner` para receber dados via terminal.
    - Solicite os dados ao usuário conforme os exemplos abaixo:

      ```plaintext
      Programa: "Por favor, digite o número da Agência !"
      Usuário: 1021 (depois ENTER para o próximo campo)
      ```
  
3. **Processamento e Saída de Dados**
    - Utilize concatenação e a classe `String` com o método `concat` para processar e exibir a mensagem final.
  
4. **Mensagem Final**
    - Após inserção de todas as informações, o sistema deverá exibir a mensagem:

      ```plaintext
      "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."
      ```
5. **Processamento de depósitos e saques**
 ```plaintext
     -Foi adicionado ao codigo de forma extra funções para depósitos e saques deixando assim mais completo
      ```
