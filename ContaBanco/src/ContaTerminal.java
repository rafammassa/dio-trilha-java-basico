import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int conta;
        String agencia;
        String nome;
        float saldo;

        System.out.println("Por favor, digite o número da conta:");
        conta = scan.nextInt();

        System.out.println("Agora, digite sua agência:");
        agencia = scan.next();

        System.out.println("Qual é o seu nome?");
        nome = scan.next();

        System.out.println("Por fim, digite seu saldo:");
        saldo = scan.nextFloat();

    }
}
