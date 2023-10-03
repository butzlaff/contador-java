package personal.projeto.contador;

import java.util.Scanner;

/**
 * Este programa recebe dois números inteiros a diferença do segundo paramêtro pelo primeiro.
 * Caso o segundo paramêtro seja menor que o primeiro, o programa lança uma exceção.
 * Caso seja digitado valores que não sejam inteiros, o programa lança uma exceção.
 * 
 * @author Emilio Butzlaff
 * @version 1.0
 */

public class Contador {
  public static void main(String[] args) {
    try {
    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o inicio da contagem: ");
    int inicio = terminal.nextInt();

    System.out.println("Digite o fim da contagem: ");
    int fim = terminal.nextInt();

    contar(inicio, fim);

    terminal.close();
    } catch (ParametrosInvalidosException e) {
      System.out.println("Erro: O segundo paramêtro deve ser maior que o primeiro");
    } catch (Exception e) {
      System.out.println("Erro: só aceita números positivos");
    }
  }

  static void contar(int inicio, int fim) throws ParametrosInvalidosException {
    if (inicio > fim) {
      throw new ParametrosInvalidosException();
    }
    int cont = fim - inicio;
    for (int i = 1; i <= cont; i++) {
      System.out.println(i);
    }
  }
}
