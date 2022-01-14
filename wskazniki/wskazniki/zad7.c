#pragma once
void zad7(int* a, int* b, int *arr) {
	if (*a>=*b) {
		arr[0] = *b;
		arr[1] = b;
	}
	else {
		arr[0] = *a;
		arr[1] = a;
	}
}