package day17;

import java.util.HashSet;
import java.util.Set;

public class HashSetExaple {

	public static void main(String[] args) {
		// TDO Auto-generated method stub
		Set<textmessage> msgset = new HashSet<>();
		//TextMessage 생성 ->인스턴스 -> 클래스의 공간을 HashSet (중복을 체크한다)
		textmessage msg1 = new textmessage(1001,"안녕하세요");
		textmessage msg2 = new textmessage(1001,"안녕하세요"); 
		textmessage msg3 = new textmessage(1001,"안녕하세요");
		textmessage msg4 = new textmessage(1002,"안녕하세요");
		textmessage msg5 = new textmessage(1003,"안녕");
		
		//Set 추가 : 인스턴스화 시킨 객체를 따로 추가해서 Set 자료구조 각각 저장해본다
		msgset.add(msg1);
		msgset.add(msg2);
		msgset.add(msg3);
		msgset.add(msg4);
		msgset.add(msg5);
		
		//저장된 크기 확인 : Set 자료구조 길이를 알기위해서 메소드 : size()
		System.out.println("사이즈:"+msgset.size());
		
		//출력 : for 문 이용해서 자료구조를 탐색해서 출력해보자.Foreach -> 배열이나 구조화된 공간에 값을 한꺼번에 정의해서 꺼낼수있다)
		for(textmessage msg : msgset) {
	         System.out.println("번호 : " + msg.getMsgNumber() +  ", 메세지 : " + msg.getMsg());
	      }
		
		//데이터 삭제 
		msgset.remove(msg5);
		System.out.println("사이즈:"+msgset.size());
	   
		
		//출력
	}

}
