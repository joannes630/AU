#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>  // for usleep()

int main() {
    while (1) {
        // Allocate 1 MB of memory in each iteration
        void *ptr = malloc(1024 * 1024 * 1024);

        if (ptr == NULL) {
            printf("Memory allocation failed! Out of memory.\n");
            return 1;
        }

        // Use the memory (optional, to force actual allocation)
        ((char *)ptr)[0] = 0;

        printf("Allocated memory. Still running...\n");

        // No free(ptr) here → memory leak
        // free(ptr);

        usleep(100000);  // sleep for 100 ms (100,000 microseconds)
    }

    return 0;
}
