#include <stdio.h>
#include <stdlib.h>

void printBinary(unsigned int num) {
    if (num > 1) {
        printBinary(num >> 1);  // Recursively divide by 2 and print remainder
    }
    printf("%d", num & 1);      // Print the least significant bit
}

int main() 
{
    unsigned int x = 0x12345678;
    x = x & 0x00FF0000;
    x = x >> 16;
    printf("The value of the 3rd byte is 0x%.2x\n", x);
    printf("The value of the 3rd byte in binary is ");
    printBinary(x);
}

