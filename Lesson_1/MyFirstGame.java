public class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("==Task Game - Guess the number==");
        int minValue = 1;
        int maxValue = 100;
        int guessNumber = 33;
        int answer = 0;
        System.out.println("The computer has guessed a number, the game begins");
        int counter = 0;
        while (guessNumber != answer) {
            int randomNumber;
            do {
                randomNumber = (int) ((System.nanoTime() + counter) % 100) + 1;
                counter++;
            } while (randomNumber <= minValue || randomNumber >= maxValue);
            answer = randomNumber;
            if (answer > guessNumber) {
                System.out.println("The number " + answer + 
                        " is greater than what the computer guessed");
                maxValue = answer;
            } else if (answer < guessNumber) {
                System.out.println("The number " + answer + 
                        " is less than what the computer guessed");
                minValue = answer;
            } else {
                System.out.println("You win!!!");
            }
        }
    }
}