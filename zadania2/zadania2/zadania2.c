#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <Windows.h>

int main() {
	//zad1
	/*float liczba1, suma1 = 0, srednia1 = 0, max1;
	int i = 0;

	printf("-----ZAD1-----\n");
	do {
		printf("Podaj liczbe: ");
		scanf_s("%f", &liczba1);
		
		//zakladam, ze liczba ujemna nie ma byc brana pod uwage w obliczeniach
		if (liczba1 >=0) {
			if (i == 0) {
				max1 = liczba1;
			}
			else if (liczba1 > max1) {
				max1 = liczba1;
			}
			suma1 += liczba1;
			i++;
		}
	} while (liczba1 >= 0);
	srednia1 = suma1 / i;
	printf("\nSuma: %f, srednia: %f, max: %f\n", suma1, srednia1, max1);
	*/
	//zad2
	
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
	
}