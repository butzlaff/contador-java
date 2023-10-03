package personal.projeto.contador;

import java.util.Scanner;

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
    for (int i = 0; i <= cont; i++) {
      System.out.println(i);
    }
  }
}
