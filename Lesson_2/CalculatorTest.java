import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = null;
        String countAgain = "";
        boolean isEndGame = false;
        while(!isEndGame) {
            System.out.print("\nEnter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the sign of the mathematical operation: ");
            char sign = sc.next().charAt(0);
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            calc = new Calculator(a, sign, b);
            calc.calculate();
            do {
                System.out.print("Do you want to continue calculating? [yes/no]: ");
                countAgain = sc.next();
                if (countAgain.equals("no")) {
                    isEndGame = true;
                    break;
                }
            } while(!countAgain.equals("yes"));
        }
    }
}