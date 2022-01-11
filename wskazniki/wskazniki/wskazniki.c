#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <Windows.h>

int main() {
	//int a = 4;//rezerwacja pamieci dla zmiennej a
	//wskaznik === adres zmiennej
	//int* ptr;
	//ptr = &a;

	//char tab[10];
	//char(*ptr)[10];

	//ptr = tab;

	//printf("wartosc zmiennej a: %d\n", *ptr);
	//printf("adres zmiennej a: %d", ptr);

	//int i;
	//int * p = &i;
	//for (i = 0; i < 10; i++) {
	//	printf("%d ", *p);
	//}

	//dynamiczne alokowanie wskaznikow w kontekscie tablic

	//zadania

	//zad1
	//float a, b, c;
	//float* ptr1 = &a, * ptr2 = &b, * ptr3 = &c;
	//printf("Adres zmiennej a: %d, adres zmiennej b: %d, adres zmiennej c: %d", ptr1,ptr2,ptr3);

	//printf("\nPodaj wartosci a,b,c: \n");
	//scanf_s("%f %f %f", &a,&b,&c);
	//printf("Adres zmiennej a: %d, adres zmiennej b: %d, adres zmiennej c: %d", ptr1, ptr2, ptr3);
	//printf("\nWartosc zmiennej a: %f, wartosc zmiennej b: %f, wartosc zmiennej c: %f", *ptr1, *ptr2, *ptr3);

	//float srednia = (*ptr1 + *ptr2 + *ptr3) / 3;
	//printf("\nSrednia a, b oraz c: %f", srednia);

	//float roznica = *ptr1 - *ptr2;
	//printf("\nRoznica a oraz b: %f", roznica);

	
	//zad2
	/*int n;
	int* arr = NULL;

	printf("Podaj n(wielkosc tablicy): ");
	scanf_s("%d", &n);

	arr = malloc(sizeof(int) * n);

	for (int i = 0; i < n; i++) {
		arr[i] = i;
	}

	printf("Adres 1 elementu: %d, %d", &arr[0], arr[0]);
	printf("\nAdres 4 elementu: %d, %d", &arr[3], arr[3]);

	int zakres1, zakres2 = 0;
	printf("\nPodaj zakres dolny i gorny: " );
	scanf_s("%d %d", &zakres1, &zakres2);
	if (zakres1 >= zakres2) {
		printf("\nBledne dane");
		return 0;
	}
	else {
		srand(time(NULL));
		for (int i = 0; i < n; i++) {
			int liczba = (rand() % (zakres2 - zakres1)) + zakres1;
			arr[i] = liczba;
		}

		for (int i = 0; i < n; i++) {
			printf("%d ", arr[i]);
		}
	}

	free(arr);
	arr = NULL;*/

	//zad3
	int n;
	float srednia = 0;
	int sumaElTab = 0;
	int* arr = NULL;

	printf("Podaj n(wielkosc tablicy): ");
	scanf_s("%d", &n);

	arr = malloc(sizeof(int) * n);

	for (int i = 0; i < n; i++) {
		arr[i] = 0;
	}

	for (int i = 0; i < n; i++) {
		int x;
		printf("Podaj wartosc: ");
		scanf_s("%d", &x);
		arr[i] = x;
		sumaElTab += x;
	}

	srednia = sumaElTab / n;
	printf("srednia: %f\n", srednia);
	printf("Elementy wieksze od sredniej: \n");
	for (int i = 0; i < n; i++) {
		if(arr[i] > srednia){
			printf("%d ", arr[i]);
		}
	}

	free(arr);
	arr = NULL;
	return 0;
}