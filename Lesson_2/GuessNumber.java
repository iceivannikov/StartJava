import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 101;

    private Player player1;
    private Player player2;
    private final Scanner sc = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        int number = random.nextInt(MIN_NUMBER, MAX_NUMBER);
        int answer = 0;
        System.out.println("The computer has guessed a number, the game begins");
        while(number != answer) {
            answer = getAnswer(player1);
            if (checkNumber(number, answer, player1)) {
                break;
            }
            answer = getAnswer(player2);
            checkNumber(number, answer, player2);
        }
    }

    private int getAnswer(Player player) {
        System.out.printf("Player %s is your number: ", player.getName());
        return sc.nextInt();
    }

    private boolean checkNumber(int number, int answer, Player player) {
        boolean isEquals = answer == number;
        if (isEquals) {
            System.out.printf("Player %s win!!!\n", player.getName());
            return isEquals;
        }
        System.out.printf("The number %d is %s than what the computer guessed\n", 
                answer, (answer > number) ? "greater" : "less");
        return isEquals;
    }
}