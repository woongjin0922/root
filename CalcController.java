package day20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController implements ActionListener { // 모든 페이지를 제어하는 연결한다 (/src/calc):mapping

	   CalcView cv; // 객체를 변수로 받는다 (객체변수선언)
	   
	   //생성자에 View에 해당하는 클래스를 인스턴스화 시켜서 --> view객체를 실행한다
	   CalcController() {
	      cv = new CalcView();
	      cv.bt.addActionListener(this); //버튼의 이벤트가 발생되었을때 알려준다
	   }
	   
	   public static void main(String[] args) {
	      
	      new CalcController();
	      
	   }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cv.bt) {
			int num1 = Integer.parseInt(cv.tf1.getText()); //텍스트1 값을 반환한다
			int num2 = Integer.parseInt(cv.tf2.getText()); //텍스트1 값을 반환한다
			
			CalcModel calc = new CalcModel();
			int result = calc.plus(num1,num2);
			cv.la.setText("결과는 >>> " + result);
		}
		
	}

}
