
/**
 * Creates a WordList.
 * Searches it for a given String.
 *
 * @author APCS-A @  HB
 * @version 2019-03-12 */
 
import java.util.Scanner;

public class WordSearch
{
    //  Only a main method, for testing
    public static void main (String[] args)
    {
        WordList myWords = new WordList();
        System.out.println(myWords.report());
        
        Scanner kbd = new Scanner (System.in);
        System.out.print ("\n\nEnter a possible word (or RETURN to quit): ");
        String word = kbd.nextLine();
        while (word.length() > 0)
        {
            if (myWords.sequentialSearch(word))
            {
                System.out.println (word + " is a legitimate word!");
            }
            else
            {
                System.out.println (word + " is NOT a real word.");
            }
            
            System.out.print ("Enter a possible word (or RETURN to quit): ");
            word = kbd.nextLine();
        }
    }
}
