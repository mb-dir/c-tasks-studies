#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#define _CRT_SECURE_NO_WARNINGS
int main()
{
	//zad1

	char t1[123];
	char t2[123];

	printf_s("Podaj wyraz jakis: ");
	gets(t1);
	printf_s(t1);
	printf("\n");

	strcpy(t2, t1);
	printf_s(t2);
	printf("\nzlaczony tekst: ");
	printf("%s",strcat(t1, t2));

	printf("\ndlugosc zlaczanego tekstu: %d", strlen(t1));

	//zad2
	
	for (int i = 97; i < 123; i++) {
		if(i==97) {
			printf("znak - kod\n");
		}
		printf("%c - %d\n", i, i);
	}printf("\n\n");

	for (int i = 65; i < 91; i++) {
		if (i == 65) {
			printf("znak - kod\n");
		}
		printf("%c - %d\n", i, i);
	}printf("\n\n");

	for (int i = 48; i < 58; i++) {
		if (i == 48) {
			printf("znak - kod\n");
		}
		printf("%c - %d\n", i, i);
	}
}
