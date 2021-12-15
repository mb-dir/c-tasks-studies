#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <Windows.h>
#include <string.h>
#include "pola.h"

#define M_PI 3.14159265358979323846


int main()
{   
    //Some examples
    printf("%f", kolo(2, M_PI));
    printf("\n----\n");
    printf("%f", trojkat(5, 3));
    printf("\n----\n");
    printf("%f", prostopadloscian(12, 4, 1));
}

