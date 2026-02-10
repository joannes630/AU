#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(void) {
    int *numbers;
    int n = 1024 * 1024;

    // Allocate memory for n integers on the heap
    int i;
    while(true)
    {
        numbers = (int *)malloc(n);

        free(numbers);
    }
}

