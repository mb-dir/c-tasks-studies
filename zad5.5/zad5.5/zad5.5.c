#include <stdio.h>
#include <stdlib.h>

int nwd(int a, int b);

int main() {
	int value = nwd(19,48);
	printf("%d", value);
	return 0;
}
int nwd(int a, int b) {
	if (a == b) {
		return a;
	}
	else {
		if (a > b) {
			return nwd(a-b, b);
		}
		else {
			return nwd(a, b-a);
		}
	}
}