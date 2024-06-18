# Desafios do Bootcamp Santander 2024 / Backend Java

## Autor do Desafio:
DIO - Digital Innovation One

## Sintaxe
Exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo.

## Condições, Loops e execeções na Prática com Java<br>1 / 5 - Operações Bancárias Simples com Switch.

### Descrição
Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas.
A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

### Entrada
+ O programa exibirá um menu com as seguintes opções:
1. Depositar
2. Sacar
3. Consultar Saldo
4. Encerrar
+ O usuário escolherá uma dessas opções digitando o número correspondente.

### Saída
+ Utilizando um switch, o programa realizará a operação escolhida pelo usuário.
+ Se o usuário escolher:
  + 1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
  + 2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
  + 3: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
  + 0: O programa encerrará, imprimindo "Programa encerrado.".
 
### Exemplo
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| **Entrada** | **Saída**           | **Entrada** | **Saída**           | **Entrada** | **Saída**           |
|-------------|---------------------|-------------|---------------------|-------------|---------------------|
| 1           | Saldo atual: 50.0   | 3           | Saldo atual: 0.0    | 1           | Saldo atual: 1000.0 |
| 50          | Salso insuficiente. | 1           | Salso atual: 550.0  | 1000        | Salso atual: 500.0  |
| 2           | Programa encerrado  | 550         | Programa encerrado  | 2           | Programa encerrado  |
| 100         |                     | 0           |                     | 0           |                     |
| 0           |                     |             |                     |             |                     |

## Condições, Loops e execeções na Prática com Java<br>2 / 5 - Verificação de Número de Conta Bancária

### Descrição
Você está desenvolvendo um programa simples em Java para verificar se um número de conta bancária é válido. O número da conta deve ter exatamente 8 dígitos.

### Entrada
+ O programa solicitará ao usuário que digite o número da conta bancária.

### Saída
+ O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos.
+ Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
+ Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, _IllegalArgumentException_) e informará que o número da conta é inválido.
 
### Exemplo
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| **Entrada** | **Saída**                                        | 
|------------------------|---------------------------------------|
| 01020304               | Numero de conta valido                |
| <p>1234568<br></p>     | <p>Erro: Numero de conta invalido <br> Digite exatamente 8 digitos </p>  |         
| 3231                   | <p>Erro: Numero de conta invalido <br> Digite exatamente 8 digitos </p>  |

## Condições, Loops e execeções na Prática com Java<br>3 / 5 - Verificador de Idade para Conta bancária

### Descrição
Você está desenvolvendo um programa simples em Java para verificar se um cliente é elegível para criar uma conta bancária.<br> A condição é que o cliente deve ter pelo menos 18 anos de idade.

### Entrada
+ O programa solicitará ao usuário que digite sua idade.

### Saída
+ Utilizando apenas um bloco _if_ e _else_, o programa verificará se a idade do cliente é igual ou superior a 18 anos.
+ Se a idade for maior ou igual a 18, o programa informará que o cliente é elegível para criar uma conta bancária.
+ Se a idade for menor que 18, o programa informará que o cliente não é elegível para criar uma conta bancária.
 
### Exemplo
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| **Entrada**       | **Saída**                                                         | 
|-------------------|-------------------------------------------------------------------|
| <p>17<br></p>     | <p>Voce nao esta elegivel para criar<br> uma conta bancaria.</P>  |
| <p>26<br></p>     | <p>Voce nao esta elegivel para criar<br> uma conta bancaria.</P>  |  
| 18                | <p>Voce esta elegivel para criar<br> uma conta bancaria.</P>      |




