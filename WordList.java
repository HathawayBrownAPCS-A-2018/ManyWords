
/**
 * A list of many many words.
 * 25322 to be exact.
 * They need to be stored in the file "popular.txt" in the same folder
 * as the source code.
 *
 * @author Michael Buescher and APCS-A @ HB
 * @version 2019-03-12
 */

import java.util.Scanner;
import java.io.*;

public class WordList
{
  private String[] words;
  
  /**
   * Make a new WordList.
   * Choose here which type of Collection you want to use!
   */
  public WordList()
  {
    words = new String[25322];
    readFile ("popular.txt");
  }
  
  
  /**
   * Reads all lines of the text file filename into the collection words.
   * @param fileName the name of the text file
   */
  private void readFile (String fileName)
  {
    // open the file
    File file = new File(fileName);
    Scanner input = null;
    try
    {
        input = new Scanner(file);
    }
    catch (FileNotFoundException ex)
    {
        System.out.println("*** Cannot open " + fileName + " ***");
        System.exit(1);        // quit the program
    } 

    // read the words from the file, one per line
    int count = 0;
    while (input.hasNext())
    {
      String nextWord = input.nextLine();
      words[count] = nextWord;
      count++;
      //     System.out.println (nextWord);
    }      
    input.close();
  }

  /**
   * Return a String reporting on the number of words imported.
   * @return a String reporting the number of words imported.
   */
  public String report()
  {
    return "Successfully imported " + words.length + " words!";
  }
  
  public boolean sequentialSearch (String target)
  {
      return false;
  }
  
  public boolean binarySearch (String target)
  {
      return false;
  }
}
