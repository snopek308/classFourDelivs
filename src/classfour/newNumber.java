/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classfour;

import java.util.Scanner;

/**
 *
 * @author asnopek
 */
public class newNumber {
    public static void main(String[] args) {
    
    double newNum;    
        
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Type in a number: ");
    newNum = keyboard.nextDouble();
    
    if ((newNum <= Byte.MAX_VALUE) && (newNum >= Byte.MIN_VALUE))
    {
        System.out.println("This is a Byte");
    }
    else if ((newNum <= Short.MAX_VALUE) && (newNum >= Short.MIN_VALUE))
    {
        System.out.println("This is a Short");
    }
    else if ((newNum <= Integer.MAX_VALUE) && (newNum >= Integer.MIN_VALUE))
    {
        System.out.println("This is an Integer");
    }
    else if ((newNum <= Long.MAX_VALUE) && (newNum >= Long.MIN_VALUE))
    {
        System.out.println("This is a Long");
    }
    else if ((newNum <= Float.MAX_VALUE) && (newNum >= Float.MIN_VALUE))
    {
        System.out.println("This is a Float");
    }
    else if((newNum <= Double.MAX_VALUE) && newNum >= Double.MIN_VALUE)
    {
        System.out.println("This is a Double"); 
    }
    }
    
    
}
