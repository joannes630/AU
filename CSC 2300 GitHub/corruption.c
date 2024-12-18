#include <stdio.h>
#include <stdlib.h>

struct MyStruct {
    int a[5];
    char b;
    int c;
};

int main() {
    struct MyStruct myStruct;
    myStruct.b = 0;
    myStruct.c = 10;

    printf("The value of b is %d\n", myStruct.b);
    printf("The value of c is %d\n", myStruct.c);
    printf("The sum of b and c is %d\n\n", myStruct.b + myStruct.c);

    // The loop runs 6 times, accessing array[5] is out of bounds
    for (int i = 0; i <= 5; i++) {
        myStruct.a[i] = i;
    }
   printf("The sum of b and c is %d\n", myStruct.b + myStruct.c);

    printf("Address of a: %p\n", (void*)&myStruct.a);
    printf("Address of b: %p\n", (void*)&myStruct.b);
    printf("Address of c: %p\n", (void*)&myStruct.c);

}


 
