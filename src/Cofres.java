/*Entrada
O programa irá solicitar ao usuário que digite o tipo de cofre a ser criado: "digital" ou "físico". 
Se for escolhido o tipo "digital", o programa irá solicitar a senha e a confirmação de senha do cofre digital 
(ambas com apenas números). Caso seja escolhido o tipo "físico", não é necessário nenhuma outra entrada.

Saída
O programa irá exibir as informações do cofre criado. Para o Cofre Digital, será exibido o tipo e o método de 
abertura (senha). Para o Cofre Físico, será exibido apenas o tipo e o método de abertura (chave). */

import java.util.Scanner;

abstract class Cofres {
  protected String tipo;
  protected String metodoAbertura;

  public Cofres(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofres {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofres {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();


        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = scanner.nextInt();
            CofreDigital cofre = new CofreDigital(senha);
            cofre.imprimirInformacoes();
            int confirmaSenha = scanner.nextInt();
            if (!cofre.validarSenha(confirmaSenha)) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Cofre aberto!");
            }
        } else {
            CofreFisico cofre = new CofreFisico();
            cofre.imprimirInformacoes();
        }
        
        scanner.close(); 
    }
}
