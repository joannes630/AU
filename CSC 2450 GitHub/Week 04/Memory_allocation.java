public class Memory_allocation {

    public static void main(String[] args) {
        int n = 1024 * 1024;

        for (int i = 0; i < 1000000; i++) {
            System.out.println("Iteration " + i);

            // Allocate memory on the heap
            int[] numbers = new int[n];

            // Purposeful memory leak:
            // numbers is still reachable until the loop iteration ends
            // (and if we store it somewhere, it will never be freed)
        }
    }
}

