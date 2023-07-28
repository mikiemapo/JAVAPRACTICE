package List_arrays;

import java.util.*;

public class ListPractice {

    public void practiceList() {
        // Creating a list of integers
        List<String> sonicChar = new ArrayList<>();

        // 2nd way to create list

        // ArrayList<Integer> values = new
        // ArrayList<Interger>();

        sonicChar.add("Sonic");
        sonicChar.add("Tails");
        sonicChar.add("Knuckles");
        sonicChar.add("Shadow");
        sonicChar.add("Silver");

        // add to list specific index
        sonicChar.add(1, "Megaman");

        // update
        sonicChar.set(3, "rabbit");

        // remove
        sonicChar.remove(1);

        // print
        for (String characters : sonicChar) {
            System.out.println(characters);
        }
        System.out.println("---------reverse------------");

        Collections.reverse(sonicChar);

        System.out.println();

        for (int index = 0; index < sonicChar.size(); index++) {
            System.out.println(sonicChar.get(index));
        }
    }

}
