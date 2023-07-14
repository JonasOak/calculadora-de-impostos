# Calculadora de Impostos

Esta é uma calculadora de impostos que permite calcular os impostos a serem pagos por pessoas físicas e empresas. Ela foi desenvolvida em Java e utiliza o paradigma de programação orientada a objetos.

## Funcionalidades

- Permite calcular os impostos para pessoas físicas e empresas com base em seu rendimento anual e despesas específicas.
- Para pessoas físicas, considera as despesas com saúde para dedução do imposto.
- Para empresas, considera o número de funcionários para determinar a alíquota do imposto.

## Requisitos

- Java SDK instalado
- Ambiente de desenvolvimento Java (IDE) para executar o código

## Como usar

1. Abra o arquivo `Program.java` em seu ambiente de desenvolvimento Java.
2. Compile e execute o código para iniciar a calculadora de impostos.
3. Digite o número de contribuintes que deseja calcular os impostos.
4. Forneça os dados solicitados para cada contribuinte, como nome, tipo (individual ou empresa), renda anual e informações adicionais específicas.
5. A calculadora exibirá os impostos pagos por cada contribuinte e o total de impostos pagos por todos.

## Estrutura do código

- O arquivo `Program.java` contém o método `main` que inicia o programa e permite a interação com o usuário.
- O pacote `entities` contém as classes relacionadas aos contribuintes e seus impostos.
  - A classe abstrata `TaxPayer` é a classe pai que define os atributos e métodos comuns a todos os contribuintes.
  - A classe `Individual` é uma subclasse de `TaxPayer` e representa um contribuinte individual. Ela possui um método `tax` para calcular os impostos com base em sua renda anual e despesas com saúde.
  - A classe `Company` é uma subclasse de `TaxPayer` e representa uma empresa. Ela também possui um método `tax` para calcular os impostos com base na renda anual e no número de funcionários.

## Contribuindo

Este projeto foi desenvolvido como exemplo e não requer contribuições adicionais. No entanto, sinta-se à vontade para fazer fork do projeto e adaptá-lo para suas necessidades, ou fornecer sugestões e melhorias.

## Autor

Este projeto foi desenvolvido por Jonas Carvalho como parte de um exercício de programação em Java.
