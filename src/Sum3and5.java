public class Sum3and5 {
    public static void main(String[] args) {
        int countOfNumbers = 0;
        int sumOfNumbers = 0;
        for (int i = 1; countOfNumbers < 5 && i <= 1000 ; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                sumOfNumbers+=i;
                countOfNumbers++;
                System.out.println("Number " + i + " is divisible by 3 and 5");
            }
        }
        System.out.println("The sum is " + sumOfNumbers);
    }
}
