package day3;

public class java_20031019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		//���׿�����_��ȣ������
		//x��� ������ 100�̰� ���� �ϳ��� ����� �������
		
		int x = 100;
		int result_plus = +x;
		int result_minus = -x;

		System.out.println(result_plus);
		System.out.println(result_minus);
		
		//���׿�����_����������(- -/++)
		//��������ڸ� �����ϰ� ó���Ҷ� ����Ѵ�.
		//������������ : num++;
		//�������Ŀ��� : ++num;
		//��°�� : 10 / 11 
		int num =10;
		System.out.println(num++);
		System.out.println(num);
		
		//���� int�� x��� ������ �����մϴ�. -> 1;
		//��� ��� : 
		//1(�����Ѽ�����)
		//2
		//3(�������Ŀ���)
		int y = 1; //������ �����Ұ��� ��Ƴ���.
		System.out.println(y++);
		System.out.println(y);
		System.out.println(++y);
		
	    //�ƽ�Ű�ڵ� 'A' = 65 / 'B' = 66
		char alphabet = 'x';
		//������ : ���������ڸ� �ѹ� ����ؼ� x y
		//x ��� : ������ ������
		System.out.println(alphabet); //y
		//y ���
		System.out.println(++alphabet);
		//���׿����� (�ǿ�����+�ǿ�����)
		//��������� : ����+����-> ó���� ��� (+ * / % -)
		int num_x = 100;
		int num_y = 200;
		//��� ��� : 300
		System.out.println(num_x+num_y);
		//��� ��� : 20000
		System.out.println(num_x*num_y);
		//��� ��� : 0
		System.out.println(num_x/num_y); //100/200 ->0.5
		//��� ��� : 100
		System.out.println(num_x%num_y); // (100/200)% = 100 ������ X
		
		//2)���׿�����_���մ��Կ����� y = y + 1
		
		int numbery = 5; 
		//numbery = numbery + 1;
		//numbery += 1;
		//numbery = numbery * 2; //10
		//numbery *= 2; //10
		//numbery = numbery - 2; //3
		//numbery -= 2; //3
		
		//���迬���� : ũ�� / �۴� / ���� / ���ų��۴� / ���ų� ũ��
		//������� �븮���� �Ǵ��̴�.(true/false)
		int a = 10;
		int b = 20;
		//a�� b���� ũ��
		System.out.println(a>b);
		//a�� b���� �۰ų� ����
		System.out.println(a<=b);
		//a�� b�� ����.
		System.out.println(a==b);
		//a�� b�� ���� �ʴ�
		System.out.println(a!=b);
		
		//4)���׿�����_�������� (��Ʈ������)
		//1.(&&,&)AND= ���� = A(1) && B(1) : true
	    //2.(�Ӥ�,��) OR= ���� = A(1) && B(0) : true
		//3.(^) XOR =��Ÿ�� ���� =  A(1) ^ B(1) : true
		//4.(!)NOT = NOT(����) = ~A(0) = 1 : true
		
		//boolean : 1byte : 8bit ���ǥ�� " true(1)/false(0)
		boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
		
		System.out.println("###����(AND): �Ѵ� TRUE=1###");
		//false (0==0/1==0/0==1) b1�� b2�� �̿��ؼ� false
		System.out.println(b1 && b2);
		//true (1==1)
		System.out.println(b1 && b3);
		//false (0==0/1==0/0==1) b2�� b4�� �̿��ؼ� false
		System.out.println (b2 && b4);
	 
		System.out.println("###����(AND): �Ѵ� TRUE=1###");
		//true
		System.out.println(b1||b4); // true(1) || false (0) = 1(true)
		//true
		System.out.println(b1||b3); // true(1) || true (1) = 1 (true)
		//false
		System.out.println(b2||b4); //false(0) || false (0) = 0(false)
		
		System.out.println("###��Ÿ�� ����(XOR): �ٸ��� true(1)/ ������ false(0###");
		//true (b1:true, b2false, b3true, b4false)
		System.out.println(b1^b2);
		//false
		System.out.println(b2^b4);
		
		//4)���׿�����_������������(NOT)
		System.out.println("������������(NOT");
		boolean not_=false;
		System.out.println(!not_);
		
		//3.���� ������:�ǿ����ڰ� 3���� ���� ������̴�.
		//���ǽ�(�ǿ���1)? �� (�ǿ���2):����(�ǿ�����3)
		int number = (7>1)?1:2;
		System.out.println( number);
	}

}
