#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main() {

	int peachs; //복숭아 전체 갯수
	int fullbox; //10개가 다 들어간 바구니 수
	int box; // 최종 바구니 수

	printf("복숭아의 갯수는 : ");
	scanf("%d", &peachs);

	fullbox = peachs / 10; //일단 10개가 다 들어간 바구니의 수를 계산할수있다

	//10개가 안된다면 1박스를 더 추가, 아니면 박스를 추가하지 않는 수식
	box = fullbox + (peachs % 10 ? 1 : 0);




	return 0;
}