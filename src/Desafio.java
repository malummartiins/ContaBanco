/*Entrada
A entrada será a representação de um registro (string) no formato e sequencia: "data,hora,descricao,valor".

Saída
A saída deve ser o valor do registro (string) recebido na entrada informando a transação efetuada, 
contendo, descrição, data, hora e valor da transação, como no exemplo da tabela a baixo. */

import java.util.Scanner;

public class Desafio {
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String entrada = scanner.nextLine();
    String[] partes = entrada.split(",");

    // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.
    double d = Double.valueOf(partes[3]).doubleValue();
    Transacao transacao = new Transacao(partes[0], partes[1], partes[2], d);
    transacao.imprimir();
  }
}

class Transacao {
  private String data;
  private String hora;
  private String descricao;
  private double valor;

  public Transacao(String data, String hora, String descricao, double valor) {
    this.data = data;
    this.hora = hora;
    this.descricao = descricao;
    this.valor = valor;
  }
  
  public void imprimir() {
    System.out.println(this.descricao);
    System.out.println(this.data);
    System.out.println(this.hora);
    System.out.printf("%.2f", this.valor);
  }
}
