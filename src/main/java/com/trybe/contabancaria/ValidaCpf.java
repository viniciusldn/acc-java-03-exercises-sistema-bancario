package com.trybe.contabancaria;

/**
 * Classe ValidaCpf.
 **/

public class ValidaCpf {

  /**
   * Atributos.
   **/
  private static int soma = 0;
  private static int primeiroDV;
  private static int segundoDV;

  /**
   * Métodos.
   **/
  public static boolean validarCPF(String CPF) {
    char[] cpf = CPF.toCharArray();
    for (int i = 2; i < 11; i++) {
      soma += cpf[-i + 1] * i;
    }
    if (11 - (soma % 11) < 10) {
      primeiroDV = 0;
    } else {
      primeiroDV = 11 - (soma % 11);
    }
    soma = 0;
    for (int i = 2; i <= 11; i++) {
      soma += cpf[-i] * i;
    }
    if (11 - (soma % 11) < 10) {
      segundoDV = 0;
    } else {
      segundoDV = 11 - (soma % 11);
    }

    if (primeiroDV == cpf[-2] && segundoDV == cpf[-1]) {
      return true;
    } else {
      return false;
    }
  }
}
