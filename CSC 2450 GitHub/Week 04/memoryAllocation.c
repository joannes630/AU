#include <stdio.h>
#include <stdlib.h>

int main() {
    printf("Heap memory allocation demo\n");
    int x = 10;
    int y[100];

    // Allocate space for a single int
    int *num = malloc(sizeof(int));
    if (num == NULL) {
        perror("malloc failed");
        return 1;
    }
    *num = 42;
    printf("Value at num = %d (address: %p)\n", *num, (void*)num);
    free(num);  // Free the memory
    printf("Freed memory for num\n\n");

    // Allocate an array of 5 integers
    int *arr = malloc(5 * sizeof(int));
    if (arr == NULL) {
        perror("malloc failed");
        return 1;
    }
    for (int i = 0; i < 5; i++) {
        arr[i] = i * 10;
        printf("arr[%d] = %d (address: %p)\n", i, arr[i], (void*)&arr[i]);
    }
    free(arr);  // Free the array
    printf("Freed memory for arr\n");

    return 0;
}
