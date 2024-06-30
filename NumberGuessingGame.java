import java.util.*;

public class NumberGuessingGame {
    public static void guessingNumberGame()
	{
		
		Scanner sc = new Scanner(System.in);

		
		int number = 1 + (int)(10
							* Math.random());

		
		int K = 10;
		int i, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 10."
			+ "Guess the number"
			+ " within 10 trials.");

		
		for (i = 0; i < K; i++) {

			System.out.println(
				"Guess the number:");

			
			guess = sc.nextInt();

			
			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number.");
				break;
			}
			else if (number > guess
					&& i != K - 1) {
				System.out.println(
					"The number guessed is too High");
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println(
					"The number guessed is too Low");
			}
		}

		if (i == K) {
			System.out.println(
				"You have exhausted"
				+ " K trials.");

			System.out.println(
				"The number was " + number);
		}
        
	}

	
	public static void main(String arg[])
	{

		
		guessingNumberGame();
	}
}

