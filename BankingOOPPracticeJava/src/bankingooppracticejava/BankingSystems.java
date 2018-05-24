/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingooppracticejava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author damilola.adenuga
 */
public class BankingSystems {

    private ArrayList<Bank> collectionOfBanks;
    private static BankingSystems myBankingSystems;
   
   
    
    private BankingSystems() {
        
      Bank fbnBank = new Bank(BankName.FBN);
      Bank gtbBank = new Bank(BankName.GTB);
      Bank ubaBank = new Bank(BankName.UBA);
      
      this.collectionOfBanks = new ArrayList <Bank> ();
      this.collectionOfBanks.add(ubaBank);
      this.collectionOfBanks.add(gtbBank);
      this.collectionOfBanks.add(fbnBank);
       
      
    } 
   
    
    public static enum BankName {
        GTB,
        FBN,
        UBA,
    }
    
    
    public static BankingSystems getInstance () {
        if (myBankingSystems == null) {
            myBankingSystems = new BankingSystems();
       }
        
       return myBankingSystems;
    }
    
    
    
    //purpose of this is to return a string representation of the bankName BASED ON THE PASSED ENUM
    public static BankNameModelObject getBankNameObjectFromEnum(BankName bankName){
        
        BankNameModelObject bankNameToReturn;
        
        switch(bankName){
            case GTB: bankNameToReturn = new BankNameModelObject("Guaranty Trust Bank", "GTB", bankName);
                break;
            case FBN: bankNameToReturn = new BankNameModelObject("First Bank Nigeria", "FBN", bankName);
                break;
            default: bankNameToReturn = new BankNameModelObject("United Bank Africa", "UBA", bankName);
        }
        
        return bankNameToReturn;
    }
     
//    public void printBanksArrayList () {
//        System.out.println(this.banks);
//    }
    
    public void selectionMenu(){
        boolean shouldQuit = false;
        Scanner input = new Scanner(System.in);
        int userChoice;

        
        
        System.out.println("1. Create account?");
        System.out.println("2. Transfer money?");
        System.out.println("3. Invest?");
        System.out.println("4. quit  \n");
        
        System.out.println("Enter a choice:  ");
        
        
        userChoice = input.nextInt();
        
        switch (userChoice){
            default: this.createAccount();
                 break;     
                      
        }
        
    }    
      
    public void printListOfBanks () {
        
        for(int i = 0; i < this.collectionOfBanks.size(); i++){
                
            Bank currentBank = this.collectionOfBanks.get(i);
            System.out.println((i+1) + ". " + currentBank.getBankNameObject().getShorthandName());
                
        }
    }
         
    public void createAccount(){
            //for case 1 the create account case
           
            Scanner name = new Scanner(System.in);
           
            System.out.println("\nSelect a bank:  ");
            this.printListOfBanks();
            int bankChoice = name.nextInt();          
            Bank chosenBank = this.getBankFromUserInput(bankChoice);
            BankAccount createdBankAccount = chosenBank.createBankAccount();
            createdBankAccount.printAccountDetails();
                 
    }               
                      
    public Bank getBankFromUserInput(int bankChoice) {
        //the user is going to enter a number for the choice of bank
        //that choice will be used to retrieve the corresponding and correct bank OBJECT
        return collectionOfBanks.get(bankChoice - 1);
    }                
                         
                          
                       
    
    //using a method to populate an arrayList
//    private void addNewBankAccountToBank(BankName bankName){
//        
//  
//        
//    }
}


