package team.Nalruf;
import sun.misc.Signal;

public class Main {

    public static void main(String[] args) {

        // Criacao da conta client
        Account account = new Account(1000.0);
        Client customers[] = {
                new Client("Augustus", account),
                new Client( "Lucius", account),
                new Client("Claudius", account),
                new Client("Tiberius", account)};


        System.out.println("Conta criada com saldo inicial de: "+account.getBalance());

        Signal.handle(new Signal("INT"), //CTRL + C
                (Signal signal) -> {
                    System.out.println("Terminando simulação...");
                    for (Client customer : customers)
                    {
                        customer.interrupt();
                    }
                });

        for (Client customer : customers)
        {
           customer.start();
        }
    }
}
