#include <stdio.h>
#include <unistd.h>

int main() {
    while(true) {
        printf("%s\n", "P2 Running...");
        usleep(100000);
    }
}
