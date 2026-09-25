import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                ******************************
                Dados iniciais do cliente:
                
                Nome: Marcelo Prass Cambé
                Tipo conta: Corrente
                Saldo inicial: R$ 1000.00
                ******************************
                """);
        double saldo = 1000.00;
        Scanner leitura = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Operações
                    
                    1- Consultar saldo
                    2- Depositar saldo
                    3- Transferir saldo
                    4- Sair
                    
                    Digite a opção desejada:
                    """);
            int opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Saldo de: R$ " + saldo);
            }
            else if (opcao == 2 ) {
                System.out.println("Quanto quer depositar?(Com centavos):");
                double deposito = leitura.nextDouble();
                if (deposito <= 0){
                    System.out.println("Esse valor não é válido!");
                }
                else {
                    saldo += deposito;
                    System.out.println("Depósito feito com sucesso!");
                }
            }
            else if (opcao == 3) {
                System.out.println("Quanto você quer transferir?(Com centavos):");
                double transfere = leitura.nextDouble();
                if (transfere > saldo){
                    System.out.println("Você não tem saldo o suficiente para essa transferência!");
                }
                else if (transfere <= 0) {
                    System.out.println("Esse valor não é válido!");
                }
                else {
                    saldo -= transfere;
                    System.out.println("Transferência realizada com sucesso!");
                }
            }
            else if (opcao == 4) {
                break;
            }
            else if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
