#include<stdio.h>

int main() {

	//scanf : ������ ���� ���� �Է¹����� ����ϴ� �Լ�
	// ������ printf�� �����ϴ�
	
	//��, �������� scanf�� ������ ��Ű�� �ִ� ���̴�(���Ȱ� �뷮����)
	// ����ϴ¹�
	// 1.�׳� scanf�� ���¹� : include<stdio.h> ���� #define_CRT_SECURE_NO_WARNINGS �Է��Ѵ�
	// 2.scanf�� �Ⱦ��¹� : scanfs()�� ����Ѵ� ������ �����ϴ�

	char character;
	int inum;
	float fnum;

	scanfs("%c", &character);
	scanfs("%d", &inum);
	scanfs("%f", &fnum);

	print("%c  %d %f \n", character, inum, fnum);
	return 0;

}