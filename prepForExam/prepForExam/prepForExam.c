#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <Windows.h>

int main() {
	//Random numbers
	srand(time(NULL));
	
	for (int i = 0; i < 15; i++) {
		int liczba = rand() % 5-1;
		printf("%d\n", liczba);
	}
	return 0;
}