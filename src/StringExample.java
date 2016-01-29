
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vickj2854
 */
public class StringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a word");
        String word = input.nextLine();
        
        int numChars = word.length();
       System.out.println(" The word is " + numChars + " long");
      
       if(word.equalsIgnoreCase("cat")){
           System.out.println("MEOW");
           
       }
       
       String upper = word.toUpperCase();
       String lower = word.toLowerCase();
       
       String leet = word.replace("e", "3");
       leet = leet.replace("a", "4");
       leet = leet.replace("1", "1");
       leet = leet.replace("s", "z");
       
       System.out.println("Leet speak" + leet);
       
       String pigLatin = word;
       // starts with a vowel 
       if(pigLatin.startsWith("a") 
               || pigLatin.startsWith("e")
               || pigLatin.startsWith("i")){
           pigLatin = pigLatin + "yay"; 
       }// does not start with a vowel
       else{
           int aFound = pigLatin.indexOf("a");
           String first = pigLatin.SubString(0, aFound);
           String last = pigLatin.SubString(0, aFound);
           pigLatin = last + first + "ay";
       
       System.out.println("In PigLatin: " + pigLatin);
       
       } 
    }
}

    
    
 
    



