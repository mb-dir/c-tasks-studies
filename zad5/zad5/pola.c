#pragma once
void error() {
 printf("Zle dane");
}

float kolo(float r, float pi) {
	if (r < 0 || pi < 0) {
		error();
		return 0;
	}
	return r*r * pi;
}
float kula(float r, float pi) {
	if (r < 0 || pi < 0) {
		error();
		return 0;
	}
	return (4 / 3) * pi * r * r * r;
}

float prostokat(float a, float b) {
	if (a < 0 || b < 0) {
		error();
		return 0;
	}
	return a * b;
}
float prostopadloscian(float a, float b, float c) {
	if (a < 0 || b < 0 || c < 0) {
		error();
		return 0;
	}
	return a * b * c;
}

float trojkat(float a, float h) {
	if (a < 0 || h < 0) {
		error();
		return 0;
	}
	return(a * h) / 2;
}

float szescian(float a) {
	if (a < 0) {
		error();
		return 0;
	}
	return a*a*a;
}

float walec(float r, float H, float pi) {
	if (r < 0 || H < 0 || pi < 0) {
		error();
		return 0;
	}
	return pi*r*r*H;
}