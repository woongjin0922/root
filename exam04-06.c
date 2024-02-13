#include<stdio.h>

int main() {

	//scanf : 형식을 갖춘 값을 입력받을때 사용하는 함수
	// 사용법은 printf와 동일하다
	
	//단, 얼마전부터 scanf를 사용금지 시키고 있는 중이다(보안과 용량문제)
	// 사용하는법
	// 1.그냥 scanf를 쓰는법 : include<stdio.h> 위에 #define_CRT_SECURE_NO_WARNINGS 입력한다
	// 2.scanf를 안쓰는법 : scanfs()를 사용한다 사용법은 동일하다

	char character;
	int inum;
	float fnum;

	scanfs("%c", &character);
	scanfs("%d", &inum);
	scanfs("%f", &fnum);

	print("%c  %d %f \n", character, inum, fnum);
	return 0;

}