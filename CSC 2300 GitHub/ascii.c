#include <stdio.h>
#include <string.h>

int main() 
{
    char str[] = "Hello 123!";
    printf("The string is %s\n", str);
    for(int i=0; i<strlen(str); i++)
    {
        printf("%c is the number %d\n", str[i], str[i]);
    }
}

