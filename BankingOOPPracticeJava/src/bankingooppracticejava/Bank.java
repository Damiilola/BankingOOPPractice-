/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingooppracticejava;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author damilola.adenuga
 */
public class Bank {
    // holds the account details of customers
    public ArrayList <BankAccount> collectionOfBankAccounts;
    public BankNameModelObject bankNameObject;
    public BankingSystems.BankName bankName;
    

    

    public Bank(ArrayList<BankAccount> accounts, BankingSystems.BankName bankName) {
      
        this.bankNameObject = BankingSystems.getBankNameObjectFromEnum(bankName);
        
    }

    public Bank(BankingSystems.BankName bankName) {
        this.bankNameObject = BankingSystems.getBankNameObjectFromEnum(bankName);
        this.bankName = bankName;
        this.collectionOfBankAccounts = new ArrayList <BankAccount> ();
    }
  
    
   public void printBankNames(){
       System.out.println(this.bankNameObject);
   }
   
   public void printShortFormOfBankNames() {
       System.out.println(this.bankNameObject.getShorthandName());
   }

    public BankNameModelObject getBankNameObject() {
        return bankNameObject;
    }
    
    public int generateRandomAccountNumber(int accountNumber) {
       Random random = new Random();
       int randomAcctNo = random.nextInt(accountNumber);     
       Integer.toString(randomAcctNo);
       return randomAcctNo;
    }
     
    
    public int getRandomlyGeneratedBankAccountNumber() {
        return this.generateRandomAccountNumber(1000000);
    }


    public BankAccount createBankAccount() {
        
        System.out.println("\n\nWelcome to " +this.getBankNameObject().getShorthandName());       
        System.out.println("---------------------------\n");
        System.out.println("To create an account, follow the instructions below  \n");
        
        
        
        System.out.print("Enter a name: ");
        
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();
        //generate an acct no
        int accountNumber = this.getRandomlyGeneratedBankAccountNumber();
        
        //create a bank acct object 
        BankAccount currentBankAccount = new BankAccount(this.bankNameObject, accountNumber, customerName);
        //add the account details into a bank acct arraylist  
        collectionOfBankAccounts.add(currentBankAccount);
        
        
        return currentBankAccount;

    }
    
    
 
    public void transferMoneyMenuOption() {
        
            System.out.print("\nFollow the instructions below to transfer money\n");
            System.out.println("--------------------------------\n");
        
            //get your acct no and the acct number of the recipient
            //find and get acct nos from arraylist of bankaccounts
            System.out.print("Enter your account number:  "); 
            Scanner scanner = new Scanner(System.in);
            int userAccountNumber = scanner.nextInt();
            
            this.getBankAccountsCount();
            System.out.print("Enter recipient account number:  "); //find the acct no and print out the name attached to the acct no
            int recipientAccountNumber = scanner.nextInt();
            
            //enter the amount of money to be sent
            System.out.print("Enter an amount to send:  ");
            int amountToTransfer = scanner.nextInt();
            
           
        
            //subtract the amount from your account and add to the recipient's acct at the same time
//            if (collectionOfBankAccounts.contains(userAccountNumber) && collectionOfBankAccounts.contains(recipientAccountNumber)){
//               System.out.println("your acct is:  ");
//            }  
    }
    
// 
//    public void searchForAccountNumberInArrayList () {
//       
//        for (BankAccount accountNumber : collectionOfBankAccounts ) { //enhanced for loop
//            if(accountNumber.getAccountNumber() != null && collectionOfBankAccounts.contains(accountNumber) )
//        }
//    }
    public int getBankAccountsCount() {
        return collectionOfBankAccounts.size();
    }
}

