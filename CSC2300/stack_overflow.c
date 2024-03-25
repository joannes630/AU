#include<stdio.h>
void fun(int a)
{
	if (a == 0)
	    return;
	a += 1;
	printf("%d\n", a);
	fun(a);
}

int main() 
{
	int a = 5;
	fun(a);
	printf("All done");
}