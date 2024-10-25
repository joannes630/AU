public class MyHashSet {
    private int[] buckets;
    private final int EMPTY = -1;
    private final int DELETED = -2;
    private final int SIZE = 10;  // default size

    public MyHashSet() {
        buckets = new int[SIZE];
        // Initialize all buckets as EMPTY
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = EMPTY;
        }
    }

    // Hash function (simple modulo)
    private int hash(int key) {
        return key % SIZE;
    }

    // Insert function
    public void add(int key) {
        int index = hash(key);
        while (buckets[index] != EMPTY && buckets[index] != DELETED && buckets[index] != key) {
            index = (index + 1) % SIZE; // Linear probing
        }
        buckets[index] = key;
    }

    // Check if key exists
    public boolean contains(int key) {
        int index = hash(key);
        while (buckets[index] != EMPTY) {
            if (buckets[index] == key) {
                return true;
            }
            index = (index + 1) % SIZE; // Linear probing
        }
        return false;
    }

    // Remove function
    public void remove(int key) {
        int index = hash(key);
        while (buckets[index] != EMPTY) {
            if (buckets[index] == key) {
                buckets[index] = DELETED;
                return;
            }
            index = (index + 1) % SIZE; // Linear probing
        }
    }

    // Print the buckets (for debugging)
    public void printBuckets() {
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Bucket " + i + ": " + buckets[i]);
        }
    }

    // Main method to drive the implementation
    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();

        // Add some elements
        hashSet.add(5);
        hashSet.add(15);
        hashSet.add(25);
        hashSet.add(35);

        // Print the buckets
        System.out.println("After adding 5, 15, 25, 35:");
        hashSet.printBuckets();

        // Check if elements are present
        System.out.println("\nContains 15? " + hashSet.contains(15));
        System.out.println("Contains 10? " + hashSet.contains(10));

        // Remove an element
        hashSet.remove(15);
        System.out.println("\nAfter removing 15:");
        hashSet.printBuckets();

        // Check again if the element is present
        System.out.println("\nContains 15? " + hashSet.contains(15));
    }
}
