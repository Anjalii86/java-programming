import java.util.*;
public class numberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5; // Limiting the number of attempts

        int score = 0; // Initialize score
        boolean playAgain = true;

        while (playAgain) {
            // Generate a random number within the specified range
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nI've picked a number between " + minRange + " and " + maxRange + ". Guess what it is!");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + "): ");
                int userGuess = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                if (userGuess < minRange || userGuess > maxRange) {
                    System.out.println("Your guess is out of range. Please guess a number between " + minRange + " and " + maxRange + ".");
                    continue;
                }

                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number (" + randomNumber + ") in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1; // Score calculation (higher score for fewer attempts)
                    guessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you have used all " + maxAttempts + " attempts. The correct number was: " + randomNumber);
            }

            // Ask if the user wants to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgainResponse = scanner.nextLine().trim().toLowerCase();

            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }

        // Display final score
        System.out.println("\nYour final score is: " + score);

        scanner.close();
    }
}
