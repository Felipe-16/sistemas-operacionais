package team.Nalruf;
import java.util.Random;

// Criacao da conta Client
public class Client implements Runnable{
    private String client;
    Account account;

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
                account.deposit();
                break;

            case 1:
                account.withdraw();
                break;

            default:
                System.out.println("error");
                break;
        }
    }

    @Override
    public void run() {

    }






}
