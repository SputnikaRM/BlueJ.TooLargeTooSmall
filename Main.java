
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// import scanner and random
import java.util.Scanner;
import java.util.Random;

public class Main{
    // instance variables - replace the example below with your own
    public static void main (String [] args) {
        
        // number will be between 0-10.
        Random number = new Random ();
        int n = number.nextInt(11);
        int tries = 0; 
        int guess = 0;
        
                // get user input
        while (guess != n) {
            
        System.out.println("Guess a number between 0-10");
        Scanner num = new Scanner(System.in);
        guess = num.nextInt();
        tries ++; 
        
        
        if (guess > n){
        System.out.println("The number is too large.");
        } else if (guess < n) {
        System.out.println("The number is too small.");
        } else {
        
        System.out.println("The number is correct. You're got the answer in " + tries + " tries!");
        
        }
    
    
    }
}
}

