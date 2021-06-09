package team.Nalruf;

import java.util.Random;

// Criação da classe Account
public class Account {
    private double balance;
    private final double[] valores = {10,20,50,100};

    // Um get para o saldo
    public double getBalance() {
        return this.balance;
    }

    // Construtor com saldo inicial
    public Account(double balance) {
        this.balance = balance;
    }

    // Metodo que verifica se tem saldo suficiente
    private boolean verify(double value){
        if(this.balance >= value){
            return true;
        }
        else {
            return false;
        }
    }

    // Criacao do metodo deposito
    public void deposit(){
        Random random = new Random();
        double valueOfDeposit = this.valores[random.nextInt(4)];
        this.balance += valueOfDeposit;
        System.out.println("Client: xxx depositou: "+valueOfDeposit);
        System.out.println("Conta: saldo atualizado de "+this.getBalance());
    }

    // Criacao do metodo para realizar retiradas
    public void withdraw() {
        Random random = new Random();
        double valueOfWithDraw = this.valores[random.nextInt(4)];
        if(verify(valueOfWithDraw)){
            this.balance -= valueOfWithDraw;
            System.out.println("Cliente: xxx retirou " +valueOfWithDraw);
            System.out.println("Conta: saldo atualizado de "+this.getBalance());
        }
        else {
            System.out.println("Voce nao pode retirar: saldo indisponivel para retirada");
        }

    }
}
