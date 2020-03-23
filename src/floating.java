public class floating {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float  Maximum Value = " + myMaxFloatValue);
       
        double myMinDoubleValue = Float.MIN_VALUE;
        double myMaxDoubleValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinDoubleValue);
        System.out.println("Float  Maximum Value = " + myMaxDoubleValue);

        int myIntValue =5 /2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d /3d;

        System.out.println("my Int Value = " + myIntValue);
        System.out.println("my Float Value = " + myFloatValue );
        System.out.println("my Double Value = " + myDoubleValue);

        int pounds = 4;
        double calculation = pounds * 0.45359237d;
        System.out.println("The calculation of 4 pounds into kilograms = " + calculation);
    
    }
}
