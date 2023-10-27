public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Even numbers from 5 up to and including 20:");
        int numberToBeChecked = 4;
        int lastNumber = 20;
        int evenNumberCount = 0;
        int oddNumberCount = 0;
        while (numberToBeChecked <= lastNumber){
            numberToBeChecked++;
            if (!isEvenNumber(numberToBeChecked)){
                oddNumberCount++;
                continue;
            }
            evenNumberCount++;
            System.out.println(numberToBeChecked);
            if (evenNumberCount >= 5){
                break;
            }
        }
        System.out.println("Total number of even numbers = " + evenNumberCount);
        System.out.println("Total number of odd numbers = " + oddNumberCount);
    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
