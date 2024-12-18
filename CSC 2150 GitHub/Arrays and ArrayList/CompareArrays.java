public class CompareArrays {
    public boolean compareArrays(int[] firstArray, int[] secondArray) {
        boolean arraysEqual = true;    // Flag variable
        int index = 0;                 // Loop control variable

        // First determine whether the arrays are the same size.
        if (firstArray.length != secondArray.length)
            arraysEqual = false;

        // Next determine whether the elements contain the same data.
        while (arraysEqual && index < firstArray.length)
        {
            if (firstArray[index] != secondArray[index])
                arraysEqual = false;
            index++;
        }

        return arraysEqual;
    }

    public static void main(String[] args) {
        int[] firstArray = { 2, 4, 6, 8, 10 };
        int[] secondArray = { 2, 4, 6, 8, 10 };

        CompareArrays compare = new CompareArrays();
        boolean result = compare.compareArrays(firstArray, secondArray);
        System.out.println("The arrays are " + (result ? "the same" : "different"));
    }

}
