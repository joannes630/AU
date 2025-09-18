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

    *ptr = 99;
    printf("Value: %d\n", *ptr);

    // Free the memory once (correct)
    free(ptr);

    // Double free error: freeing the same memory again
    free(ptr);

    return 0;
}
