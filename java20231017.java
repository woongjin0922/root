package section01;
import java.util.Scanner;
public class java20231017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//: float /double = �⺻���� ����Ʈ
		//�������� �������� �����ϰ� double �� �ڷ����� ��������
		double marathon = 42.195;
		//���� ������ �������� �����ϰ� float �� �ڷ����� ��������.
		float halfmarathon = 21.0975f;
		
	System.out.println("��������"+marathon+"km �޸��ϴ�.");
	System.out.println("���� ��������"+halfmarathon+"km �޸��ϴ�.");
	
	//�Ҽ� : ���е� (=ǥ���ϴ¹��)
	//3.14(�����Ҽ���) = 3.141592653589793
	//double / float ���� piedouble / piefloat
	
	Double pieDouble =  3.141592653589793;
	float piefloat =  3.141592653589793f;
	System.out.println(pieDouble);
	System.out.println(piefloat);
		
	//char = 'A'(ĳ���� �ѱ��ڸ� ǥ��)
	//char �ڷ����� ���� alphabeta = 'A'�����ϰ�
	//char �ڷ����� ���� alphabeta = 'B �����ϰ�
	//���) A=65 B=66
	int alphabetA = 'A';//==65
	int alphabetB = 'B';
    char alphabetC = 'C';
    char alphabetD = 'D';
    
    System.out.println (alphabetA);
    System.out.println (alphabetB);
    
    System.out.println (alphabetC);
    System.out.println (alphabetD);
    
    //�⺻ ���� BOOLEAN = 1byte = true/false
    //�л�(=student)�̶�� �����̸��� ������� boolean���� �����ϰ�
    //����ҋ� �л��� �´�(=true/false)��� ������ ��������
    //�ڷ��� �����̸� = ��;
    //sysstem.out.println();
    boolean student = true;
    System.out.println(student);
    
    //�ڵ� �� ��ȯ
    //1.char-> short->int->long
    //2.����->�Ҽ�
    //int�� num1 �����Ѵ� 14�� ���� �����ϼ���
    //double num2 �����ϰ� num1 �����ϼ���.
    //num2 ������ ����Ʈ ����.
    
    int num1 = 14;
    double num2 = num1;
    System.out.println(num2);
    
    //���� �� ��ȯ
    
    int num3 = 10; 
    byte num4 =(byte) num3;
	System.out .println(num4);// �ս��� ����. ���ǹ��� 27-1 = 127	
	
	int num5 = 1000;
	byte num6 = (byte)num5; //8bit = 2_7 = 128-1 =127
	System.out.println(num6); // �ս��� �ִ�. �ڷ����� �ش��ϴ�byte
	
	//�Է� �ޱ� : new scanner (System.in);
	
	//Scanner ��ü ����
	Scanner input = new Scanner(System.in);
 
	//�Է� �ޱ� ( �ڷ������� ������ = input.�ش� �ڷ� �Լ�)
	// �̸� �ּ� ���� ü���� ��ĭ���� �����ؼ� �Է¹ް� ����ϱ�	
	//System.out.println(�̸� �ּ� ���� ü���� ��ĭ���� �����ؼ� �Է¹ް� ����ϱ�)
	//�̸� �ּ� = string
	//���� = int
	//ü�� = double
	String name, address;
	int age;
	double weight;
	
	name = input.next(); // �̸�
	address = input.next(); //�ּ�
	age = input.nextInt();
	weight = input. nextDouble();
	
	System.out.println("����� �̸�:"+name+"�Դϴ�.");
	System.out.println("����� �ּ�:"+address+"�Դϴ�.");
	System.out.println("����� ����:"+age+"�Դϴ�.");
	System.out.println("����� ü��:"+weight+"�Դϴ�.");
	
	
	}}
	
	