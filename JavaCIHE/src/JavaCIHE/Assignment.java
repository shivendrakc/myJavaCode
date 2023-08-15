package JavaCIHE;
import java.util.Scanner;
import java.util.Arrays;

public class Assignment {
	public static boolean is_vowel(char letter) {
	    // Convert the letter to lowercase for easier comparison
	    letter = Character.toLowerCase(letter);
	    
	    // Check if the letter is a vowel
	    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y'
	    	||	letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y') {
	        return true;
	    } // If the letter is not a vowel, return false
	    else {
	    	return false;
	    }
	   
	    
	}

	public static int score_word(String word) {
		int score = 0;
		int m = 0;
		for (int i = 0; i < word.length() ; i++) {
			if (is_vowel(word.charAt(i))) {
				m =+ 1;
			}
		}
		if(m >= 3) {
			score = 2;
		}else if(m >= 1 && m < 3) {
			score = 1;
		}else {
			score = 0;
		}
		return score;
	}
	
	public static int score_words(String[] words) {
		int totalScore = 0;
			for (int i = 0; i < words.length; i++) {
				totalScore = score_word(words[i]);
			}
		return totalScore;
	}

	public static void main(String[] args) {
		String[] words = {"java", "application", "crwth"};
		
		int total_score = score_words(words);
		System.out.println("Numbers of word: " + words.length);
		System.out.println("Total score " + total_score);
	}
}
