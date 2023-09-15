public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n==Task 1 Counting the sum of even and odd numbers==");
        int x = 0;
        int y =0;
        int start = -10;
        int finish = 21;
        int i = start;
        do {
            if (i % 2 == 0) {
                x += i;
            } else {
                y += i;
            }
            i++;
        } while (i <= finish);
        System.out.println("In the segment [" + start + ", " + finish + "]" + 
                ", the sum of even numbers = " + x + ", and the sum of odd numbers = " + y);

        System.out.println("\n==Task 2 Display numbers in descending order==");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num3 > num1 && num1 < num2) {
            min = num1;
        } else if (num1 > num3 && num3 < num2) {
            min = num3;
        } else if (num1 > num2 && num2 < num3) {
            min = num2;
        }
        if (num3 < num1 && num1 > num2) {
            max = num1;
        } else if (num1 < num3 && num3 > num2) {
            max = num3;
        } else if (num1 < num2 && num2 > num3) {
            max = num2;
        }
        for (int j = min; j <= max; j++) {
            System.out.print(j);
        }

        System.out.println("\n\n==Task 3 Printing the reverse number and the sum of its digits==");
        int num = 1234;
        int sum = 0;
        int k = 4;
        while (k > 0) {
            int tmp = num % 10;
            sum += tmp;
            System.out.print(tmp);
            num /= 10;
            k--;
        }
        System.out.println("\n" + sum);
    }
}