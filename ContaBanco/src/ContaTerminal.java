import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.print("Por favor, insira seu numero de conta: ");
        numero = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Por favor, insira seu numero de agencia: ");
        agencia = scanner.nextLine(); 

        System.out.print("Por favor, insira seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Por favor, insira seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " está disponível para saque. ");

        scanner.close();
    }
}
