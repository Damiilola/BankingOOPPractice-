/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingooppracticejava;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author damilola.adenuga
 */
public class BankUtility {
    
    public static int generateRandomNumber (int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min; 
    }
    
    
    public static double getRandomlyGeneratedBankAccountBalance() {
        return (double)generateRandomNumber(100, 1000000);
    }
    
    public static String formatCurrency(double amount) {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return formatter.format(amount);
    }
}
