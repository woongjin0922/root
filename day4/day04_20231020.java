package day4;
import java.util.Scanner;
public class day04_20231020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//if��
		//score ������ ���� 60�� �ְ�
		//score ������ 60���� ũ�ų� ���� ��� �հ��Դϴ�.���
		int score = 60;
	    if(score >= 60) {
		    System.out.println("�հ� �Դϴ�.");
	    }
		    //��ĳ���̿�: input
		    //���̸� �Է��ϼ����� ����ϰ� �Է��մϴ�.
		    //���̰� 19���� Ŭ���� �����Դϴٶ�� ����غ�����.
	    
	    //System.out.println("���̸� �Է��ϼ���");
	    //Scanner scanner = new Scanner (System.in);
	    
	    //int age = scanner. nextInt (); //�Է°��� ������ �޴´�.
	    //if(age>19) {
	    	System.out.println("�����Դϴ�. �����ϼ���");
	       
	    
	    //2) if-else : ���ǽĿ� ���� ������ �����ؾ��ϴ� ��ɹ��̴�.
	    //number ������ �����ϰ� 5�� �����Ѵ�.
	    //5�� 4���� Ŭ��� ũ�ٶ�� ������ְ� �ƴҰ�� �۴ٶ�� ����Ѵ�.
	    int number = 3;
	    if(number>4) {
	    	System.out.println("5�� 4���� ũ��.");
	    }else {
	    	System.out.println("5�� 4���� �۴�.");
	   
	    	//a��b�� ���ؼ� ū���ϰ�� max�ȿ� ������ �����Ѵ�.
	    	//�������� �ƽ��� ���� ���ִ� ������ max �ִ밪�� ����Ѵ�.
	    	//if-else ó���ؼ� ����� ������.
	    	
	    	int a =4;
	    	int b = 10;
	    	int max =0;
	    	
	    	//������ a>b�� ������ ��Ƽ� ���ǹ����� �����.
	    	if(a>b) {
	    	max = a;
	     	}else{ 
	    	max = b;
	    	}
	    	
	    	System.out.println("a:"+a+"�� b :"+b+"�߿��� ū ���� "+max+"�Դϴ�.");
	    	
	    	//else-if : ���ǽ��� ������ ������ ����Ѵ�.
	    	//����1: �����ϴ� �����Ѵ�. =������ �ִ´�.
	    	//   1)�����ϴ� ���ڰ� 5���� Ŭ���� "�����ϴ� ���ڰ� 5���� Ů�ϴ�."
	    	//   2)�����ϴ� ���ڰ� 7�ϰ�쿡�� " �����ϴ� ���ڴ� 7�Դϴ�." ��� �������
	    	
	    	int fav = 7; //7�� ������ �ִ´�
	    	
	    	if(fav>5) {
	    		System.out.println("�����ϴ� ���ڰ� 7���� Ů�ϴ�");
	    	}else if (fav==7) {
	    		System.out.println("�����ϴ� ���ڴ� �Դϴ�.");
	    	}else {
	    		System.out.println("�����ϴ� ���ڴ� 5���� �۽��ϴ�");
	    	}
	    	
	    	//����2 : ������ �Է��Ѵ�.
	    	//90���� ũ�ų� ������ = "A" ����Ѵ�.
	    	//80���� ũ�ų� ������ = "B" ����Ѵ�
	    	//70���� ũ�ų� ������ = "C" ����Ѵ�.
	    	//�������� = "D" ����Ѵ�.
	    	//Scanner input = new Scanner (System.in);
	    	//int score_= input. nextInt(); //������ �Է¹޴´�.
	    	//if-elseif ����ؼ� ������ ����غ���.
	    	 
	    	if(score>=90) {
	    		System.out.println("A����");
	    	}else if(score>=80) {
	    		System.out.println("B����");
	    	}else if(score>=70) {
	    		System.out.println("C����");
	    	}else {
	    		System.out.println("D����");
	    		
	    	}
	    	
	    	//@swtich�� : if���� �Ǵ�(true/flase)�� ���๮�� �����Ǿ��ٸ�
	    	//swtich ���� ������ ���� ���� ���๮�� �����ȴ�.
	    	//��°�� : number 7�Դϴ�. �������
	    	//case 1 : number 1�Դϴ�/ case 7 : number 7�Դϴ� / default : �Ѵ� �ƴϴ�=break 
	    	
	    	
	    	int result =7;
	    	
	    	switch(result) {
	    	case 1:
	    		System.out.println("number 1�Դϴ�");
	    		break;
	    	case 2: 
	    		System.out.println("number 7�Դϴ�");
	    		break;
	        default :
	        	System.out.println(" �Ѵ� �ƴϴ�");
	        	
	        	
	        	//����2 : ���� �Է��ϰ� ������ �������
	        	//case 3������ 11�������� ���� ������ ������.
	        	//�� �������� "������ ������ 000�Դϴ�."
	        	
	        	
	        	int month =3;
	        	
	        	switch(month) {
	        	case 3 :
	        	case 4 : 
	        	case 5 :
	        		System.out.println("������ ������ ���Դϴ�");
	        	break;
	        	case 6:
	        	case 7 :
	        	case 8 :
	        		System.out.println("������ ������ �����Դϴ�");
	        	break;
	        	case 9 : 
	        	case 10 :
	        	case 11 :
	        		System.out.println("������ ������ �����Դϴ�");
	        	break;
	        	case 12 :
	        	case 1 :
	        	case 2 :
	        	default :
	        		System.out.println("������ ������ �ܿ��Դϴ�");
	        		
	        		
	            //����3 : ��ĭ�� �ڵ带 switch������ ��������
	        		
	        		int a_ = 25;
	        		int b_ = 10;
	        		
	        		switch(a_/10) {//a_/10 = 2.5
	        		
	        	case 2:
	        	System.out.println("a�� 20 �̻��� �����Դϴ�");
	        		}
	        	
	        	
	        	}
	        	
	        	
	        	
	        	
	    		
	    	}
 	    		
	    	
	    	
	    	
	    	}
	    	
	    	
	    }
	    
		

		
	}

