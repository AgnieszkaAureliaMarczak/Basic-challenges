import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 1;
        int sum = 0;
        System.out.println("Enter 5 numbers.");
        while (numberCount < 6) {
            System.out.println("Enter number #" + numberCount + ": ");
            String numberFromUser = scanner.nextLine();
            try {
                int number = Integer.parseInt(numberFromUser);
                numberCount++;
                sum += number;
            } catch (NumberFormatException notNumber) {
                System.out.println("Invalid number");
            }
        }
        System.out.println("The sum of the five munbers = " + sum);
    }
}
