#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <Windows.h>

int main()
{
	printf("--ZAD1--");
	int tab1[10];
	for (int i = 0, j = 3; i < 10; i++, j += 3) {
		tab1[i] = j;
	}
	for (int i = 0; i < 10; i++) {
		printf("%d\n", tab1[i]);
	}
	
	printf("\n--ZAD2--");
	int tab2[10];
	for (int i = 0, j = 3; i < 10; i++, j += 3) {
		tab2[i] = j;
	}
	for (int i = 0; i < 10; i++) {
		if (i % 2 == 0) {
			printf("%d\n", tab2[i]);
		}
	}

	printf("\n--ZAD3--\n");
	int a;
	int tab3[10];
	printf("podaj a: ");
	scanf_s("%d", &a);

	for (int i = 9, j = 0; i >= 0; i--, j += 5) {
		tab3[i] = a - j;
		printf("%d\n", tab3[i]);
	}

	printf("\n--ZAD4--\n");
	int tab4[10];
	srand(time(NULL));

	for (int i = 0; i < 10; i++) {
		int liczba = rand() % 74 - 23;
		tab4[i] = liczba;
	}
	printf("\n ---wygenerowana tablica ---\n");
	for (int i = 0; i < 10; i++) {
		printf("%d ", tab4[i]);
	}

	int min = tab4[0];
	for (int i = 1; i < 10; i++) {
		if (tab4[i] < min) {
			min = tab4[i];
		}
	}
	printf("\nminimalna wartosc: %d", min);

	printf("\n\n--ZAD5--\n");
	int tab5[10];
	int c, d;
	printf("Podaj dwa pierwsze elementy: \n");
	scanf_s("%d %d", &c, &d);
	tab5[0] = c;
	tab5[1] = d;
	for (int i = 2; i < 10; i++) {
		tab5[i] = tab5[i - 2] + tab5[i - 1];
	}
	for (int i = 0; i < 10; i++) {
		printf("%d ", tab5[i]);
	}

	printf("\n\n--ZAD6--\n");
	int tab6[20] = { 1,2,3,4,12125,6,7,8,9,10 };
	for (int i = 10; i < 20; i++) {
		tab6[i] = tab6[i-10];
	}

	for (int i = 0; i < 20; i++) {
		printf("%d ", tab6[i]);
	}
}
