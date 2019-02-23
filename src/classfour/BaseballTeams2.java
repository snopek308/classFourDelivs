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
public class BaseballTeams2 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String bbTeam;
        System.out.println("What is your favorite Baseball Team?");
        bbTeam = keyboard.nextLine();

        String ball;
        
        ball = bbTeam.substring(0, 3);
        
        try
        {
            Teams mlb = Teams.valueOf(ball.toUpperCase());
            System.out.println(mlb.getAbv());
        }
        catch(Exception e)
        {
             System.out.println("You messed up");       
        }

    }
   
    public enum Teams {
        //These are like mini classes, have a variable abc
    CHI ("Chicago Cubs"),
    CUB (""),
    CIN (""),
    RED(""),
    MIL(""),
    BRE(""),
    PIT(""),
    PIR("");  
    
    private String abv;
    
    //constructor
    //helps the the code know which variable to use
    Teams (String abv)
    {
        this.abv = abv;
    }
    
    //getter
    //getter should be connected to the constructor
    //getters return items
    public String getAbv()
    {
        return abv;        
    }
    
    } 
    
    
    
}
