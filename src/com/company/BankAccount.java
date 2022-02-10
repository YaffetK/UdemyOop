package com.company;

public class BankAccount {
        private int accountNumber;
        private int balance;
        private String name;
        private String email;
        private int phoneNumber;

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public int getAccountNumber(){
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber){
            this.accountNumber= accountNumber;
        }

        public void deposit(int money){
            this.balance+=money;
            System.out.println("Your new balance is " + balance + "kr");
        }
        public void withdraw(int money){
            if (this.balance<money){
                System.out.println("You don´t have enough funds to make your withdrawal");
            }
            else {
                this.balance-=money;
                System.out.println("Your new balance is " +balance + "kr");
            }
        }

    }

