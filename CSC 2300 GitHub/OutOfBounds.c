#include <stdio.h>
#include <stdlib.h>
int main()
{
    int A[50];
    int h = 5;
    A[30] = 2;
    A[30] = h + A[30] + 1;
    printf("The value of A[30] is %d", A[30]);
}

