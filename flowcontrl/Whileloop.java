package flowcontrl;

class Whileloop {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("before whiloop");
        while (number < 10) {
            System.out.println("Number is: " + number);
            number++;
        }
        System.out.println("after loop it wont execute if conditions false");

        int d = 0;
        System.out.println("before doloop");
        do {
            System.out.println("D is :" + d);
            d++;
        } while (d < 10);
        System.out.println("after doloop will execute once even if condition is false");
    }
}
