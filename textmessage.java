package day17;

public class textmessage {
//메세지를 식별하는 번호
	private int megNumber; //번호
	private String msg; //메세지 내용
	
	public textmessage(int megNumber, String msg) {
		this.megNumber = megNumber;
		this.msg = msg;
		
		}
	//메소드를 활용해서 private 접근제한자를 꺼내는 메서드
	   public int getMsgNumber() {
	      return megNumber;
	   }
	   
	   public String getMsg() {
	      return msg;
	   }
	   public int hashCode() {
	      return megNumber;
	   }
	   
	   //equals : 몸통비교 == 동등비교(주소==주소) || equals()
	   //내용을 식별할수 있는 메소드 재정의해서 만든다
	   //@Override
	   @Override
	   
	   public boolean equals(Object obj) {
	      if(obj instanceof textmessage) {
	         textmessage cmp = (textmessage) obj;
	         
	         if(this.msg.equals(cmp.getMsg())) {
	            return true;
	         }
	         else {
	            return false;
	         }
	      }
	      return false;
	   }
}
	   
	
