package com.company;

public class CurrentAccount {

    String holder_name;
    int AccountNumber;
    int balance;

    public CurrentAccount() {
        this.holder_name = "No holder name";
        AccountNumber = 0;
        this.balance = 0;
    }

    public CurrentAccount(String holder_name, int accountNumber, int balance) {
        this.holder_name = holder_name;
        AccountNumber = accountNumber;
        this.balance = balance;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "CurrentAccount" + "\n" +
                "holder_name='" + holder_name + "\n" +
                "AccountNumber = " + AccountNumber + "\n" +
                "Balance = " + balance +"\n";
    }

    /**
     * check balance
     * */
    public String checkBalance(){
        return "Balance : " + balance;
    }

    /**
     * Deposit amount
     * */
    public void deposit_amount(int amount){
        balance = balance + amount;
        System.out.println("Current Balance " + balance);
        System.out.println("Amount Deposited " + amount);
    }

    /**
     * Withdraw amount for current account
     * */
    public void withdraw(int withdraw_amount, int overdraft){
        int all_money_withdrawn = withdraw_amount + overdraft;
        if(balance > withdraw_amount + overdraft){
            System.out.println("Withdrawing your cash");
            balance = balance - withdraw_amount - overdraft;
            System.out.println("Amount withdrawn : " + all_money_withdrawn);
            System.out.println("Current Account Balance after withdrawal : " + balance );
        }
        else {
            System.out.println("You can not withdraw amount greater than your balance and your overdraft limit ");
            System.out.println("Overdraft amount : " + overdraft);
            System.out.println("Total possible withdrawal amount : " + all_money_withdrawn);
        }
    }
}
