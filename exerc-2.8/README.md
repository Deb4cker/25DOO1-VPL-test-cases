# Exercício 2.8

O diagrama de classes abaixo modela um sistema orientado a objetos que gerencia clubes sociais e seus sócios. Implemente no BlueJ as classes do diagrama.

![Diagrama](/Diagramas/2.8/diag.png)

### Descrição dos métodos da classe Clube:
```+ getSociosMenoresDeIdade()``` retorna os sócios menores de idade (18 anos).
```+ getIdadeMediaSocios()``` calcula e retorna a idade média dos sócios.
```+ getSociosIdadeMaiorQueMedia()``` retorna sócios com idade maior que a idade média.
```+ getArrecadacaoMensalidades()``` calcula e retorna o valor total que o clube arrecada com as mensalidades dos sócios.
```+ removerSocio( matricula)``` procura pelo sócio com a matrícula informada. Se existir, remove o sócio do clube e retorna true. Se não existir, retorna false.
```+ toString()``` retorna a representação textual do clube, com seus dados e dos sócios.

### Etapas para concluir o exerc´ıcio:
1. Crie o clube União localizado em Ibirama.
2. Adicione ao clube os seguintes sócios:

| Matrícula | Nome   | Idade | Mensalidade|
| --------- | ------ | ----- | -----------|
| 123       | Ana    | 50    | 75,50      |
| 456       | Maria  | 17    | 46,30      |
| 789       | Jose   | 45    | 70,00      |
| 111       | Pedro  | 15    | 50,00      |


3. Execute os métodos do clube e verifique se os resultados estão corretos.
4. Realize as alterações indicadas abaixo (em negrito) nos sócios:

| Matrícula | Nome   | Idade   | Mensalidade |
| --------- | ------ | ------- | ----------- |
| 123       | Ana    | **51*** | **80,00***  |
| 456       | Maria  | **18*** | 46,30       |
| 111       | Pedro  | 15      | **55,50***  |

5. Execute os métodos do clube e verifique se os resultados estão corretos.
6. Remova do clube o sócio com matrícula 456.
7. Execute os métodos do clube e verifique se os resultados estão corretos.
8. Crie uma classe de teste e implemente um caso de testes contendo os objetos criados. Utilize assertivas para verificar os clubes e seus sócios. Implemente as
alterações dos sócios e utilize assertivas para verificar o clube após as alterações.
Implemente a remoção do sócio e utilize assertivas para verificar o clube após a remoção.
