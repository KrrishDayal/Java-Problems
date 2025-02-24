import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Ask for user input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine(); // Read entire line
        
        // Close the scanner
        scanner.close();
        
        // Split the sentence into words
        String[] words = sentence.trim().split("\\s+"); 
        
        // Count and display the number of words
        System.out.println("Number of words in the sentence: " + words.length);
    }
}
