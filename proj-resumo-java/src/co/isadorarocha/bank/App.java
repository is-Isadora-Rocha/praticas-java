package co.isadorarocha.bank;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Bank!");

        // criar uma conta (agencia, conta, nome)
        //  limitar o nome = 12 caracteres
        Account account = new Account("0001", "1234", "Seu Madruga");

        boolean succeed = account.withDraw(200.0);
        if (!succeed){
            System.out.println("Você não tem saldo suficiente para pagar o aluguel!");
        }

        //depositar
        account.deposit(100);
        account.deposit(50);
        account.deposit(100);

       if (!account.withDraw(200)){
           System.out.println("Você não tem saldo suficiente para pagar o aluguel!");
       }
        account.withDraw(200);
        if (!account.withDraw(200)){
            System.out.println("Você não tem saldo suficiente para pagar o aluguel!");
        }

        // informar ao usuário as operações (saque, deposito)
        System.out.println(account);
    }
}