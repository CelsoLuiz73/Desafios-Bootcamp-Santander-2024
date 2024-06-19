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
 
### Exemplos
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
 
### Exemplos
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
 
### Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| **Entrada**       | **Saída**                                                         | 
|-------------------|-------------------------------------------------------------------|
| <p>17<br></p>     | <p>Voce nao esta elegivel para criar<br> uma conta bancaria.</P>  |
| <p>26<br></p>     | <p>Voce nao esta elegivel para criar<br> uma conta bancaria.</P>  |  
| 18                | <p>Voce esta elegivel para criar<br> uma conta bancaria.</P>      |


## Condições, Loops e execeções na Prática com Java<br>4 / 5 - Verificador de Cheque Especial

### Descrição
Você está desenvolvendo um programa simples em Java para verificar se uma conta bancária ultrapassou o limite do cheque especial.<br> A aplicação solicitará ao cliente que informe o saldo atual da conta bancária. Em seguida, o programa pedirá o valor de um saque que o cliente deseja realizar.

O limite do cheque especial será definido como 500 unidades monetárias.

### Entrada
+ O programa solicitará ao usuário que informe o saldo atual da conta bancária.
+ Em seguida, o programa solicitará o valor de um saque que o cliente deseja realizar.

### Saída
+ O programa deverá verificar se o saque ultrapassará o saldo disponível na conta.
+ Se o saque não ultrapassar o saldo, o programa informará que a transação foi realizada com sucesso.
+ Se o saque ultrapassar o saldo, o programa verificará se o valor do saque ultrapassa o cheque especial (definido como 500 unidades monetárias).
  + Se ultrapassar, o programa informará que a transação não pode ser realizada devido ao limite excedido.
  + Caso contrário, o programa informará que a transação foi realizada com sucesso, utilizando o cheque especial.
 
### Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| **Entrada**           | **Saída**                                                              | 
|-----------------------|------------------------------------------------------------------------|
| <p>1000<br>100</p>    | Transação realizada com sucesso.                                       |
| <p>2500<br>2750</p>   | <p>Transação realizada com sucesso<br>utilizando o cheque especial.</P>|  
| <p>300<br>1500</p>    | <p>Transação não realizada. Limite do<br>cheque especial excedido.</P> |


## Condições, Loops e execeções na Prática com Java<br>5 / 5 - Controle de Saques

### Descrição
Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária. O cliente pode fazer saques até atingir um limite diário predefinido.

### Entrada
+ O programa solicitará ao usuário que informe o limite diário de saque.
+ Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.

### Saída
+ Utilizando um laço _for_, o programa iterará sobre os saques.
+ Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
  + Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop.
  + Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.
 
### Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| **Entrada** | **Saída**                          | **Entrada** | **Saída**                           | **Entrada** | **Saída**                         |
|-------------|------------------------------------|-------------|-------------------------------------|-------------|-----------------------------------|
| 1500        | Saque realizado. Limite restante:  | 500         | Limite diario de saque atingido.    | 80          | Saque realizado. Limite restante: |
| 430         | 1070.0                             | 1500        | Transacoes encerradas.              | 40          | 40.0                              |
| 0           | Transacoes encerradas.             |             |                                     | 0           | Transacoes encerradas.            |
