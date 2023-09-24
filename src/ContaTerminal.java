import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int numeroAgencia = sc.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = sc.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Digite seu saldo: ");
        Double saldoAtual = sc.nextDouble();

        System.out.println("Olá " 
                         + nomeCliente 
                         + ", obrigado por criar uma conta em nosso banco, sua agência é: " 
                         + agencia 
                         + ", " 
                         + numeroAgencia 
                         + " e seu saldo: " 
                         + saldoAtual 
                         + " já está disponível para saque.");


    }
}
