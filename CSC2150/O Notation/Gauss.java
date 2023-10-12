public class Gauss {

    final static int SIZE = 1000;

    public static int iterative_sum(int[] array) {
        int sum=0;
        for(int i=0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    // https://letstalkscience.ca/educational-resources/backgrounders/gauss-summation
    public static int gauss(int[] array) {
        int n = array.length;
        int first = array[0];
        int last = array[array.length-1];
        int sum = n/2 * (first + last);
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        for (int i=0; i<SIZE; i++)
            array[i] = i;

        System.out.printf("The sum using iterative method is %d\n", iterative_sum(array));
        System.out.printf("The sum using Gauss method is %d\n", gauss(array));

    }
}
