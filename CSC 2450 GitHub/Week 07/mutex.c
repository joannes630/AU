#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

#include "common.h"
#include "common_threads.h"

int max;
volatile int counter = 0; // shared global variable
pthread_mutex_t lock;     // global mutex

void *mythread(void *arg) {
    char *letter = arg;
    int i; // private per thread (stack)
    printf("%s: begin [addr of i: %p]\n", letter, &i);
    for (i = 0; i < max; i++) {
        pthread_mutex_lock(&lock);   // acquire lock
        counter = counter + 1;       // critical section
        pthread_mutex_unlock(&lock); // release lock
    }
    printf("%s: done\n", letter);
    return NULL;
}

int main(int argc, char *argv[]) {
    if (argc != 2) {
        fprintf(stderr, "usage: main-first <loopcount>\n");
        exit(1);
    }
    max = atoi(argv[1]);

    pthread_t p1, p2;

    pthread_mutex_init(&lock, NULL); // initialize mutex

    printf("main: begin [counter = %d] [%p]\n", counter, &counter);
    Pthread_create(&p1, NULL, mythread, "A");
    Pthread_create(&p2, NULL, mythread, "B");
    // join waits for the threads to finish
    Pthread_join(p1, NULL); 
    Pthread_join(p2, NULL); 

    printf("main: done\n [counter: %d]\n [should: %d]\n", 
           counter, max * 2);

    pthread_mutex_destroy(&lock);    // destroy mutex
    return 0;
}
