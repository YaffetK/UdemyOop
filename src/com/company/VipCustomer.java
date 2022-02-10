package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default Person", 100000.0,"Person@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
       this(name,creditLimit,"Default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
