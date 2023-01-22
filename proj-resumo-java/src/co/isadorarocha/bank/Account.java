package co.isadorarocha.bank;

public class Account {
    private static final int MAX_LENGTH = 12;
    /**
     * static = objeto pertencente a CLASSE.
     * final = define que a propriedade é constante, ou seja, não pode ser alterada nem dentro da classe.
     **/
    private String ag;
    private String cc;
    private String name;
    private double balance;
    private Log logger;
    public Account(String ag, String cc, String name){ //construtor - inicializador
        this.ag = ag;
        this.cc = cc;
        this.name = name;
        setName(name);
        logger = new Log();
    }
    public void setName(String nome){
        if (name.length() > MAX_LENGTH){
            this.name = name.substring(0, MAX_LENGTH);
        } else {
            this.name = name;
        }
        System.out.println(this.name);
    }
    public void deposit(double value){
        balance += value;
        logger.out("DEPOSITO - R$ " + value + " Sua conta atual é R$: "+ balance);
    }
    public boolean withDraw(double value){
        if (balance < value){
            logger.out("SAQUE - R$ " + value + " Seu saldo atual é de R$ " + balance);
            return false;
        }
        balance -= value;
        logger.out("SAQUE - R$ " + value + " Sua conta atual é R$: "+ balance);
        return true;
    }

    @Override
    public String toString() {
//        String result = "A conta " +this.name + " Agência " + this.ag + " / " +this.cc + " possui R$: " +balance;
//        return result;
        return "A conta " +this.name + " " + this.ag + " / " +this.cc + " possui R$: " +balance;
    }
}