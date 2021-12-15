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