# Sintaxe - Desafio
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário:

* Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
* Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.


## Documentação da API

#### Retorna todos os itens

```http

```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Inteiro` | 102325 |
|`Agencia`|`String`| 154-3|
|`Nome`| `String`| Maria|
|`Saldo`| `Floar`| 200,00|

Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 (depois ENTER para o próximo campo)
Revise sobre concatenação e classe String com método concat
Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
* "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

