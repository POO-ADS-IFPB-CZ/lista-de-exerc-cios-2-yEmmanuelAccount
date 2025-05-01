# Lista 02 de Exercícios - (23/04/2025 para 03/05/2025)

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zaY_p4dR)

# Questão 01
    1. Explique por que é considerado boa prática usar getters e setters em vez de tornar os atributos públicos em uma classe. Dê um exemplo onde usar um setter permite controlar melhor a integridade dos dados de um objeto.

Usando _getters_ e _setters_, o desenvolvedor do código pode escolher quais informações deseja deixar passíveis de serem obtidas ou mudadas em uma classe, algo que não aconteceria se utilizasse a função _public_.

* O exemplo de código está no arquivo [Reposta01.java](./Questao01/Resposta01.java).

Nesse código, existem _sets_ para todos os atributos da classe, mas há _gets_ de alguns dos atributos (Nome, ValorPedido, Endereço), para que informações muito pessoais não possam ser facilmente obtidas por pessoas não autorizadas.

# Questão 02
    2. Considere que você está modelando um sistema de controle de biblioteca. Responda:

* Quais informações você considera relevantes para representar um livro em um sistema?

Código, Título do Livro, Nome do Autor, Ano de Publicação, Editora, Gênero.

* Por que podemos dizer que uma classe Livro seria uma abstração no seu código?

Pode ser considerada uma abstração porque representa um conceito específico, centraliza as informações relevantes em um único lugar, além de que permite que informações podem ser ocultadas ou disponibilizada de acordo com sua relevância.

* Liste ao menos 3 métodos que fariam sentido existir nessa classe.

estaDisponivel, numeroCopias, reservarLivro, devolverLivro.

# Questão 03
    3. Implemente uma classe Produto com os seguintes atributos privados: codigo (int), nome (String), preco (double), estoque (int). Inclua:

* Um construtor que receba os quatro parâmetros
* Getters para todos os atributos
* Um setter apenas para o preço, que não deve aceitar valores negativos
* Um método exibirInfo() que imprime todas as informações do produto

# Questão 04
    4.1. Crie uma classe chamada ContaCorrente com os seguintes atributos privados:
    
       1. numero (int)
       2. titular (String)
       3. saldo (float)

    4.2. Implemente os seguintes métodos públicos:

      1. sacar(float valor): subtrai o valor do saldo, se houver saldo suficiente. Não permitindo sacar mais de 10000 por operação.
      2. depositar(float valor): adiciona o valor ao saldo, apenas se o valor for positivo e se não for superir a 10000.
      3. consultarSaldo(): retorna o saldo atual.

    4.3. Crie também uma classe principal (por exemplo, Main) que:

      1. Leia do teclado os dados iniciais de uma conta (número, titular). O saldo inicial deve ser 0.

    4.4. Exiba um menu em loop, permitindo que o usuário escolha entre:
        1. Sacar um valor
        2. Depositar um valor
        3. Consultar o saldo
        4. Sair do programa

    4.5. O menu deve continuar sendo exibido até que o usuário escolha sair. Pode-se reutilizar o código feito em sala.
