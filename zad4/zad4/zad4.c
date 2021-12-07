#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#define _CRT_SECURE_NO_WARNINGS

int indexLitery(char wyraz[123], char litera) {
	for (int i = 0; i < strlen(wyraz); i++) {
		if (wyraz[i] == litera) {
			return i;
		}
	}
	return -1;
}

int main()
{
	//zad1

	//char t1[123];
	//char t2[123];

	//printf_s("Podaj wyraz jakis: ");
	//gets(t1);
	//printf_s(t1);
	//printf("\n");

	//strcpy(t2, t1);
	//printf_s(t2);
	//printf("\nzlaczony tekst: ");
	//printf("%s",strcat(t1, t2));

	//printf("\ndlugosc zlaczanego tekstu: %d", strlen(t1));

	////zad2
	//
	//for (int i = 97; i < 123; i++) {
	//	if(i==97) {
	//		printf("znak - kod\n");
	//	}
	//	printf("%c - %d\n", i, i);
	//}printf("\n\n");

	//for (int i = 65; i < 91; i++) {
	//	if (i == 65) {
	//		printf("znak - kod\n");
	//	}
	//	printf("%c - %d\n", i, i);
	//}printf("\n\n");

	//for (int i = 48; i < 58; i++) {
	//	if (i == 48) {
	//		printf("znak - kod\n");
	//	}
	//	printf("%c - %d\n", i, i);
	//}

	////zad3
	////samogłoski: A, E, I, U, Y, O
	//char t3[123];
	//printf("Wprowadz slowo: ");
	//gets(t3);
	//int samogloski = 0;
	//int wspolgloski = 0;
	//for (int i = 0; i < strlen(t3); i++) {
	//	if (t3[i] == 'a' || t3[i] == 'e' || t3[i] == 'i' || t3[i] == 'u' || t3[i] == 'y' || t3[i] == 'o') {
	//		samogloski++;
	//	}
	//	else {
	//		wspolgloski++;
	//	}
	//}
	//printf("wyraz %s sklada sie z %d samoglosek i %d wspolglosek", t3,samogloski, wspolgloski);

	////zad 4

	//char t4[123];
	//printf("Podaj wyraz: ");
	//gets(t4);
	//_strupr(t4);
	//for (int i = strlen(t4); i >= 0; i--) {
	//	printf("%c", t4[i]);
	//}

	////zad5
	//char t5[123];
	//printf("Podaj lcizbe: ");
	//gets(t5);
	//for (int i = 0; i < strlen(t5); i++) {
	//	if (t5[i] == 48) {
	//		printf("zero ");
	//	}
	//	else if (t5[i] == 49) {
	//		printf("jeden ");
	//	}
	//	else if (t5[i] == 50) {
	//		printf("dwa ");
	//	}
	//	else if (t5[i] == 51) {
	//		printf("trzy ");
	//	}
	//	else if (t5[i] == 52) {
	//		printf("cztery ");
	//	}
	//	else if (t5[i] == 53) {
	//		printf("piec ");
	//	}
	//	else if (t5[i] == 54) {
	//		printf("szesc ");
	//	}
	//	else if (t5[i] == 55) {
	//		printf("siedem ");
	//	}
	//	else if (t5[i] == 56) {
	//		printf("osem ");
	//	}
	//	else if (t5[i] == 57) {
	//		printf("dziewiec ");
	//	}
	//}

	

	char s1[27] = "abcdefghijklmnopqrstuvwxyz";
	char s2[27] = "zyxwvutsrqponmlkjihgfedcba";
	char s3[123];
	printf("Podaj wyraz: ");
	gets(s3);
	for (int i = 0; i < strlen(s1); i++) {
		int index = indexLitery(s1, s3[i]);
		if (index != -1) {
			s3[i] = s2[i];
		}
	}
	printf_s(s3);
}
