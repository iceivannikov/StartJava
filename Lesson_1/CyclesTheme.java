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
    }
}