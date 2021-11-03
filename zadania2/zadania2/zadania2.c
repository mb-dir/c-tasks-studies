#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <Windows.h>

int main() {
	//zad1
	/*float liczba1, suma1 = 0, srednia1 = 0, max1;
	int i1 = 0;

	printf("-----ZAD1-----\n");
	do {
		printf("Podaj liczbe: ");
		scanf_s("%f", &liczba1);
		
		//zakladam, ze liczba ujemna nie ma byc brana pod uwage w obliczeniach
		if (liczba1 >=0) {
			if (i1 == 0) {
				max1 = liczba1;
			}
			else if (liczba1 > max1) {
				max1 = liczba1;
			}
			suma1 += liczba1;
			i1++;
		}
	} while (liczba1 >= 0);
	srednia1 = suma1 / i1;
	printf("\nSuma: %f, srednia: %f, max: %f\n", suma1, srednia1, max1);
	*/
	//zad2
	/*
	printf("-----ZAD2-----\n");
	int sumaD = 0;
	int ileD = 0;
	int sumaU = 0;
	int ileU = 0;
	int liczba2;

	for (int i = 0; i < 10; i++) {
		printf("Podaj liczbe: ");
		scanf_s("%d", &liczba2);

		if (liczba2 >= 0) {
			sumaD += liczba2;
			ileD++;
		}
		else {
			sumaU += liczba2;
			ileU++;
		}
		
	}
	printf("\nSuma liczb dodatnich: %d, ilosc liczb dodatnich: %d, suma liczb niedodatnich: %d, ilosc liczb niedodatnich: %d\n", sumaD, ileD, sumaU, ileU);
	*/

	//zad3
	/*
	printf("-----ZAD3-----\n");

	int n;
	printf("Podaj n: ");
	scanf_s("%d", &n);
	if (n > 0) {
		int liczba3;
		int suma3 = 0;
		for (int i = 0; i < n; i++) {
			printf("Podaj liczbe: ");
			scanf_s("%d", &liczba3);
			if (liczba3%2 == 0) {
				suma3 += liczba3;
			}
		}
		printf("Suma parzystych liczb tego ciagu: %d", suma3);
	}
	else {
		printf("Niepoprawna wartosc n(n nie jest wieksze od 0)");
	}*/

	//zad4
	/*
	srand(time(NULL));
	int n2;
	printf("Podaj n: ");
	scanf_s("%d", &n2);
	if (n2 > 0) {
		int liczba4;
		int suma4 = 0;
		printf("kolejne wyrazy\n");
		for (int i = 0; i < n2; i++) {
			liczba4 = rand()% 56 - 10;
			printf("%d\n", liczba4);
			if (liczba4 % 2 == 0) {
				suma4 += liczba4;
			}
		}
		printf("Suma parzystych liczb tego ciagu: %d", suma4);
	}
	else {
		printf("Niepoprawna wartosc n(n nie jest wieksze od 0)");
	}*/

	//zad5
	/*
	int n3, j = 0, pkt;
	float sredniaPkt, sumaPkt = 0;
	printf("Podaj n: ");
	scanf_s("%d", &n3);

	while (j < n3) {
		printf("Podaj punkty dla ucznia nr %d: ", j+1);
		scanf_s("%d", &pkt);
		sumaPkt += pkt;
		j++;
	}
	printf("%d", sumaPkt);
	sredniaPkt = sumaPkt / n3;
	printf("Srednia punktow to: %f", sredniaPkt);*/

	//zad6
	/*
	printf("-----ZAD6-----\n");
	printf("");
	for (int i = 1; i <= 100; i++) {
		printf("%d ", i);
	}
	printf("\n\n");
	for (int i = 100; i >= 1; i--) {
		printf("%d ", i);
	}
	printf("\n\n");
	for (int i = 7; i <=77; i+=7) {
		printf("%d ", i);
	}
	printf("\n\n");
	for (int i = 20; i >= 0; i-=2) {
		printf("%d ", i);
	}
	*/

	//zad 7
	printf("-----ZAD7-----\n");
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10-i; j++) {
			printf("X");
		}
		printf("\n");
	}
	printf("\n\n");
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10 - i; j++) {
			printf(" ");
		}
		for (int j = 0; j <= i; j++) {
			printf("X");
		}
		printf("\n");
	}

	printf("\n\n");
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j <= i; j++) {
			printf(" ");
		}
		for (int j = 0; j < 10 - i; j++) {
			printf("X");
		}
		printf("\n");
	}

	printf("\n\n");
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10 - i; j++) {
			printf(" ");
		}
		for (int j = 0; j <= i; j++) {
			printf("XX");
		}
		for (int j = 0; j < 10 - i; j++) {
			printf(" ");
		}
		printf("\n");
	}
}