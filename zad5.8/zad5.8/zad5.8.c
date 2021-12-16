#include <stdio.h>
#include <stdlib.h>

float ciag(float a);

int main() {
	float value = ciag(3);
	printf("%f", value);
	return 0;
}

float ciag(float a) {
	if (a == 1) {
		return 1;
	}
	else if (a == 2) {
		return 0.5;
	}
	else {
		return -1 * ciag(a - 1) * ciag(a - 2);
	}
}