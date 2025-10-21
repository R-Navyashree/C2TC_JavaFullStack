package com.tns.interfaceex;

public class BankApplication {

    public static void main(String[] args) {
        Bank bank = new BankImpl();

        // Create an Account
        Account account = new Account(123456, "Navya", 15000, bank);

        account.deposit(2000);
        System.out.println(account);

        account.withdraw(1000);
        System.out.println(account);

        

        account.withdraw(140000); 
        account.deposit(30000);  
        
        account.showTransactionHistory();
        account.checkBalance(0);
        
    }
}