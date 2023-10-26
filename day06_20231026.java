package day6;
import java.util.*;
public class day06_20231026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3-6번 문제
		int fahrenheit = 100;
		
		float celcius = (int)((5/9f*(fahrenheit-32))*100+0.5)/100f;
		System.out.println ("Fahrenheit :"+fahrenheit);
		System.out.println("Celcius:"+celcius);

		//4-1번 문제
		//if문을 사용하기전에 관계연산으로 기초적인 조건식
		//1.int형 변수 x가 10보다 크고 20보다 작을때 true
		
		int x =15;
		System.out.println(10<x && 20>x);
		//2.char형 변수 ch가 공백이나 탭이 아닐떄 true
		
		char ch = '3';
		System.out.println(!(ch == ' '|| ch=='\t') );
		
		System.out.println('0' <= ch && ch <= '9');
		
		char ch1 = 'a';
		//||(or)연산자 = 논리곱연산자 = 둘중의 하나면 진짜면 진짜
		//대문자 또는 소문자를 포함하면된다(영문자)
		System.out.println (('a'<= ch1 && 'z'>=ch1) ||  ('A'<= ch1 && 'Z'>=ch1)  );
		
		
		//int형 변수 year(년도)가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고
		//100으로는 나눠 떨어지지 않을떄
		int year = 2023;
		System.out.println((year%400==0)||(year%4==0&&year%100!=0));
		
		//문자열 참조변수 str이 "yes" 일때 true 조건식
		String str = new String(); 
		//str.equals("yes");
		//"yes". equals(str);
		System.out.println(str.equals("yes"));
		
		//문제 4-2 1부터 20까지 정수 중에서 2또는 3의 배수가 아닌 수의 총합
		
		int sum = 0; //총합
		for(int i=1; i<=20; i++) {
			//i가 2또는 3의 배수가 아닐때만 sum ++ (1씩증가)
			if(i%2==0 ||i%3!=0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		//문제4-3 1+(1+2)+(1+2+3)+(1+2+3+4)............+(1+2+3+....+10);             
		//sum = 1+2+3+4+5+6+7+8+9+10 + sum합계
		
		int sum_ = 0;
		int total_ =0;
		for(int i=1; i<=10; i++) {
		
		sum_+= i;
		total_ += sum;
		
		System.out.println("total_sum="+total_);
		
		//문제5) 1+(-2)=3+(-4)+5+(-6)... 이상이 될떄 멈추는거!
		//100보다 같거나 크면 반복문이 빠져 나간다.
		// for 문으로 증감식으로 바꿔서 부호 (+) (-)
		//반복문의 증감식 단항연산자를 이용해서 부호를 바꿔줈거야 !!
		//증감식+1 =-1 증감식-1=1
		int s= 1;
		int sum5 = 0;
		int num = 0;
		for(int k=1; true; k++, s=-s) { //1, -1, -(-1),-1,-(-1)=1
			
			num = s*k; //부호
			sum += num;
			
			if(sum>=100) {
				break;
			}
			
			
		}
		
		System.out.println("num="+num); //부호비트로 더해진 숫자
		System.out.println("sum="+sum); //합계를 출력
		
		//문제4-7 숫자로 이루워진 문자열 str "12345" fullname = 1+2+3+4+5
		//15라고 출력하자
		String str7 = "12345";
		
		System.out.println(str7.length());
		int sum7 = 0;
		for(int k=0;k<str7.length();k++) {
			sum7 += str7.charAt(k)-'0'; //문자 객체 '0'을 뺴줘야 숫자로 바꿀수있다
		}	
	    System.out.println("sum="+sum7);
	    
	    //while문제1
	    // I can do it을 다섯번 출력하자 (초기값을 0으로 하고 만들자)
	    // I can do it.
	    // I can do it.
	    // I can do it.
	    // I can do it.
	    // I can do it.
	    
	    int k = 0;//외부 초기화
	    while(k<5) {
	    	 System.out.println("I can do it");
	    	k++;//내부 증가
		}
	    
	    //while문제2.1부터 몇까지 더해야 100을 넘지 않을까?
	    //1.더해진수를 조건으로 만든다
	    //2.더해진수 100이랑 비교해서 100이상이 되는지 확인하고 맞으면 out(false)
	    
	    int sum2 =0;
	    int p = 0;
	    while(sum2<=100) { 
	    	 System.out.println(p+"-"+sum2);
	    	sum2 += ++p;
	    }
	    
	    //do-while 문제1
	    //1과 100사이에 정수를 입력하고 정답을 알아내는 게임
	    //업앤다운 게임을 만들자
	    //업앤다운 : 숫자는 랜덤으로 만들고 숫자를 알아내는게임
	    //1.랜덤으로 숫자를 랜덤함수가 들어간다.
	    //랜덤함수 : (int)(math.random() *100)+1 //1~100 사이의 임의의 수를 저장
	    /*
	    int answer = (int)( Math.random()*100)+1;
	    int input =0; //입력받을 숫자의 변수
	    System.out.println (answer);
	    //2.스캐너로 반복하면서 숫자가 맞을떄까지를 계속 입력한다.
	    Scanner scanner = new Scanner (System.in); //스캐너 선언
	    
	    do { 
	    	System.out.println ("1과 100사이의 정수를 입력하세요:");
	    	input = scanner.nextInt(); //입력받을 함수를 선언한다
		    //3.입력한 숫자가 랜덤보다 작으면 정갑은 크다라고 알려준다.
		    //4.입력한 숫자가 랜덤보다 크면 정갑은 작다라고 알려준다
		    if(input>answer) { //더 작은수를 적으라고 알려준다.
		    	System.out.println("더 작은수로 다시 시도해보세요");
		    }else if(input<answer) { //더 큰수를 적으라고 알려준다.
		    	System.out.println("더 큰수로 다시 시도해보세요");
		      }
	    	
	    } while(input!=answer);
		System.out.println("정답입니다.");
	   */
		//continue : 반복이 진행되는 동안 조건에 해당하는 부분에 넣어준다.- continue
		//문제1.1부터 10까지 반복문을 진행하는 출력을 한다.
		//3의 배수일때는 continue 실행
		//1 2 4 5 7 8 10 : 출력함수를 아래놓고 if 미리 처리해서 comtinue사용;
		
		for(int y=1; y<=10; y++) {
			if(y%3==0) {
				continue;
				
			}
			 System.out.println(y);
			
		}
		
		
		//break 문제1
		//1.while 조건을 사용하고 sum 합계가 100을 넘어가면 break;
		
		int sumz = 0;
		int z = 0;
		while(true) { //무한반복
			//if문으로 처리해서 break
			if(sumz>100) {
				break;
			}
		}
		++z; //증감함수를 사용자가 만들어서 증가시킨다
		sumz += z;
		}
		 System.out.println("z="+x);
		 System.out.println("sumz="+sum);
		//결과
		//i=14 //몇번 반복을 실행했는지
		//sum = 105 //i를 더한 합계
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
