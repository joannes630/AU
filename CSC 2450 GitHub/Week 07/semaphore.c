#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

sem_t sem; // semaphore variable

void* worker(void* arg) {
    int id = *(int*)arg;

    printf("Thread %d waiting to enter critical section...\n", id);
    sem_wait(&sem); // try to enter (decrement semaphore)

    printf("Thread %d entered critical section.\n", id);
    sleep(2); // simulate some work

    printf("Thread %d leaving critical section.\n\n", id);
    sem_post(&sem); // exit (increment semaphore)

    return NULL;
}

int main() {
    pthread_t t1, t2, t3;
    int id1 = 1, id2 = 2, id3 = 3;

    // Initialize semaphore to 2 → allows two threads at once
    sem_init(&sem, 0, 2);

    pthread_create(&t1, NULL, worker, &id1);
    pthread_create(&t2, NULL, worker, &id2);
    pthread_create(&t3, NULL, worker, &id3);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    pthread_join(t3, NULL);

    sem_destroy(&sem);

    printf("All threads finished.\n");
    return 0;
}
