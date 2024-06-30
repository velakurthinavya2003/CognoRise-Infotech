import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Hangman {
    public static void main(String[] args) {
        // Array of words to choose from
        String[] words = {"programming", "java", "hangman", "computer", "developer"};
        
        // Select a random word from the array
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        
        // To store the guessed word so far
        char[] guessedWord = new char[word.length()];
        Arrays.fill(guessedWord, '_');
        
        // Number of incorrect guesses
        int incorrectGuesses = 0;
        
        // Maximum allowed incorrect guesses
        int maxIncorrectGuesses = 6;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Hangman!");
        
        while (incorrectGuesses < maxIncorrectGuesses) {
            // Display the current state of the guessed word
            System.out.print("Current word: ");
            System.out.println(guessedWord);
            
            // Display the hangman figure
            displayHangman(incorrectGuesses);
            
            // Prompt the user to guess a letter
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);
            
            // Check if the guessed letter is in the word
            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }
            
            if (!correctGuess) {
                incorrectGuesses++;
                System.out.println("Incorrect guess! You have " + (maxIncorrectGuesses - incorrectGuesses) + " guesses left.");
            }
            
            // Check if the word is completely guessed
            if (new String(guessedWord).equals(word)) {
                System.out.println("Congratulations! You've guessed the word: " + word);
                break;
            }
        }
        
        if (incorrectGuesses == maxIncorrectGuesses) {
            displayHangman(incorrectGuesses);
            System.out.println("Game over! The word was: " + word);
        }
        
        scanner.close();
    }
    
    public static void displayHangman(int incorrectGuesses) {
        switch (incorrectGuesses) {
            case 0:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("=======");
                break;
            case 1:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("=======");
                break;
            case 2:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("=======");
                break;
            case 3:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("=======");
                break;
            case 4:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("=======");
                break;
            case 5:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/    |");
                System.out.println("     |");
                System.out.println("=======");
                break;
            case 6:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
                System.out.println("     |");
                System.out.println("=======");
                break;
        }
    }
}
