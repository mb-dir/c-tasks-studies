#include <stdio.h>

int main() {
	printf("zad 1\n");

	int numerAlbumu = 213712;
	printf("Numer albumu: %d\n", numerAlbumu);

	printf("zad 2\n");
	
	int liczbaDoSprawdzenia;
	printf("Podaj liczbe calkowita: ");
	scanf_s("%d", &liczbaDoSprawdzenia);
	int mod = liczbaDoSprawdzenia % 2;

	if (mod == 0) {
		printf("Liczba: %d jest parzysta\n", liczbaDoSprawdzenia);
	}
	else {
		printf("Liczba: %d nie jest parzysta\n", liczbaDoSprawdzenia);
	}

	printf("zad 3\n");
	float a, b;
	printf("Podaj dwie liczby zmiennoprzecinkowe: ");
	scanf_s("%f %f", &a, &b);
	
	if (a > b) {
		printf("%f jest wieksza od %f\n", a ,b);
	}else if (a == b) {
		printf("%f rowna sie %f\n", a, b);
	}else {
		printf("%f jest mniejsza od %f\n", a, b);
	}

	printf("zad 4 \n");
	float c, d, e, f, srednia;
	printf("Wprowadz 4 liczby zmiennoprzecinkowe: ");
	scanf_s("%f %f %f %f", &c,&d,&e,&f);
	srednia = (c + d + e + f) / 4;
	printf("Srednia arytmetyczna liczb %f %f %f %f to %f", c,d,e,f,srednia);

	return 0;
}