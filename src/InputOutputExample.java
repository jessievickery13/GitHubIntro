
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vickj2854
 */
public class InputOutputExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        // another version of it is: System.out.print("Please enter your name");
        // Get the users name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        // say hello
        System.out.println("Hello" + name + ". What year were you born?");
        
        int birthYear = input.nextInt();
        int age = 2015 - birthYear;   
        
        System.out.println ("You are " + age + " years old!");
        
        // comment about their age
        if(age > 20) {
            System.out.println("You are old!");
        }else if(age > 12 && age < 20)
        {
            System.out.println("You are a teen");
        }else{
            System.out.println("How are you doing this?");
            
        
        }
        
        
        
        
        
        
        
        
        
        
    }   
}
