#include <stdio.h>
#include <string.h>

int main() {
    char secret[10] = "SAFE";
    char buffer[10];

    printf("Buffer is at %p, secret is at %p\n", (void*)buffer, (void*)secret);

    printf("Enter some text: ");
    gets(buffer);  // UNSAFE: no bounds checking

    printf("Buffer contains: %s\n", buffer);
    printf("Secret contains: %s\n", secret);

    return 0;
}
