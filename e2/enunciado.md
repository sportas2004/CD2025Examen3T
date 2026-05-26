# Exercicio: Probas unitarias dunha clase

O proxecto ten unha clase permite xestionar produtos dunha tenda.

## Tarefas

1. Crea unha clase de probas chamada `ProductoTest`.

2. Implementa probas unitarias con JUnit 5 para comprobar o correcto funcionamento da clase.

3. As probas deben cubrir:

   * creación correcta dun produto
   * venda válida
   * venda con cantidade negativa
   * venda con cantidade 0
   * venda superior ao stock dispoñible
   * reposición válida
   * reposición con cantidade negativa
   * reposición con cantidade 0
   * cálculo correcto do valor total do stock

4. Engade tamén probas de valores límite utilizando:

   * `stock = 0`
   * `stock = Integer.MAX_VALUE`

5. Entrega:

- Captura da execución das probas en **maven** en /docs.
- Captura do informe de jacoco cunha cobertura do 100% /docs.
- Explicación do feito no explicacion.md en /docs.