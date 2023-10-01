import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = "";
        while(!option.equals("no")) {
            System.out.print("\nEnter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the sign of the mathematical operation: ");
            char sign = sc.next().charAt(0);
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            Calculator calc = new Calculator(a, sign, b);
            calc.calculate();
            do {
                System.out.print("Do you want to continue calculating? [yes/no]: ");
                option = sc.next();
                if (option.equals("no")) {
                    break;
                }
            } while(!option.equals("yes"));
        }
    }
}