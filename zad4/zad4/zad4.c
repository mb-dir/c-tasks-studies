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
}
