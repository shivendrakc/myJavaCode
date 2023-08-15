package JavaCIHE;
import java.util.Scanner;

public class Main {

    public static boolean is_vowel(char letter) {
        // Convert the letter to lowercase for easier comparison
        letter = Character.toLowerCase(letter);
        
        // Check if the letter is a vowel
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
            return true;
        } 
        // If the letter is not a vowel, return false
        else {
            return false;
        }
    }

    public static int score_word(String word) {
        // Initialize the score to 0
        int score = 0;
        // Initialize the vowel count to 0
        int vowelCount = 0;
        // Iterate over each character in the word
        for (int i = 0; i < word.length(); i++) {
            // Check if the character is a vowel
            if (is_vowel(word.charAt(i))) {
                // If it is a vowel, increment the vowel count
                vowelCount++;
            }
        }
        // Determine the score based on the vowel count
        if (vowelCount >= 3) {
            // If there are 3 or more vowels, set the score to 2
            score = 2;
        } else if (vowelCount >= 1 && vowelCount < 3) {
            // If there is at least 1 vowel but less than 3, set the score to 1
            score = 1;
        }
        // Return the final score
        return score;
    }


    public static int score_words(String[] words) {
        int totalScore = 0; // initialize a variable to keep track of the total score
        
        // iterate over each word in the input array
        for (int i = 0; i < words.length; i++) {
            totalScore += score_word(words[i]); // add the score of the current word to the total score
        }
        
        return totalScore; // return the total score
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of words
        System.out.println("Enter the number of words : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Read the words
        System.out.println("Enter your text : ");
        String[] words = scanner.nextLine().split(" ");

        // Calculate the score of the words
        System.out.println("your total word score is : ");
        int totalScore = score_words(words);

        // Print the total score
        System.out.println(totalScore);

        scanner.close();
    }
}
