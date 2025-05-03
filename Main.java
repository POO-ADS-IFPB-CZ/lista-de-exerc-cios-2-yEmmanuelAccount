

// importando dependências
import java.util.Scanner;
import model.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);

        // declarando variáveis
        int numero, opcaoEscolhida;
        String titular;
        float valorSaque, valorDeposito, saldoAtual;

        // pedindo dados ao usuário
        System.out.print("Informe o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe o nome do titular: ");
        titular = scanner.nextLine();

        // criando conta
        ContaCorrente conta = new ContaCorrente(numero, titular);

        // menu de interação
        do {
           // opções 
            System.out.print("\n");
            System.out.println("----- MENU de Interação -----");
            System.out.println("Escolha entre as opções a seguir:");
            System.out.println("(1) Sacar.");
            System.out.println("(2) Depositar.");
            System.out.println("(3) Consultar Saldo.");
            System.out.println("(4) Sair do MENU.");

            opcaoEscolhida = scanner.nextInt();
            System.out.println("");

            // direcionando usuário de acordo com sua escolha
            switch (opcaoEscolhida) {
                case 1:
                    System.out.print("Informe o valor para saque: ");
                    valorSaque = scanner.nextFloat();
                    conta.sacar(valorSaque);
                    break;
                
                case 2:
                    System.out.print("Informe o valor para depósito: ");
                    valorDeposito = scanner.nextFloat();
                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    saldoAtual = conta.consultarSaldo();
                    System.out.printf("O saldo atual da conta %d (%s) -> R$: %.2f \n", conta.getNumero(), conta.getTitular(), saldoAtual);
                    break;

                case 4:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.print("Escolha uma das opções válidas.");
            }

        } while (opcaoEscolhida != 4);

        // fechando scanner
        scanner.close();
    }
}
