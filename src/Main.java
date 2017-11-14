import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int inputNumber = scanner.nextInt();
        System.out.println("The total of the digits is " + DigitAdder.addDigits(inputNumber));
    }

    private static class DigitAdder {
        static int addDigits(int inputNumber) {
            int total = 0;
            while (inputNumber % 10 != 0) {
                total += inputNumber % 10;
                inputNumber /= 10;
            }
            return total;
        }
    }
}
