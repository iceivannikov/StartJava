import java.util.Scanner;

public class Calculator {

    private int a;
    private char sign;
    private int b;

    // public Calculator() {

    // }

    // public int getA() {
    //     return a;
    // }

    // public void setA(int a) {
    //     this.a = a;
    // }

    // public int getB() {
    //     return b;
    // }

    // public void setB(int b) {
    //     this.b = b;
    // }

    // public char getSugn() {
    //     return sign;
    // }

    // public void setSign(char sign) {
    //     this.sign = sign;
    // }

    public void run() {
        Scanner sc = null;
        int result = 0;
        boolean isEndGame = false;
        String again = "";
        do {
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter the first number: ");
                int a = sc.nextInt();
                System.out.print("Enter the sign of the mathematical operation: ");
                char sign = sc.next ().charAt (0);
                System.out.print("Enter the second number: ");
                int b = sc.nextInt();
                switch(sign) {
                    case '+' -> result = sum(a, b);
                    case '-' -> result = subtract(a, b);
                    case '*' -> result = multiply(a, b);
                    case '^' -> result = pow(a, b);
                    case '/' -> result = divide(a, b);
                    case '%' -> result = getRemainderDivision(a, b);
                    default -> System.out.println("There is no such sign");
                }
                printResultCalculations(a, sign, b, result);
            } catch (ArithmeticException ex) {
                System.out.println("ArithmeticException, You can't " + ex.getMessage());
            }
            do {
                System.out.print("Do you want to continue calculating? [yes/no]: ");
                again = sc.next();
                if (again.equals("no")) {
                isEndGame = true;
                break;
                }
            } while(!again.equals("yes"));
        } while(!isEndGame);
    }

    private int sum(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    private int divide(int a, int b) {
        return a / b;
    }

    private int getRemainderDivision(int a, int b) {
        return a % b;
    }

    private void printResultCalculations(int a, char sign, int b, int result) {
        System.out.printf("%d %c %d = %d\n", a, sign, b, result);
    }
}