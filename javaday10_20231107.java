package day10_20231107;

public class javaday10_20231107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 오버라이딩 : 부모와 자식에세 있는 메서드이다
		// 자식은 부모와 다르게 메서드를 구현해서 새로운 방법으로 사욯한다
		
		//삼송 컴퓨터 객체생성 = 오버라이딩
		Samsong s = new Samsong();
		s.powerOn();
		s.powerOff();
		//컴퓨터 객체생성 = 오버라이딩 X
		//Computer_c = new Computer_();
		s.powerOn();
		s.powerOff();
	    //c.comname;
		System.out.println("컴퓨터 이름은 :"+s.comname);
		
		//내부 패키지 (같은폴더)
		//Mouse_m = new Mouse_();
		//다른 패키지가 포함될경우는 접근이 제한된다
		//Mouse m2 = new Mouse ();
		//m2.getName();
		
		//final 클래스와 메서드
		Comic co = new Comic("주머니 괴물","마상",true);
		co.info_title();
		co.info_author();
		co.info_Color();
		
		//@다향성 : 다양한 형태로 변화된다는것이다. (상속: 조상에게 자식이 형타입을 맞춘다)
		DeskCalender dc = new DeskCalender ("보라색",6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();//한줄뛰기 !!
		Calender dc2 = new DeskCalender ("보라색",6);
		dc2.info();
		dc2.hanging();
		//dc2.onDesk(); //오류 : 부모의 자료형은 없다@
		
		Car c1 = new SchoolBus();
		
		Bus b1 = new Bus(); //자동 형변환 가능
		Bus b2 = new SchoolBus(); //자동 형 변환 가능
		
		Car c2 = new OpenCar(); //자동 형 변환
		OpenCar oc = new sportCar(); //자동 형 변환
		//Bus b3 = new OpenCar();// 자동 현변환 가능 하지 않다
		OpenCar b4 = new sportCar(); //자동 형 변환 가능 하지 않다.
		
		//조상이 같더라도 부모가 다르면 자동형 변환이 불가능하다
	}

}
//부모클래스 : Book

//클래스 1
class Car {}
class Bus extends Car {}
class SchoolBus extends Bus {}
//클래스 2
class OpenCar extends Car {}
class sportCar extends OpenCar {}




//부모 클래스 : Calender (달력)
class Calender {
	String color;
	int months;
	Calender (String color,int months) {
		this.color = color;
		this.months = months;
	}
	
	void info() { //달력의 정보
		System.out.println(color+"달력은" + months + "월까지 있습니다");
		}
	
	void hanging() { //벽걸이 여부 정보
		System.out.println ( color+"달력은 벽에 걸수 있습니다.");
	}
}
//자식 클래스 : DeskCalender ( 책상에 올려놓는 달력)
class DeskCalender extends Calender {
	
	DeskCalender(String color, int months) {
		super(color,months);
		//TODO Auto-generated constructor stub
	}
	
	@Override
	void hanging () {
		System.out.println(color+"달력을 벽에 걸기 위해 고리가 추가로 필요합니다");		
	}
	
	void onTheDesk() {
		System.out.println(color+" 달력은 책상에 세울수 있습니다");
	}
}


class Book {
	String title;
	String author;
	
	//기본 생성자 : 객체 생성시 초기화
	Book (String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//final 메서드 만든다
	final void info_title() {
		System.out.println("책의 제목은" + title + "입니다");
	}
	
	//멤버 메서드 : 객체생성될떄 사용하는 메서드 (힙영역)
	void info_author() {
		System.out.println("책은 저자는"+author+"입니다");
	}
}

//자식클래스 : Comic
class Comic extends Book {
	boolean isColor;
	Comic (String title, String author, boolean isColor) {
		super(title,author); //부모생성자
		//TODO Auto-generated constructor stub
		this.isColor = isColor; // 색깔구분
	}
	//@Override
	//파이널 메서드 오버라이딩
	//void info_title() {

	//System.out.println("책의 제목은" + title + "입니다");
	//에러코드 없음
	void info_author() {
		System.out.println("이 마화책은 저자는" + author + "입니다");
	}

	void info_Color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러야");
		}else {
			System.out.println("이 만화책은 흑백이야");
			
		}
	}

}


//클래스 1 : 컴퓨터
class Computer_{
	private String comname;
	void powerOn_() {
		System.out.println ("삑삑삑 컴퓨터가 켜졌습니다");
	}
	
	void powerOn() {
		System.out.println ("삑삑삑 컴퓨터가 켜졌습니다");
	}
	
	void powerOff() {
		System.out.println ("삑삑삑 컴퓨터가 꺼졌습니다");
	}
}
//클래스 2 : 삼송
class Samsong extends Computer_ {
	public String comname;
	@Override
	void powerOn() {
		System.out.println ("아이러브 삼송"+"삑삑삑 컴퓨터가 꺼졌습니다");
	}
}