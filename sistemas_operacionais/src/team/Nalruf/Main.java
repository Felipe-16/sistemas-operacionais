package team.Nalruf;
import sun.misc.Signal;

public class Main {

    public static void main(String[] args) {

        // Criacao da conta client
        Account account = new Account(1000);
        Client client[] = {
                new Client("Felipe", account),
                new Client( "Filipe", account),
                new Client("Mat", account),
                new Client("Jun", account)};


        System.out.println("Conta criada com saldo inicial de: "+account.getBalance());

        account.deposit();

        account.withdraw();
    }
}
