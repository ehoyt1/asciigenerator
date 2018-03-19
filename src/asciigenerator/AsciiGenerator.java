
/**
 * asciiGenerator! - Convert your text to ASCII!
 * 
 * @author  Ken Hoyt
 * @version 1.0
 * 
 * 
 * NEED TO DO!
 * 
 *   - Use switch statement to assign character to specific ASCII representation
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
        
        // Split letters out
        for (int i = 0;i < wordInput.length(); i++){
            //System.out.print(wordInput.charAt(i) + " ");
            
            switch (wordInput.charAt(i)) {
            case 'A':
                System.out.println("     //\\        ");
                System.out.println("    // \\\\      ");
                System.out.println("   //   \\\\     ");
                System.out.println("  //======\\    ");
                System.out.println(" //       \\\\   ");
                System.out.println("//         \\\\  ");
                
                break;
                     
            }
            
        }
        System.out.println("");
        // Output user input
        System.out.println(wordInput);
    }
    
}
