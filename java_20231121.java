package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class java_20231121 {

	//static method
	public static void method1(Scanner scan) throws InputMismatchException { //숫자만 가능
		System.out.println("1.사람과 어울리는 것이 좋다. 2.혼자 있는것이 좋다");
		System.out.println("선택>>");
		int check = scan.nextInt();
		
	}
	   public static void method2() throws Exception{
	      method3();
	}
	   public static void method3() throws Exception{
	      
	}
	
	public static void main(String[] args) {
		/*
		try {
		Exception e = new Exception("고의 발생");
		throw e;
		}catch (Exception e) {
			System.out.println("에러 메세지:"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었습니다");
		*/
		
		//Scanner 문항을 주고 어떤 사람인지 번호를 선택하게 한다
		
		Scanner scan = new Scanner(System.in);
		
		//성격 유형검사를 시작합니다라는 멘트를 주고 검사를 시작한다
		System.out.println("성격 유형 검사를 시작 합니다");
		
		//static 메서드를 활용해서 지문에 대한 문항을 검사하는 메서드를 만든다
		java_20231121.method1(scan); // scan에 오류를 static 메서드에 던질수 있게 매개변수로 만들어준다
		
	}
}
