# Exercicio: Probas unitarias dun método

O proxecto ten unha clase cun método que permite comprobar se un número é primo.

## Tarefas

1. Crea unha clase de probas chamada `NumeroPrimoTest`.

2. Implementa probas unitarias con JUnit 5 para comprobar o correcto funcionamento do método `esPrimo`.

3. As probas deben cubrir:

   * números negativos
   * o valor 0
   * o valor 1
   * o valor 2
   * un número primo maior que 2
   * un número non primo maior que 2

4. Engade tamén probas de valores límite utilizando:

   * `Integer.MIN_VALUE`
   * `Integer.MAX_VALUE`

5. Entrega:

- Captura da execución das probas en **maven** en /docs.
- Captura do informe de jacoco cunha cobertura do 100% /docs.
- Explicación do feito no explicacion.md en /docs.