package day16;

public class stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    //String Ŭ����(java.lang) : charAt() �޼���
		//���ڿ��� �ϳ��� �ܾ� ������ ���
		
		String word = "1I2LOVE6YOU";
		String text = "";
		
		//length() : ���ڿ� ���̸� ��ȯ �ش� ���ڿ��� ���̸� ��ȯ�ϴ� �޼��带 ���ؼ� word:11���ڿ�)
		for(int i = 0; i < word.length(); i++) {
	         if(word.charAt(i) >= 65 && word.charAt(i) <= 90) {
	            text += word.charAt(i);
	        }
	        else {
	            text += " ";
	        }
	    }
		System.out.println(text);
		
		//indexOf()�޼��� : ���ڿ��� ���Ե� �ܾ� �Ǵ� ���ڿ��� ��ġ�� �˻�������
		//��ġ�� �ε��� ���� ��ȯ
		String strindex = "HelloWorld_MyWorld";
		
		//World ó�� �ε��� ��ȣ�� ��� ���۵Ǿ����� �˰�;��
		System.out.println(strindex.indexOf("World",10));
		
		//replaceAll(������,������ �ܾ�) : �������� ������ �ܾ�� ��� �ٲ��ش�
		String str = "�ڹ� ���α׷����� ������� �ڹٸ� ������ ��վ��";
	    String newstr = str.replaceAll("�ڹ�", "java"); 
	    
	    System.out.println(str);
	    System.out.println(newstr);
	    
	    //substring(�����ϴ� �ε��� , ������ �ε���) : ���ϴ� ��ġ�� ���ڿ��� �߶� ����ϴ� �޼����̴�
	    
	    String substr = "1234-5678";
	    String substr_=substr.substring(5);
	    System.out.println(substr_);
	    
	    String rangestr = substr.substring(0,4);
	    System.out.println(rangestr);
	    //split() : ���ڸ� �迭�� �����ؼ� �߶��ش�
	    String substr2 = "1234-5678";
	    String[] phone = substr2.split("-");

	    System.out.println(phone[0]);
	    System.out.println(phone[1]);
	    
	    //-StringBuffer / StringBuilder
	    StringBuilder buil_str = new StringBuilder("Hello");
	    buil_str.append("World");
	    System.out.println(buil_str);
	    
	    //���ڿ� ���� delete
	    buil_str.delete(0,5);
	    System.out.println(buil_str);
	    
	    //���ڿ� �߰� insert
	    buil_str.insert(0, "Hello");
	    
	    System.out.println(buil_str);
	    
	}

}
