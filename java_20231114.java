package day12;

public class java_20231114 {

	public static void main(String[] args) {
		/*
	    Speaker s1 = new RedSpeaker();
	    Person p1 = new Person(s1);
	    p1.turnOn();
	      
	    Speaker s2 = new BlueSpeaker();
	    Person p2 = new Person(s2);
	    p2.turnOn();
		*/
		
		
		////마이크폰
		//스피커
		//블루투스 마이크
		
		
		
		//클래스 unit2 : 추상클래스 abstract 메서드+
		//클래스 Fighter : extends Unit2 (추상클래스) implemets Fightable
		/*
		Fighter f = new Fighter(); //의존하는 클래스를 객체로 생성
		f.move(100,200);
		
		Unit2 f2 = new Fighter();
		//f2.attack(); 사용할수없다 .형변환이 다르다
		Fightable f3 = new Fighter();
		f3.attack(new Fighter());
		//f3.x; 자식 클래스로 생성했지만 인터페이스 형변환만 사용하니깐
		
		Fightable nf = f.getFightable(); // 자식 클래스 메서드 부모인터페이스 형변환 리턴 출력
		*/
		
		//your code goes here
		//자식 클래스 객체 생성 BlutootMIC
		//객체가 생성되면 음악이 나온다
		//객체가 생성되면 노래를 부른다
		/*
		BlutootMIC b = new BlutootMIC();
		b.music();
		b.sing();
		*/
		
		TJmic t = new TJmic();
		t.connect();
		t.music();
		t.sing();
	   }

}
    ////마이크폰
    interface Microphone {
    	abstract void sing();
    }
	//스피커
    	interface Speaker {
    		abstract void music();
    	}
	//블루투스 마이크
    	interface BluetoothMic extends Microphone, Speaker {
    		abstract void connect();
    	}
    	
    	class TJmic implements BluetoothMic {
    		public void sing() {
    			System.out.println("마이크에 대고 노래를 부른다");
    		}
    		public void music() {
    			System.out.println("마이크에 장착된 스피커로 반주가 나온다");
    		}
    		public void connect() {
    			System.out.println("블루투스 장치가 연결되었습니다");
    		}
    	}
    	
      class BlutootMIC implements Microphone,Speaker { //다중 인터페이스
    	  
    	  public void sing() {
    		  System.out.println("마이크에 대고 노래를 부릅니다.");
    	  }
    	  public void music() {
    		  System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
    	  }
      }




abstract class Unit2 {
	int x,y;
	abstract void move (int x,int y); // 추상 메서드
	void stop() { System.out.println("멈춥니다");
	}
}
//클래스 interface : Fightable
interface Fightable { 
	public void move(int x,int y); //move 추상메서드
	public void attack(Fightable f); // attact 추상메서드
	
}

//클래스 Fighter : extends Unit2 (추상클래스) implemets Fightable
class Fighter extends Unit2 implements Fightable {
	public void move (int x,int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	//인터페이스 리턴 : 형변환으로 가능하다
	//Fightable f = new Fighter();
	Fightable getFightable() {
		//자식이 함나리 구현한다.
		Fighter  f = new Fighter ();
		return f;
	}
}





class Person {
	   Speaker speaker;
	   Person(Speaker speaker){
	      this.speaker = speaker;
	   }
	   
	   void turnOn() {
	      System.out.println(speaker.getName() + " is turned on.");
	   }
	}

	class Speaker {
	   String speaker;
	   Speaker(){
	      
	   }
	   Speaker(String speaker){
	      this.speaker = speaker;
	   }
	   String getName() {
	      return speaker;
	   }
	}

	class RedSpeaker extends Speaker{

	   public String getName() {
	      return "Red Speaker";
	   }
	   
	   RedSpeaker(){
	      
	   }
	   RedSpeaker(String speaker) {
	      super(speaker);
	      // TODO Auto-generated constructor stub
	   }   
	}

	class BlueSpeaker extends Speaker{
	   
	   public String getName() {
	      return "Blue Speaker";
	   }
	   
	   BlueSpeaker(){
		         
	   }
	   BlueSpeaker(String speaker) {
	      super(speaker);
	      // TODO Auto-generated constructor stub
	   }

}