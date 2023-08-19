import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scan.next();

        System.out.println("Por favor, digite o seu Nome:");
        String nome = scan.next();

        System.out.println("Por favor, digite o seu saldo inicial:");
        double saldo = scan.nextDouble();

        int numero = 0;
        numero++;


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");




    }


}
