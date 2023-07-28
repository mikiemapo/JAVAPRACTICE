package castingDataTypes;

public class Main {
    public static void main(String[] args) {
        int value = 10;
        double value2 = 13.5;

        double sum = value + value2;
        System.out.println(sum);

        int sum2 = value + (int) value2;
        // This line will give a compile-time error because the addition of two integers
        // to fix this add (int) to double value
        // integer, which cannot be assigned to a variable with type 'double'.
        System.out.println(sum2);

        byte aByte = 20;
        short aShort = 50;

        byte sum3 = (byte) (aByte + aShort);
        // system will show error because of upcasting because of the types assigned to
        // fix this add the (byte) value to equation and wrap the values in ()
        System.out.println(sum3);

    }
}
