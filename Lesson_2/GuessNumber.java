import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int minNumber;
    private int maxNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        minNumber = 1;
        maxNumber = 101;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void start(int number, int answer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The computer has guessed a number, the game begins");
        while(number != answer) {
            System.out.print("Player " + player1.getName() + " is your number: ");
            answer = sc.nextInt();
            checkNumber(number, answer, player1);
            if (number == answer) {
                break;
            }
            System.out.print("Player " + player2.getName() + " is your number: ");
            answer = sc.nextInt();
            checkNumber(number, answer, player2);
        }
    }

    private void checkNumber(int number, int answer, Player player) {
        if (answer == number) {
            System.out.println("Player " + player.getName() + " win!!!");
            return;
        } else if (answer > number) {
            System.out.println("The number " + answer + 
                    " is greater than what the computer guessed");
        } else {
            System.out.println("The number " + answer + 
                    " is less than what the computer guessed");
        }
    }
}