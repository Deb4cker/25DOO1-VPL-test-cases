# Exercício 2.6

Na câmara dos deputados existem comissôes que discutem determinados assuntos. Por exemplo, há a Comissão de Constituição e Justiça, e a Comissão de Educação. Deseja-se
criar um sistema orientado a objetos para representar os deputados e as comissões.
 - De cada deputado, o sistema deve guardar a sua matrícula(que é um código geral do deputado na câmara como um todo), seu nome, o número do seu partido, e o estado que o deputado representa (ex: PR, SC, RS).
 - Cada comissão possui um título, e possui deputados. Um deputado pode fazer parte de diversas comissões.
 
 ### Sobre o objeto que representa um deputado:
 - Uma vez que o objeto do deputado é criado, só deve ser possível alterar seu partido.
 - Deve ter um método para retornar a representação textual do deputado.
 
### Sobre o objeto que representa uma comissão, deve possuir métodos para:
 - Obter todos os deputados na comissão
 - Obter todos os deputados na comissão que são de determinado partido.
 - Obter todos os deputados na comissão que são de determinado estado.
 - Imprimir uma relação com todos os deputados na comissão.
 - Imprimir uma relação com todos os deputados na comissão de determinado partido.
 -Imprimir uma relação com todos os deputados na comissão de determinado estado.

### Etapas para concluir o exercício:
1. Faça um diagrama de classes para modelar o sistema orientado a objetos.
2. Implemente no BlueJ as classes do seu diagrama.
3. Crie os objetos a seguir, relacione-os:
```dep1: Joao, matrícula 1234, partido 99, estado SC.```
```dep2: Maria, matrícula 5678, partido 98, estado RS.```
```dep3: Jose, matrícula 9012, partido 99, estado SP.```
```dep4: Pedro, matrícula 3456, partido 91, estado RS.```
```dep5: Ana, matrícula 7890, partido 91, estado SC.```
```com1: Comissao de Educacao, deputados: dep1, dep3, dep4.```
```com2: Comissao de Constituicao e Justica, deputados: dep2, dep4, dep5.```

4. Execute os métodos de impressão nas comissões para verificar o resultado.
5. Crie uma classe de teste e implemente um caso de testes contendo os objetos acima.
Utilize assertivas para verificar as comissões e seus deputados.
