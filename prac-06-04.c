#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main() {

	int inputseconds;
	int sec, min, hour;

	printf("�ʸ� �Է��ϼ��� :");
	scanf("%d",&inputseconds);

	hour = inputseconds / (60 * 60); // 3600�ʷ� ������ �ð����� ȯ��ȴ�
	min = (inputseconds % (60 * 60)) / 60;// ��ü �ʸ� 3600���� ���� ���� �������� 60���� �ٽ� ������
	sec = inputseconds % 60;
	
	printf("%d�ð� %d�� %d��\n", hour, min, sec);



	return 0;
}