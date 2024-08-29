# Exercício 2.3

Implemente as classes Empresa e Funcionário do diagrama a seguir.
Note que existe um relacionamento entre Empresa e Funcionário.

![Diagrama1](/Diagramas/2.3/diag1.png)

### Descrição dos métodos da classe Empresa:

```+ imprimeFuncionarios() : void``` deve imprimir uma relação com os dados dos funcionários empregados da empresa.
```+ getDespesaFolhasPagamento() : double``` deve calcular e retornar o valor total que a empresa gasta com a folha de pagamento de seus empregados.

### Etapas para concluir o exercício:
1. Crie objetos de Empresa e Funcionário do diagrama de objetos a seguir.

![Diagrama2](/Diagramas/2.3/diag2.png)

2. Execute os métodos ```imprimeFuncionarios()``` e ```getDespesaFolhasPagamento()``` de cada empresa e verifique se o resultado está correto.
3. Altere o valor de salário mensal de alguns funcionários.
4. Repita o passo 2. O resultado reflete a alteração dos salários? Por quê?
5. Para cada Empresa do diagrama de objetos acima, implemente um caso de testes automatizado com os objetos criados e relacionados.
