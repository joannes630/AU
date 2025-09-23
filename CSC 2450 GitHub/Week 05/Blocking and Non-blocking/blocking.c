#include <stdio.h>
#include <unistd.h>
#include <fcntl.h>
#include <errno.h>
#include <string.h>

int main() {
    char buf[100];
    int n;





    printf("Blocking read from stdin...\n");

    n = read(STDIN_FILENO, buf, sizeof(buf) - 1);

    if (n < 0) {
        if (errno == EAGAIN || errno == EWOULDBLOCK) {
            printf("No input available right now. \n");
        } else {
            perror("read");
        }
    } else if (n == 0) {
        printf("End of input.\n");
    } else {
        buf[n] = '\0';
        printf("You typed: %s\n", buf);
    }

    return 0;
}
