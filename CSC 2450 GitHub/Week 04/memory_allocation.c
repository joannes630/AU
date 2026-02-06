#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int *numbers;
    int n = 1024;

    // Allocate memory for n integers on the heap
    int i;
    for (i=0; i<1000; i++) {
        printf("Iteration %d\n", i);
        numbers = (int *)malloc(n);
        // Purposeful memory leak!
    }

}

