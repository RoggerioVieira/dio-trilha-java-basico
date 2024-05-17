import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Definir o locale para garantir que o ponto seja usado como separador decimal
        Locale.setDefault(Locale.US);

        // Criação do objeto Scanner para leitura dos dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis 
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação e leitura dos dados via terminal
        System.out.println (" Por favor, digite o número da Conta!");
        numeroConta = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do scanner

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo!");
        if (scanner.hasNextDouble()) {
            saldo = scanner.nextDouble();
        } else {
            System.out.println("Entrada de saldo inválida. Por favor, insira um número decimal.");
            scanner.close();
            return;
        }

        // Exibição da mensagem final com os dados da conta
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
