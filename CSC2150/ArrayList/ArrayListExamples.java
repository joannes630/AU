import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {

//    1. A template for the ArrayListExamples class has been provided. Your task is to implement a public method
//    named initializeArrayList. This method should create and populate an ArrayList with the following
//    Integer values: 101, 108, 86, 76, 44.
//
//    The method will then return the populated ArrayList to the caller.

    public ArrayList<Integer> initializeArrayList() {
        ArrayList<Integer> arrayL = new ArrayList<>();
        arrayL.add(101);
        arrayL.add(108);
        arrayL.add(86);
        arrayL.add(76);
        arrayL.add(44);
        return arrayL;
    }

//    2. A template for the ArrayListExamples class has been provided.
//    Your task is to implement a public method named averagingArrayList.
//    The method will accept one argument, which is an ArrayList of Integers.
//    This method should compute the average of all the Integer elements in the ArrayList and
//    return the average value to the caller.

    public double averagingArrayList(ArrayList<Integer> arrayL) {
        int sum = 0;
        for (Integer number: arrayL) {
            sum += number;
        }
        double avg = (double) sum / arrayL.size();
        return avg;
    }

//    3. Create a public method named removeElement within the ArrayListExamples class.
//    This method should take two parameters:
//
//    An ArrayList of Integer objects.
//    An Integer object representing the element to be removed.
//    Method Behavior:
//
//    The method should remove the first occurrence of the specified element from the list.
//    If the element is successfully removed, the method should return true.
//    If the element is not found in the list, the method should return false.

    public boolean removeElement(ArrayList<Integer> arrayL, Integer obj) {
        return arrayL.remove(obj);
    }

//    4. Create a public method named replaceElementByValue within the ArrayListExamples class.
//    This method should take three parameters:
//
//    An ArrayList of Integer objects.
//    An Integer object representing the element to be replaced.
//    An Integer object representing the replacement element.
//    Method Behavior:
//
//    The method should replace the first occurrence of the element specified in the second parameter
//    with the element specified in the third parameter.
//    If the element to be replaced is not found in the list, the method should return false.
//    Otherwise, it should return true.
//
    public boolean replaceElementByValue(ArrayList<Integer> arrayL, Integer obj1, Integer obj2) {
        int index = arrayL.indexOf(obj1);
        if (index != -1) {
            arrayL.set(index, obj2);
            return true;
        }
        else {
            return false;
        }
    }
}
