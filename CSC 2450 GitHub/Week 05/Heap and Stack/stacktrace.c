#include <stdio.h>
#include <stdlib.h>

void functionC() {
    printf("Inside functionC (Top of the stack)\n");
    printf("Exiting functionC\n");
}

void functionB() {
    printf("Inside functionB (Calling functionC)\n");
    functionC();  // Call functionC (pushed onto the stack)
    printf("Back in functionB after functionC returns\n");
}

void functionA() {
    printf("Inside functionA (Calling functionB)\n");
    functionB();  // Call functionB (pushed onto the stack)
    printf("Back in functionA after functionB returns\n");
}

int main() {
    printf("Inside main (Calling functionA)\n");
    functionA();  // Call functionA (pushed onto the stack)
    printf("Back in main after functionA returns\n");
    
    return 0;
}
