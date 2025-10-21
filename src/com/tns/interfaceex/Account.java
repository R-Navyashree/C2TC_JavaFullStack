package com.tns.interfaceex;

import java.util.ArrayList;

public class Account {
    private int accNo;
    private String name;
    private double balance;
    private Bank bank;
    private ArrayList<String> transactionHistory = new ArrayList<>();

    public Account(int accNo, String name, double balance, Bank bank) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.bank = bank;
    }

    public void deposit(double amount) {
        bank.deposit(this, amount);
    }

    public void withdraw(double amount) {
        bank.withdraw(this, amount);
    }

    public void checkBalance(double amount) {
        bank.checkBalance(this, amount);
    }

    public void showTransactionHistory() {
        bank.showtransactionHistory(this);
    }

    public void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }

    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(ArrayList<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "--Account [accNo=" + accNo + ", name=" + name + ", balance=₹" + balance + "]";
    }
}