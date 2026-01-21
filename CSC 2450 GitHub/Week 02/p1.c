#include <stdio.h>
#include <unistd.h>

int main() {
    while(true) {
        printf("%s\n", "P1 Running...");
        usleep(100000);
    }
}
