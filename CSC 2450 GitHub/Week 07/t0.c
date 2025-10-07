#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

#include "common.h"
#include "common_threads.h"

int global_data = 101;
int *p;

void *mythread(void *arg) {
    printf("%s, global_data=%d, heap data = %d\n", (char *) arg, global_data, *p);
    return NULL;
}

int main(int argc, char *argv[]) {                    
    if (argc != 1) {
    	fprintf(stderr, "usage: main\n");
    	exit(1);
    }

    p = (int *) malloc(sizeof(int));
    *p = 102;  // set the value

    pthread_t p1, p2;
    printf("main: begin\n");
    Pthread_create(&p1, NULL, mythread, "A"); 
    Pthread_create(&p2, NULL, mythread, "B");
    // join waits for the threads to finish
    Pthread_join(p1, NULL); 
    Pthread_join(p2, NULL); 
    printf("main: end\n");
    return 0;
}
