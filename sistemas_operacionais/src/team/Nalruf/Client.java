package team.Nalruf;
import java.util.Random;

// Criacao da conta Client
public class Client extends Thread {
    private String client;
    private final Account account;

    public String getClient() {
        return client;
    }

    // Criando o construtor com client e account
    public Client(String client, Account account) {
        this.client = client;
        this.account = account;
    }

    // Metodo sortear deposit ou withdraw
    public void execute(){
        Random random = new Random();
        int coin = random.nextInt(2);
        switch (coin) {
            case 0:
                // Deposit
                account.deposit(getClient());
                break;

            case 1:
                // Withdraw
                account.withdraw(getClient());
                break;

            default:
                System.out.println("error");
                break;
        }
    }

    @Override
    public void start() {
        
        //Substituir por um loop infinito se o CTRL + C der certo
        for (int i = 0; i < 10; i++)
        {
            execute();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
