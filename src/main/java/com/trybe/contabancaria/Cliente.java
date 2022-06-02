package com.trybe.contabancaria;

/**
 * Classe Cliente.
 **/

public class Cliente {

  /**
   * Atributos.
   **/
  String nome;
  String cpf;

  /**
   * Métodos.
   **/
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    if (ValidaCpf.validarCPF(cpf)) {
      this.cpf = cpf;
    }
  }

}
