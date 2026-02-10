#include <stdio.h>

void recurse(void) {
    int local_array[1024];   // consume stack space
    static int x = 1;
    printf("Stack frame allocated %d times\n", x++);
    recurse();               // no base case
}

int main(void) {
    recurse();
    return 0;
}

