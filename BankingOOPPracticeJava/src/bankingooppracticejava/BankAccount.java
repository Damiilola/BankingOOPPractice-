/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingooppracticejava;
import java.util.Random;

/**
 *
 * @author damilola.adenuga
 */
public class BankAccount {
    
    private double accountBalance;
   
    private BankNameModelObject bankName;
    private int accountNumber;
    public String customerName;

    public BankAccount(BankNameModelObject bankName, int accountNumber, String customerName) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountBalance = BankUtility.getRandomlyGeneratedBankAccountBalance();
    }
 
     
    
    public void printAccountDetails (){
        
        System.out.println("\n\nBank Account Details");
        System.out.println("=================================");
        System.out.println("Account Name:  " + this.customerName);
        System.out.println("Bank Name:  " +this.bankName.getShorthandName());
        System.out.println("Bank Account Number:  " +this.accountNumber);
        System.out.println("Account Balance:  N" + BankUtility.formatCurrency(this.accountBalance));
    }
    
    public double getAcccountBalance() {
        return this.accountBalance;
    }
    
//    public int addToAccountBalance() {
//        return this.accountBalance +  
//    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }
}


    
  
   

