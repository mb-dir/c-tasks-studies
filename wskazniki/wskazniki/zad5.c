#pragma once
int zad5(int* a, int* b) {
	int c = 1;
	for (int i = 0; i < *b; i++) {
		c = c * *a;
	}
	return &c;
}