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

	//zad3
	//samogłoski: A, E, I, U, Y, O
	char t3[123];
	printf("Wprowadz slowo: ");
	gets(t3);
	int samogloski = 0;
	int wspolgloski = 0;
	for (int i = 0; i < strlen(t3); i++) {
		if (t3[i] == 'a' || t3[i] == 'e' || t3[i] == 'i' || t3[i] == 'u' || t3[i] == 'y' || t3[i] == 'o') {
			samogloski++;
		}
		else {
			wspolgloski++;
		}
	}
	printf("wyraz %s sklada sie z %d samoglosek i %d wspolglosek", t3,samogloski, wspolgloski);

}
