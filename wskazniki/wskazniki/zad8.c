#pragma once
void zad8(int* a, int* b) {
	int x = *b;
	*b = *a;
	*a = x;
}