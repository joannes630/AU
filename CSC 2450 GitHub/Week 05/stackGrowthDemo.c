#include <stdio.h>
#include <stdlib.h>

// Function prototypes
void methodA(int x);
void methodB(int y);
void methodC(int z);

int main() {
    printf("Program started\n");
    methodA(5);
    printf("Program finished\n");
    return 0;
}

void methodA(int x) {
    int a = x * 2;
    printf("location of methodA stack : %p\n", (void*)&a);

    printf("In methodA, a = %d\n", a);
    methodB(a);
    printf("Returning from methodA\n");
}

void methodB(int y) {
    int b = y + 3;
    printf("location of methodB stack : %p\n", (void*)&b);

    printf("In methodB, b = %d\n", b);
    methodC(b);
    printf("Returning from methodB\n");
}

void methodC(int z) {
    int c = z - 1;
    printf("location of methodC stack : %p\n", (void*)&c);

    printf("In methodC, c = %d\n", c);
    // No further calls here
    printf("Returning from methodC\n");
}
