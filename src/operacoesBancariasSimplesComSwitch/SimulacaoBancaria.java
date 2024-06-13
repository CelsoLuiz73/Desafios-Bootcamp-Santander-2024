package operacoesBancariasSimplesComSwitch;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha a opção desejada:");
            System.out.println("Digite: 1 - Depositar");
            System.out.println("Digite: 2 - Sacar");
            System.out.println("Digite: 3 - Consultar Saldo");
            System.out.println("Digite: 4 - Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorSerDepositado = scanner.nextDouble();
                    double saldoAtualizado = saldo + valorSerDepositado;
                    saldo = saldoAtualizado;
                    System.out.println("Saldo Atual = " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSerSacado = scanner.nextDouble();
                    if (valorSerSacado <= saldo) {
                        double valorSacado = saldo - valorSerSacado;
                        saldoAtualizado = valorSacado;
                        saldo = saldoAtualizado;
                        System.out.println("Saldo atual = " + saldo);
                    } else {
                        System.out.println("Saldo Insuficiente!");
                    }
                    break;
                case 3:
                    double saldoAtual = saldo;
                    System.out.println("Saldo atual = " + saldoAtual);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente Novamente.");
            }
        }
        scanner.close();
    }
}