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
public class InvestmentManager {
    
    public static double getRandomAmountOfMoney() {
        Random random = new Random();
        int randomAmount = random.nextInt(20);
        return randomAmount;
    }
    
   
    
    
    //while customer invests add random amount to their account
    //increment customer account with random amount of money
    
    public double setInvestmentPercentage () {
        return getRandomAmountOfMoney() / 100;
    }
    

    
   
}
