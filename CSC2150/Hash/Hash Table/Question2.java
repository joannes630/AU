package Quiz5;

import java.util.HashSet;
import java.util.ArrayList;

public class Question2 {
    public static HashSet<Integer> storeNumbers(ArrayList<Integer> numbers) {
        // Write your code here
        HashSet<Integer> myHash = new HashSet<>();
        for (int num: numbers) {
            myHash.add(num);
        }
        return myHash;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);

        System.out.println(storeNumbers(numbers));
    }
}