#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr;

    // Allocate memory for 1 integer
    ptr = (int *)malloc(sizeof(int));
    if (ptr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    *ptr = 42;
    printf("Before free: *ptr = %d\n", *ptr);

    // Free the memory
    free(ptr);

    // Dangling pointer: memory has been freed, but ptr still points there
    if (ptr != NULL)
        printf("After free: *ptr = %d  (UNDEFINED BEHAVIOR!)\n", *ptr);

    // Fix: set pointer to NULL after freeing
    //ptr = NULL;

    return 0;
}
