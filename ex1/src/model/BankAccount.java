package model;

public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, int accountNumber, double balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean checkBalance(double amount){
        return balance >= amount;
    }

    public void deposit(double amount) {
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Nạp thành công: " + amount);
        } else {
            System.out.println("Số tiền không hợp lệ");
        }
    }

    public void withdraw(double amount) {
        if (checkBalance(amount)) {
            balance = balance - amount;
            System.out.println("Rút thành công: " + amount);
        } else {
            System.out.println("Số dư không đủ");
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
