public class BigOGraphIt {

    public static int iterative_sum(int[] array) {
        int sum=0, count=0;
        for(int i=0; i < array.length; i++) {
            sum += array[i];
            count++;
        }
        System.out.printf("%d  %d\n", array.length, count);
        return sum;
    }

    public static int quadratic_sum(int[] array) {
        int sum=0, count=0;
        for(int i=0; i < array.length; i++) {
            for(int j=0; j<array.length; j++) {
                sum += array[i];
                count++;
            }
        }
        System.out.printf("%d  %d\n", array.length, count);
        return sum;
    }

    public static int logarithmic_sum(int[] array) {
        int sum=0, count=0;
        for(int i=0; i < array.length; i++) {
            sum += array[i];
            count++;
            i *= 2;
        }
        System.out.printf("%d  %d\n", array.length, count);
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
        for (int k=1; k<=4096; ) {
            int[] array = new int[k];

            for (int i=0; i<k; i++)
                array[i] = i;
            
            gauss(array);
            k *= 2;
        }
    }
}
