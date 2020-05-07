package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setHolder_name("Moses");
        savingAccount.setAccountNumber(123456);
        savingAccount.setBalance(0);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setHolder_name("Rachel");
        currentAccount.setAccountNumber(654321);
        currentAccount.setBalance(0);

        System.out.println(savingAccount.toString());
        System.out.println(currentAccount.toString());

        System.out.println("*********************************************************************************************");

        /**
         *Deposit amount saving account
         **/
        savingAccount.deposit_amount(200);

        /**
         * Check balance saving account
         * use either methods getBalance() or checkBalance()
         * */
        System.out.println(savingAccount.checkBalance());

        /**
         * will not allow withdrawal since withdrawal amount is greater than balance (saving account)
         * */
        savingAccount.withdraw(1000);
        System.out.println(savingAccount.checkBalance());

        System.out.println("**********************************************************************************************");
        /**
         *Deposit amount current account
         **/
        currentAccount.deposit_amount(500);

        /**
         * Check balance current account
         * use either methods getBalance() or checkBalance()
         * */
        System.out.println(currentAccount.checkBalance());

        /**
         * will not allow withdrawal since withdrawal amount is greater than balance + overdraft (current account)
         * */
        currentAccount.withdraw(1000, 300);
        System.out.println(currentAccount.checkBalance());

        System.out.println("**************************************************************************************************");
    }
}
