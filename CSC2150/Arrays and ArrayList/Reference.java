import java.util.Arrays;

public class Reference
{
    private void myMethod2(int[] array) {
        System.out.println(Arrays.toString(array));
        array = new int[6];
        array[2] = 100;
        System.out.println(Arrays.toString(array));
    }

    private void myMethod()
    {
        int[] array = {1, 2, 3, 4, 5};
        myMethod2(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args)
    {
        Reference ref = new Reference();
        ref.myMethod();
    }
}