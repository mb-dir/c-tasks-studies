#include <stdio.h>
#include <stdlib.h>

int fib(int a);

int main() {
	int value = fib(6);
	printf("%d", value);
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