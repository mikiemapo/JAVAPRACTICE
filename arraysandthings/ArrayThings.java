package arraysandthings;

public class ArrayThings {
    public static void main(String[] args) {
        System.out.println("============ ====ARAYS==== ======");
        String[] supervillain = { "Dr. DOOM", "lex Luther", "Magnito", "Joker", "Loki", "Catwoman", "Thanos " };
        // create a new empty array
        String[] myArray = new String[5];
        // print array item at index
        System.out.println(supervillain[2]);
        System.out.println("============ ====ARAYS==== ======");
        // assaign variable name to array item 6
        String villain = supervillain[6];

        System.out.println(villain);
        System.out.println("============ ====ARAYS==== ======");
        // assaign new name to array item 4
        supervillain[4] = "Galactus";
        System.out.println(supervillain[4]);
        System.out.println("============ ====ARAYS==== ======");

        // try access an empty array
        // System.out.println(myArray[5]);
        System.out.println("============ ====ARAYS==== ======");

        // itarate through an array and give index number
        for (int index = 0; index < supervillain.length; index++) {
            System.out.println(supervillain[index] + " " + index);
        }

    }
}
