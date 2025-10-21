package com.tns.interfaceex;

public class BankImpl implements Bank {

    @Override
    public void deposit(Account account, double amount) {
        if (amount > DEPOSIT_LIMIT) {
            System.err.println("Deposit not possible.. exceeds Deposit Limit");
            account.addTransaction("Failed deposit of ₹" + amount + " (exceeds limit)");
        } else {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Deposited ₹" + amount + " into account: " + account.getAccNo());
            account.addTransaction("Deposited ₹" + amount);
        }
    }

    @Override
    public void withdraw(Account account, double amount) {
        if (account.getBalance() - amount >= MIN_BALANCE) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawn ₹" + amount + " from account: " + account.getAccNo());
            account.addTransaction("Withdrawn ₹" + amount);
        } else {
            System.err.println("Insufficient balance in account: " + account.getAccNo());
            account.addTransaction("Failed withdrawal of ₹" + amount + " (insufficient balance)");
        }
    }

    @Override
    public void checkBalance(Account account, double amount) {
        System.out.println("Balance in account Number " + account.getAccNo() + ": ₹" + account.getBalance());
    }

    @Override
    public void showtransactionHistory(Account account) {
        System.out.println("Transaction History for " + account.getName() +account.getAccNo()+ ":");
        if (account.getTransactionHistory().isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : account.getTransactionHistory()) {
                System.out.println("- " + transaction);
            }
        }
    }
}