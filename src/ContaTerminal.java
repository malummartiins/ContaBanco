import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner (System.in);

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o número: ");
        int num = scan.nextInt();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scan1.nextLine();

        System.out.println("Informe o saldo:");
        float saldo = scan.nextFloat();

        System.out.println("Olá, " + nomeCliente +  " obrigado por criar uma conta em nosso banco, sua agência é, " + agencia +  " conta " + num + "e seu saldo "+ saldo + " já está disponível para saque"); 

    }
}
