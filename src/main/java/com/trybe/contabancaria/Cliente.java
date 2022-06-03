package com.trybe.contabancaria;

// TODO: Auto-generated Javadoc
/**
 * Classe Cliente.
 **/

public class Cliente {

  /**
   * Atributos.
   **/
  private String nome;

  /** The cpf. */
  private String cpf;

  /**
   * Métodos.
   *
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * Sets the nome.
   *
   * @param nome the new nome
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Gets the cpf.
   *
   * @return the cpf
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * Sets the cpf.
   *
   * @param cpf the new cpf
   */
  public void setCpf(String cpf) {
    System.out.println(ValidaCpf.validarCpf(cpf));
    if (ValidaCpf.validarCpf(cpf)) {
      this.cpf = cpf;
    } else {
      this.cpf = null;
    }
  }

}
