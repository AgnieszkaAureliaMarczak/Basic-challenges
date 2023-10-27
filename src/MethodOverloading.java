public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5,9));
    }
    // 1 inch = 2.54 cm
  //  1 foot = 12 inches
public static double convertToCentimeters(int heightInInches){
        return heightInInches * 2.54;
}
public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches){
        int totalInches = (heightInFeet * 12) + remainingHeightInInches;
        return convertToCentimeters(totalInches);
}
}
