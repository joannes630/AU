#include <stdio.h>
#include <stdlib.h>
#include <sys/time.h>

// Function to get current time in milliseconds
long get_time_ms() {
    struct timeval tv;
    gettimeofday(&tv, NULL);
    return (tv.tv_sec * 1000) + (tv.tv_usec / 1000);
}

int main() {
    long start, end;

    // 1. Measure CPU computation (fast)
    start = get_time_ms();
    long sum = 0;
    for (long i = 0; i < 100000; i++) {  // 100 million additions
        sum += i;
    }
    end = get_time_ms();
    printf("Computation finished. Sum = %ld\n", sum);
    printf("Time taken (computation): %ld ms\n\n", end - start);

    // 2. Measure I/O operations (slow)
    start = get_time_ms();
    FILE *fp = fopen("output.txt", "w");
    if (fp == NULL) {
        perror("File open failed");
        return 1;
    }

    for (int i = 0; i < 100000; i++) {  // 100,000 writes
        fprintf(fp, "This is line %d\n", i);
    }
    fclose(fp);
    end = get_time_ms();

    printf("File writing finished.\n");
    printf("Time taken (I/O): %ld ms\n", end - start);

    return 0;
}
