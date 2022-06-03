package com.trybe.contabancaria;

// TODO: Auto-generated Javadoc
/**
 * Classe ContaBancaria.
 **/

public class ContaBancaria {

  /**
   * Atributos.
   **/

  private int saldo;

  /** The cliente. */
  private Cliente cliente;

  /**
   * Instantiates a new conta bancaria.
   */
  public ContaBancaria() {
    super();
    this.saldo = 0;
    this.cliente = new Cliente();
    // TODO Auto-generated constructor stub
  }

  /**
   * Métodos.
   *
   * @param string the new nome cliente
   */
  public void setNomeCliente(String string) {
    this.cliente.setNome(string);
  }

  /**
   * Gets the nome cliente.
   *
   * @return the nome cliente
   */
  public Object getNomeCliente() {
    return this.cliente.getNome();
  }

  /**
   * Sets the cpf cliente.
   *
   * @param cpf the new cpf cliente
   */
  public void setCpfCliente(String cpf) {
    this.cliente.setCpf(cpf);
  }

  /**
   * Gets the cpf cliente.
   *
   * @return the cpf cliente
   */
  public Object getCpfCliente() {
    return this.cliente.getCpf();
  }

  /**
   * Depositar.
   *
   * @param i the i
   * @return the integer
   */
  public Integer depositar(int i) {
    this.saldo += i;
    return this.saldo;
  }

  /**
   * Sacar.
   *
   * @param i the i
   * @return the integer
   */
  public Integer sacar(int i) {
    this.saldo -= i;
    return this.saldo;
  }

  /**
   * Ver saldo.
   *
   * @return the integer
   */
  public Integer verSaldo() {
    return this.saldo;
  }

}
