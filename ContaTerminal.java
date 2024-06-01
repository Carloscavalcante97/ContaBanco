public class ContaTerminal {
    final String NUMERO = "1021", AGENCIA = "067-8", SENHA = "51030210",NOME ="MARIO ANDRADE";
    float Saldo = 15375.00F;
    public void Saque(float valorSacado){
        if(this.Saldo >= valorSacado){
            this.Saldo -= valorSacado;
        }else{
            System.out.println("Saldo insuficiente"+this.Saldo);
        }


    }
    public void Deposito(float valorDepositado){
            this.Saldo += valorDepositado;
}
}
