#include <stdio.h>
#include <stdlib.h>

int silnia(int a);

int main() {
	int value = silnia(6);
	printf("%d", value);
	return 0;
}

int silnia(int a) {
	//1! == 1, 0!==1
	if (a <=1) {
		return 1;
	}
	else {
		return a * silnia(a - 1);
	}
}