import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        String nome = "Everton Lima Gomes";
        String tipoDeConta = "Corrente";
        double saldo = 2500;

        System.out.println("**********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Saldo atual " + saldo);
        System.out.println("\n**********************");

        int opcao = 0;

        String menu = """
                ** Escolha uma das opções para prosseguir **
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){

                System.out.println("O saldo atualizado é " + saldo);

            }
            else if (opcao == 2) {
                System.out.println("Digite o valor você deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferencia");
                } else {
                    saldo -= valor;
                    System.out.println("saldo atual: " + saldo);
                }
            } else if (opcao ==3) {
                    System.out.println("Valor recebido:");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Novo saldo " + saldo);

                } else if (opcao != 4) {
                    System.out.println("Opção invalida!");
                }


            }


        }
    }












