# Exercício 2.5

O diagrama de classes abaixo modela um sistema de uma livraria, onde são catalogados
editoras, autores, e os livros disponíveis.

![Diagrama1](/Diagramas/2.5/diag1.png)

### Descrição dos métodos da classe Livro:
```+ toString(): String ``` retorna a representação textual do livro, com seus autores e
editora, conforme o formato 
abaixo:

```
 Titulo: A longa marcha, Ano: 1979, Paginas: 236 
 Autor(es):
 Stephen King (Richard Bachman)
 Editora:
 Cia das Letras (Sao Paulo)
```

 - **Observação**. O pseudônimo do autor não é obrigatório. Se o autor tiver, então seu pseudônimo fica entre parêntesis após o nome.

### Etapas para concluir o exercício:
1. Implemente as classes do diagrama de classes.
2. Crie objetos e relacione-os conforme o diagrama de objetos abaixo.
3. Execute o método ```toString()``` nos objetos Livro. Dados do livro/autores/editora são elaborados corretamente?
4. Implemente um caso de teste para cada editora. Em cada caso, crie os objetos e relacione-os conforme o diagrama de objetos. Utilize assertivas para verificar os
relacionamentos e também a representação textual.

![Diagrama2](/Diagramas/2.5/diag2.png)


