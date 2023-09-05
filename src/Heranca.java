/*Entrada
O programa deve solicitar ao usuário as informações necessárias para abrir uma conta poupança. A entrada deve ser feita via console 
(linha de comando) e deve incluir o número da conta (um valor inteiro), o nome do titular (uma sequência de caracteres), 
o saldo inicial da conta (um valor decimal) e a taxa de juros da conta poupança (um valor decimal).

Saída
Após receber as informações da conta poupança, o programa deve criar um objeto do tipo "ContaPoupanca" e exibir na tela as informações 
dessa conta, incluindo o número da conta, o nome do titular, o saldo atual e a taxa de juros. A saída deve ser formatada de forma clara 
e legível para o usuário. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Heranca {
    public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    String titular = scanner.next();
    int numeroConta = scanner.nextInt();
    double saldo = scanner.nextDouble();
    double taxaJuros = scanner.nextDouble();

    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

    System.out.println("Conta Poupanca:");
    contaPoupanca.exibirInformacoes();
  }
}

class ContaBancaria {
  protected int numero;
  protected String titular;
  protected double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public void exibirInformacoes() {
    DecimalFormat decimalFormat = new DecimalFormat("#.0");
    System.out.println(titular);
    System.out.println(numero);
    System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
  }
}

class ContaPoupanca extends ContaBancaria {
  private double taxaJuros;

  public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
    super (numero, titular, saldo);
    this.taxaJuros = taxaJuros;
    //TODO: Implementar adequadamente esta sobrecarga de construtores.
  }

  public void exibirInformacoes() {
    super.exibirInformacoes();
    //TODO: Complementar as informações com a taxa de juros.
    System.out.println("Taxa de juros: " + this.taxaJuros + "%");
  }
}
    

