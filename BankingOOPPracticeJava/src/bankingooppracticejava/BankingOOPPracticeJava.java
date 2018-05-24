/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingooppracticejava;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author damilola.adenuga
 */
public class BankingOOPPracticeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
//       
//        BankingSystems myBankingSystems = BankingSystems.getInstance();
//        
//        myBankingSystems.selectionMenu();    
//        
        Bank myBank = new Bank(BankingSystems.BankName.FBN);
        
        myBank.getBankAccountsCount();
    }
    
}