import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int answer = 0;
        String option = "";
        while(!option.equals("no")) {
            System.out.println("\nTo start the game you need to specify the names of the players");
            System.out.print("Enter the name of the first player: ");
            String namePlayer1 = sc.next();
            System.out.print("Enter the name of the second player: ");
            String namePlayer2 = sc.next();
            Player player1 = new Player(namePlayer1);
            Player player2 = new Player(namePlayer2);
            GuessNumber guessNumber = new GuessNumber(player1, player2);
            int minNumber = guessNumber.getMinNumber();
            int maxNumber = guessNumber.getMaxNumber();
            int number = random.nextInt(minNumber, maxNumber);
            guessNumber.start(number, answer);
            do {
                System.out.print("Do you want to continue playing? [yes/no]: ");
                option = sc.next();
            } while(!option.equals("yes") && !option.equals("no"));
        }
        sc.close();
    }
}