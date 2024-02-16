#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main() {

	int inputseconds;
	int sec, min, hour;

	printf("초를 입력하세요 :");
	scanf("%d",&inputseconds);

	hour = inputseconds / (60 * 60); // 3600초로 나누면 시간으로 환산된다
	min = (inputseconds % (60 * 60)) / 60;// 전체 초를 3600으로 나눈 값의 나머지를 60으로 다시 나눈다
	sec = inputseconds % 60;
	
	printf("%d시간 %d분 %d초\n", hour, min, sec);



	return 0;
}