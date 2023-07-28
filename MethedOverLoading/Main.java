package MethedOverLoading;

public class Main {
    public static void main(String[] args) {
        add(1, 2);
        add(3, 4, 5);
        add(1.3, 25.1, 5);

    }

    public static void add(int first, int second) {
        System.out.println(first + second);
    }

    public static void add(int first, int second, int third) {
        System.out.println(first + second + third);
    }

    public static void add(double first, double second, double third) {
        System.out.println(first + second + third);
    }
}
