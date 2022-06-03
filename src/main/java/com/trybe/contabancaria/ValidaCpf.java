package com.trybe.contabancaria;

/**
 * Classe ValidaCpf.
 **/

public class ValidaCpf {

  /**
   * Atributos.
   **/
  private static int soma;
  private static int primeiroDV;
  private static int segundoDV;
  private static short index;

  /**
   * Métodos.
   **/
  public static boolean validarCpf(String cpf) {
    String[] arrayCpf = cpf.split("");
    soma = 0;
    index = 0;

    for (int i = 10; index < 9; i--) {
      soma += Integer.parseInt(arrayCpf[index]) * i;
      index++;
    }
    primeiroDV = 11 - (soma % 11);

    soma = 0;
    index = 0;

    for (int i = 11; index < 9; i++) {
      soma += Integer.parseInt(arrayCpf[index]) * i;
      index++;
    }
    segundoDV = 11 - (soma % 11);

    if (primeiroDV == 10 || primeiroDV == 11) {
      primeiroDV = 0;
    }
    if (segundoDV == 10 || segundoDV == 11) {
      segundoDV = 0;
    }

    if (primeiroDV != Integer.parseInt(arrayCpf[9])
        || segundoDV != Integer.parseInt(arrayCpf[10])) {
      return false;
    }
    return true;
  }
}
