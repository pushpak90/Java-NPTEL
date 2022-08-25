import java.util.Scanner;

public class Exercise5_3 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        // Get the result of a/b;
        try {
            System.out.print(a / b);
        } catch (ArithmeticException e) {
            System.out.print("Exception caught: Division by zero.");
        }
    }
}
