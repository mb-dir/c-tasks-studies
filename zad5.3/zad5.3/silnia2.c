#pragma once
long long int silnia2(int a) {
	if (a <= 0) {
		return 1;
	}
	else {
		if (a%2 == 0) {
			return a * silnia2(a - 2);
		}
		else {
			return a * silnia2(a - 2);
		}
	}
}