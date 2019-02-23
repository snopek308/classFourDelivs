
package classfour;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class ClassFour {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        //This stores a date and tells the computer its a date. You put in as year, month, date
        LocalDate dateJoshua = LocalDate.of(1987, 3, 9);
        LocalDate dateRattle = LocalDate.of(1988, 10, 10);
        
        //This creates a period, how much time between two dates
        Period joshuaRattle = Period.between(dateJoshua, dateRattle);
        System.out.println("The time between The Joshua Tree and Rattle and Hum is: " + joshuaRattle.getYears() + " Year " + joshuaRattle.getMonths() + " Months " + joshuaRattle.getDays() + " Days");
        
        LocalDate newAlbum = LocalDate.of(
                //takes the date of the last album, adds the year from the period which you have to get, and then you get the year
                //Because you're making a date, you must repeat this information again for month and day
                //For some reason, to get day, you have to use .getDayofMonth
                dateRattle.plusYears(joshuaRattle.getYears()).getYear(),
                dateRattle.plusMonths(joshuaRattle.getMonths()).getMonth(),
                dateRattle.plusDays(joshuaRattle.getDays()).getDayOfMonth());
        System.out.println("The date of the new album is: " + newAlbum.getMonth() + " " +  newAlbum.getDayOfMonth() + ", " + newAlbum.getYear());

        
        
        
    }
    
}
