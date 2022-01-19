#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <Windows.h>
#include <stdbool.h>

int main() {
	//Random numbers
	/*srand(time(NULL));
	
	for (int i = 0; i < 15; i++) {
		int liczba = rand() % 5-1;
		printf("%d\n", liczba);
	}*/

	//Draw christmas tree
	/*for (int i = 0; i < 10; i++) {
		for (int j = 10; j > i; j--) {
			printf(" ");
		}
		for (int j = 0; j <= i; j++) {
			printf("**");
		}
		for (int j = 10; j > i; j--) {
			printf(" ");
		}
		printf("\n");
	}*/

	int a=12;
	int* ptrA = &a;
	printf("%d %d %d", a, *ptrA, ptrA);
	return 0;
}