/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classfour;

import java.math.BigDecimal;

/**
 *
 * @author asnopek
 */
public class wiLetters {
    public static void main(String[] args) {
        
        BigDecimal wiLetters = new BigDecimal("57266398");
        BigDecimal calLetters = new BigDecimal ("38041430");
        BigDecimal texLetters = new BigDecimal ("26059203");
        BigDecimal copyCost = new BigDecimal ("3.23");
        
        BigDecimal multCW = calLetters.multiply(wiLetters);
        System.out.println("Numbers of letters written by Wisconsinites: " + multCW);
        
        BigDecimal multCWT = multCW.multiply(texLetters);
        System.out.println("Number of copies for Texas: " + multCWT);
        
        BigDecimal totalCost = multCWT.multiply(copyCost);
        System.out.println("Total cost of the copies for the Texas prints: $" + totalCost);
    }
    
}
