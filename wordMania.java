import java.util.*;


public class wordMania {
    public static void main(String[] args) {
        String[] words = { "pretty", "fruit", "school", "sleep", "blue", "love", "some", "brave", "joy", "monday","holidays", "kind", "happy" };
        Random random = new Random();
        String guess_word = words[random.nextInt(words.length)];

        int max_tries = 6;
        int attemptsLeft = max_tries;
        boolean[] spelt_letters = new boolean[guess_word.length()];

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Hey Kids welcome to WORD MANIA\nLet us guess and spell some words! \n");
        char[] word_display = new char[guess_word.length()];
        for (int i = 0; i < guess_word.length(); i++) {
            word_display[i] = '_';
        }

        while (attemptsLeft > 0) {
            System.out.println("# of attempts left: " + attemptsLeft + "\n");
            System.out.println("Word length: " + new String(word_display));

            System.out.print("Guess the letters to spell the word: ");
            String input = scanner.next().toLowerCase();  

            if (input.length() > 1) {
                System.out.println("\n Please enter only one letter at a time.");
                continue;  
            }

            char guess = input.charAt(0);

            boolean found = false;
            for (int j = 0; j < guess_word.length(); j++) {
                if (guess_word.charAt(j) == guess) {
                    word_display[j] = guess;
                    spelt_letters[j] = true;
                    found = true;
                }
            }

            if (!found) {
                System.out.println("\nIncorrect guess.");
                attemptsLeft--;
            }

            boolean isComplete = true;
            for (boolean guessed : spelt_letters) {
                if (!guessed) {
                    isComplete = false;
                    break;
                }
            }

            if (isComplete) {
                System.out.println("HOORAY! You've spelt the word: " + guess_word);
                break;
            }
        }

        if (attemptsLeft == 0) {
            System.out.println("No more attempts left!. The Spelt word was : " + guess_word);
        }

        scanner.close();
    }
}