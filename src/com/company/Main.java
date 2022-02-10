package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account=new BankAccount();

        account.setBalance(1000);
        account.deposit(2000);
        account.deposit(5000);

        System.out.println(account.getBalance());

    }
}
