#include <stdio.h>
#include <stdlib.h>

int fib(int a);

int main() {
	int a;
	printf("Numer elementu ciagu fibinacciego: ");
	scanf_s("%d", &a);
	int value = fib(a);
	printf("%d element ciagu to: %d", a, value);
	return 0;
}

int fib(int a) {
	if (a == 0) {
		return 0;
	}else if(a == 1){
		return 1;
	}
	else {
		return fib(a - 2) + fib(a - 1);
	}
}