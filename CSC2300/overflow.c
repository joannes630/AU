#include <stdio.h>
#include <stdlib.h>

int main() {
    unsigned char a = 245;
    unsigned char b = 10;
    unsigned char c;
    printf("The value of a is %u\n", a);
    printf("The value of b is %u\n", b);
    c = a + b;
    printf("The sum of a and b is %u\n", c);
}
