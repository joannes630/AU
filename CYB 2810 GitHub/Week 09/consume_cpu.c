#include <stdio.h>
#include <math.h>
#include <unistd.h>

int main() {
    volatile double x = 0.0;  // volatile prevents compiler optimization
    printf("Consuming CPU cycles... press Ctrl+C to stop.\n");

    while (1) {
        for (int i = 0; i < 1000000; i++) {
            x += sin(i) * tan(i);  // some heavy math
        }
    }
    return 0;
}

// To compile, don't forget -lm
