#pragma once
#include <stdbool.h>
#include <math.h>
bool czyPierwsza(int liczba) {
	if (liczba < 2) {
		return false;
	}
	else {
		for (int i = 2; i <= liczba/2; i++) {
			if (liczba % i == 0) {
				return false;
			}
		}
		return true;
	}
}