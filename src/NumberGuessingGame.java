
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vickj2854
 */
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner input = new Scanner(System.in);

        //create a random number 
        int randomNumber = (int) (Math.random() * 100) + 1;
// force a number between 1 and 100
        while(true){
            System.out.println("Guess a number between 1 and 100");
            int guess = input.nextInt();

            // check the guess 
            if (guess == randomNumber) {
                System.out.println("You win!");
            break;
            } else if (guess > randomNumber) {
               // too high a guess
                System.out.println("Too high");
            } else {
                System.out.println("too low");
    
            }
        }

    }
}
