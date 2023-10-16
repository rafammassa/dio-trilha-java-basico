import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int conta;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Por favor, digite o número da conta:");
        conta = scan.nextInt();

        System.out.println("Agora, digite sua agência:");
        agencia = scan.next();

        System.out.println("Qual é o seu nome?");
        nome = scan.next();

        System.out.println("Por fim, digite seu saldo:");
        saldo = scan.nextDouble();

        System.out.println("Olá" + nome + ", obrigado por criar uma conta em nossobanco, sua agência é " + agencia
                + ", conta" + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
