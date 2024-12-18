import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 2, 7, 9, 3));
        findDuplicates(numbers);
    }

    public static void findDuplicates(ArrayList<Integer> numbers) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i=0; i<numbers.size(); i++) {
            int countDups = 0;
            for (int j=i+1; j<numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    duplicates.add(i);
                    break;
                }
            }
        }
        System.out.println(duplicates);
    }
}
