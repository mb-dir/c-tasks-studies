#include <stdlib.h>
#include <stdio.h>

#include "silnia2.h"

int main() {
	for (int i = 1; i < 20; i++) {
		long long int value = silnia2(i);

		printf("%d \n", value);
	}
}