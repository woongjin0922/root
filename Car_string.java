package day16;

public class Car_string {
    
	//�ڵ��� �̸�
	private String carName;
	//�ڵ��� ȸ��
	private String company;
	
	//�ν��Ͻ��� �����ҋ� �����̸��� �����縦 �ʱ�ȭ�ϴ� �����ε��� �����
	public Car_string(String carName, String company) {
		this.carName = carName;
	    this.company = company;
	   }
	
	public String toString() {
	    return "�����̸� :"+ this.carName+" // ������ :"+ this.company;
	}
	
	//toString()�������̵� Ŭ����.toString()->���� �̸� : �ҳ�Ÿ,������: ����
	
}
