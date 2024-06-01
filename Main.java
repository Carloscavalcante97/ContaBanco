import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userConta = "";
        boolean menu = false;
        int menuSaque = 0;
        ContaTerminal userData = new ContaTerminal();

        Scanner read = new Scanner(System.in);
        System.out.print("Insira sua conta: ");
        userConta = read.next();
        System.out.println("Insira sua agência: ");
        String userAgencia = read.next();
        System.out.println("Insira sua Senha: ");
        String userSenha = read.next();
        while (!userConta.equals(userData.NUMERO) && !userAgencia.equals(userData.AGENCIA) && !userSenha.equals(userData.SENHA)) {
            System.out.print("Insira sua conta Novamente: \n");
            userConta = read.next();
            System.out.print("Insira sua agência Novamente: \n");
            userAgencia = read.next();
            System.out.print("Insira sua Senha Novamente: \n");
            userSenha = read.next();
        }
        if (userConta.equals(userData.NUMERO) && userAgencia.equals(userData.AGENCIA) && userSenha.equals(userData.SENHA)) {
            System.out.print("Olá " + userData.NOME + ", obrigado por criar uma conta em nosso banco,\n" +
                    " sua agência é " + userData.AGENCIA + " , conta " + userData.NUMERO + "\n" +
                    "  seu saldo R$" + userData.Saldo + " já está disponível para saque ");
            ;
            System.out.print("\n1- Para realizar um depositar digite 1  \n");
            System.out.print("\n2- Para realizar um saque digite 2 \n");
            System.out.print("\n3- Para realizar um sair digite 0 \n");
            menuSaque = read.nextInt();
            while (menuSaque != 0 && menuSaque != 1 && menuSaque != 2) {
                System.out.print("Opção inválida digite novamente: ");
                menuSaque = read.nextInt();
            }
            if (menuSaque == 2) {
                System.out.print("Insira o valor do saque: \n");
                float valorSacado = read.nextFloat();
                userData.Saque(valorSacado);
                System.out.print("Valor sacado com sucesso, Saldo atualizado: R$" + userData.Saldo + "\nObrigado por usar nosso sistema!");

            } else if (menuSaque == 1) {
                System.out.print("Qual valor deseja Depositar: ");
                float valorDeposito = read.nextFloat();
                userData.Deposito(valorDeposito);
                System.out.print("Saldo atualizado: " + userData.Saldo);
            } else if (menuSaque == 0) {
                System.out.print("Deslogado com sucesso.");
            }
        }
    }
}


