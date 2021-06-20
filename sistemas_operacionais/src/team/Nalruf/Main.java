// Felipe Ros Pegini R.A: 18.00232-3
// Matheus Sungho Ha 18.00525-0
// Guilherme Jun Ishikawa 18.00906-9
// Filipe dos Santos Pugliesi 18.02608-7

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


        System.out.println("Conta criada com saldo inicial de: " + account.getBalance());

        Signal.handle(new Signal("INT"), //CTRL + C
                (Signal signal) -> {
                    System.out.println("Terminando simulação...");
                    for (Client client : customers)
                    {
                        client.interrupt();
                    }
                });

        for (Client client : customers)
        {
           client.start();
        }
    }
}
