#include <stdio.h>
#include <stdlib.h>

void toBin(int a);

int main() {
	toBin(19);
	return 0;
}

void toBin(int a) {
	if (a!=0) {
		toBin(a/2);
		printf("%d", a%2);
	}
}