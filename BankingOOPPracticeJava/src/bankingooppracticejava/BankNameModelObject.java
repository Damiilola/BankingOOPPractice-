package bankingooppracticejava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damilola.adenuga
 */
public class BankNameModelObject {
    
    private String fullName;
    private String shorthandName;
    private BankingSystems.BankName bankEnumName;

    public BankNameModelObject(String fullName, String shorthandName) {
        this.fullName = fullName;
        this.shorthandName = shorthandName;
    }

    public BankNameModelObject(String fullName, String shorthandName, BankingSystems.BankName bankEnumName) {
        this.fullName = fullName;
        this.shorthandName = shorthandName;
        this.bankEnumName = bankEnumName;
    }
    
    public String getFullName() {
        return fullName;
    }

    public String getShorthandName() {
        return shorthandName;
    }

    @Override
    public String toString() {
        return ("Full Name: " + this.fullName + "\nShortHand Name: " + this.shorthandName); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
