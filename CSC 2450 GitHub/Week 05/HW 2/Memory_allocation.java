public class Memory_allocation {

    public static void main(String[] args) {
        int n = 1024 * 1024;

        while (true) {
            // Allocate memory on the heap
            int[] numbers = new int[n];

            // Purposeful memory leak.
            // but, since Java has an automatic garbage collection
            // unreferenced memory is automatically freed
        }
    }
}

