#include <stdlib.h>
#include <stdio.h>

#include <stdbool.h>

#include "czyPierwsza.h"

int main() {
	for (int i = 1; i < 20; i++) {
		if (czyPierwsza(i)) {
			printf("\n%d pierwsza", i);
		}
		else {
			printf("\n%d nie pierwsza", i);
		}
	}
	return 0;
}