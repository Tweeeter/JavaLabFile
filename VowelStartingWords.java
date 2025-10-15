//Q8 Write a program to enter a sentence form keyboard and also find all the words in that sentence with
//starting character as vowel.
import java.io.DataInputStream;
import java.io.IOException;

public class VowelStartingWords {
    public static void main(String[] args) throws IOException {
        // Create DataInputStream to read input
        DataInputStream dis = new DataInputStream(System.in);
        
        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = dis.readLine();
        
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        System.out.println("\nWords starting with vowels:");
        
        // Check each word for vowel at the beginning
        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = Character.toLowerCase(word.charAt(0));
                
                // Check if first character is a vowel
                if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || 
                    firstChar == 'o' || firstChar == 'u') {
                    System.out.println(word);
                }
            }
        }
    }
}
