#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main() {

	int peachs; //������ ��ü ����
	int fullbox; //10���� �� �� �ٱ��� ��
	int box; // ���� �ٱ��� ��

	printf("�������� ������ : ");
	scanf("%d", &peachs);

	fullbox = peachs / 10; //�ϴ� 10���� �� �� �ٱ����� ���� ����Ҽ��ִ�

	//10���� �ȵȴٸ� 1�ڽ��� �� �߰�, �ƴϸ� �ڽ��� �߰����� �ʴ� ����
	box = fullbox + (peachs % 10 ? 1 : 0);




	return 0;
}