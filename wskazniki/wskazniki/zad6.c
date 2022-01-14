#pragma once
void zad6(char* z, int* a) {
	for (int i = 0; i < *a; i++) {
		printf("%c", *z);
	}
	*a = *a-1;
}