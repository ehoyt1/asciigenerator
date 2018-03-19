
/**
 * asciiGenerator! - Convert your text to ASCII!
 * 
 * @author  Ken Hoyt
 * @version 1.0
 * 
 * 
 * NEED TO DO!
 * 
 *   - Split word into separate characters
 *   - Use switch statement to assign character to specific ASCII representation
 * 
 * 
 * 
 * 
 */

package asciigenerator;
import java.util.Scanner;

/**
 *
 * @author kenhoyt
 */
public class AsciiGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Grab user input
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please enter a word to convert: ");
        String wordInput = scnr.next();
        
        
        
        
        // Output user input
        System.out.println(wordInput);
    }
    
}
