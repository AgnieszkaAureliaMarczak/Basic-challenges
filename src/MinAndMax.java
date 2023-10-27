import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxNumber = 0;
        double minNumber = 0;
        int loopCount = 0;
        do {
            System.out.println("Enter any number. If you want to quit enter any character.");
            String podanaWartosc = scanner.nextLine();
            try {
                double podanaLiczba = Double.parseDouble(podanaWartosc);
                 if (loopCount == 0 ||podanaLiczba > maxNumber){
                     maxNumber = podanaLiczba;
                 } else if (podanaLiczba < minNumber || loopCount == 0) {
                     minNumber = podanaLiczba;
                 }
                loopCount++;
            } catch (NumberFormatException notNumber) {
                break;
            }
        } while (true);
        if (loopCount > 0){
            System.out.println("The max number is: " + maxNumber);
            System.out.println("The min number is: " + minNumber);
        } else {
            System.out.println("Not a number.");
        }
    }
}
