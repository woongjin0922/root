package day11;

public class java_20231109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스의 강제 타입 변환
		
		//자식 클래스 < 부모 클래스 : 자동형변환 -> 부모를 맞추보니 손실난다
		FireEngine f = new FireEngine(); // 자식 객체
		Car c = new Car();
		Car c2 = f;
		Car c_ = null; //부모형타입 객체는 생성하지 않았다.
		
		c_=f; //부모의 형 타입이고 자식의 객체를 생성한 경우
		f = (FireEngine)c_; //자식의 객체로 형변환 
		f.drive();
		f.water();
		
		//@매개변수(함수:클래스)->객체를 생성 할떄
		buyer b = new buyer(); // 바이어 객체 생성
		//제품의 객체를 생성해서 객체를 넘겨준다.
		Audio a = new Audio(100);
		computer com = new computer(200);
		Tv tv = new Tv(100);
		//바이어가 컴퓨터를 산다.
		b.buy(com);
		//바이어가 티비를 산다.
		b.buy(tv);
		//바이어의 현재 남은돈을 출력한다.
		
		
		//추상클래스 : abstract
		//레시피 추상클래스
		//Receipt cp = new Receipt("백종원"); // 오류남 ??? 추상클래스는 미완성이라서 객체허용
		//파스타 레시피 (자손)
		PastaReceipt pr = new PastaReceipt ("백종원"); //추상클래스를 의존하는 자식 클래스 객체생성
		pr.info();//자식 객체를 통해서 추상 클래스의 인슽천스메서드도 호출할수있다
		pr.makeSource(); //자식 객체의 인스턴스 메서드도 호출한다
		pr.cookingPlay(); //자식 객체에서 추상 메서드도 호출된다 (인스턴스 메서드랑 다르게 추상메서드는 강제로 오버라이딩한다=구현부를 작성)
		
		//추상클래스 문제2: 플레이어를 활용한 추상클래스
		//Player p = new Player();
		AudioPlayer p = new AudioPlayer();
		p.play(10); //재생한다.
		p.stop();//멈춘다.
		
		
	}

}
//추상클래스 : player
abstract class Player{
      //추상메서드 : 플레이버튼
	  abstract void play(int pos); //pos:track
	  //추상메서드 : 정지버튼
	  abstract void stop();
}	
//플레이 : play()/스탑:stop()
//자식클래스 : AudioPlayer
class AudioPlayer extends Player {

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		System.out.println(pos+"위치부터 실행합니다.");
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("재생을 멈춥니다.");
	}
	
}
//오버라이딩해서 구체적인 오디오 플레이를 설계한다.

class PastaReceipt extends Receipt{

	PastaReceipt(String chef) {
		super(chef);
		// TODO Auto-generated constructor stub
	}
        void makeSource() {
		System.out.println("파스타 소스를 직접 만든다.");
	}
		@Override
		void cookingPlay() {
			// TODO Auto-generated method stub
	    System.out.println("파스타 요리를 진행합니다");
	    
			
		}
}



abstract class Receipt { //추상클래스 선언
	
	String chef; //셰프를 인스턴스변수(멤버필드)
	
	//기본생성자
	Receipt(String chef) {
		this.chef =chef;
	}
	abstract void cookingPlay();
	
	void info() { //인스턴스메서드
		System.out.println("이레시피는"+ chef + "셰프님의 레시피입니다.");
	}
}
//제품 클래스 정의 (설계도)
//product : 제품
class product {
	int price; // 가격
	int bonusPoint;
	//기본 생성자
	product (int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}
//Tv : 제품들1
class Tv extends product {
	
	Tv(int price) {
		super(100);
		//TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Tv";
	}
}
//computer : 제품들2
class computer extends product {
	
	computer(int price) {
		super(200);
		//TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Computer";
	}
	
}
//Audio : 제품들3
class Audio extends product {
	Audio (int price) {
		super(100);
		//TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Audio";
	}
}
//Nintendo : 제품들4
class Nintendo extends product {
	Nintendo (int price) {
		super(50);
		//TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Nintendo";
	}
}
//고객 : buyer : 고객의 잔고를 게산 : money = 1000만원 - 매개변수다형성(제품)
//고객의 잔고 : 적을 경우 (money<price: 잔액이 부족해서 판매할수없다) 
//         많을 경우(제품을 구매할꺼야!)
class buyer{ // 물건을 사는 클래스 : 행위메서드
	int money = 1000; //고객의 잔고
	int bonusPoint = 0; //보너스 포인트
	//행위 : 물건을 산다
	void buy(product p) {
		
		if(money<p.price) {
			System.out.println("잔액이 부족해서 구매할수없습니다.");
		}else {
			money -=p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p.toString()+" 구매 완료했습니다.");
			System.out.println(money +"만 원 남았습니다.");
			System.out.println("포인트 " + bonusPoint + "점 적입되었습니다.");
			
		}
		// p.price; // 고객이 사야할 제품의 가격
		// p.bonusPoint; // 고객의 보너스 점수
		
	}
}


class Car { //부모 클래스
	String color;
	int door;
	void drive () {
		System.out.println("드라이브 중입니다..");
		
	}
}

//자식 클래스 : 소방차
class FireEngine extends Car {
	void water () {
		System.out.println ("water");
	}
}

//자식 클래스 : 앰뷸런스
class Ambulance extends Car {
	
}
