import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int counter = 0;
        int sum = 0;
        boolean stopInput = false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                int userInputInt = Integer.parseInt(input.nextLine());
                counter++;
                sum += userInputInt;
            } catch (NumberFormatException ignored) {
                stopInput = true;
                // break; could use true condition for while
            }
        } while (!stopInput); // (true) can use break to break out of while loop

        if (counter < 1) {
            System.out.println("SUM = 0 AVG = 0");
        } else {
            System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / counter));
        }
    }
}
