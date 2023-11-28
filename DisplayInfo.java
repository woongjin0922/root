import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class DisplayInfo {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	  String strFn = "src/twograde.csv";
      
      try {
         Reader rd = new InputStreamReader(new FileInputStream(strFn), "euc-kr");
         BufferedReader br = new  BufferedReader (rd);
         try {
        	 String strTemp; //파일의 필드에 해당하는 부분을 분리하기 위해서 사용하는 변수
        	 int nLine = 0;
        	 while((strTemp = br.readLine())!=null) {
        		 nLine++; //라인의 개수를 증가해서 더해준다
        	 }
        	 
        	 //파일을 전체적으로 읽어서 데이터의 개수가 몇개인지를 파악한다
        	 System.out.println(nLine);
        	 br.close();
        	 rd.close();
        	 
        	 int nStudent = nLine-1; // 필드를 하나만 전체의 행의 정확한 개수를 만든다
        	 
        	 //GIS 배열 [ ] 객체를 학생수 만큼 생성한다
        	 GIS [] oneStudent = new GIS[nStudent];
			//Scanner 이용하여서 파일을 다시 읽어내면서 한줄단위를 (콤마)기준으로 열단위 필드를 배열로 생성한다.
        	 FileInputStream fin = new FileInputStream(strFn);
        	 Scanner scanner = new Scanner(fin); //파일을 스트림 단위로 입력받는 스캐너 정의
        	 
        	 strTemp = scanner.nextLine();//제목 부분을 그냥 읽고 지나가게 수정한다
        	 
        	 //구분자를 콤마(,)로 지정하고 한 줄 읽고 그 값을 저장할 배열을 선언한다
        	 String csvSplistBy = ",";
        	 String[] strLineArray; // 한줄을 콤마로 구분하고 배열로 분리하는 변수
        	 
        	 //파일을 다시 읽어 GIS 배열 객체 요소에 학과,학년,학번,성명,거주지역,이메일을 할당한다
        	 
        	 for(int i=0; i<28; i++) { 
        		 //스캐너를 넥스트 시킨다
        		 if(scanner.hasNextLine()) { // scanner된 행단위 값이 존재한다면
        			 
        			 //학과 학년 학번 성명 거주지역 이메일로 저장한다
        			 strTemp = scanner.nextLine();
        			 strLineArray = strTemp.split(csvSplistBy);
        			 
        			 String strDepartment = strLineArray[0]; //학과
        			 String nGrade = strLineArray[1]; // 학년
        			 String strId = strLineArray[2];//학번
        			 String strName = strLineArray[3];//이름
        			 String strAdd = strLineArray[4];//주소
        			 String strEmail = strLineArray[5];//이메일
        			 
        			 System.out.println(strDepartment);
                     System.out.println(nGrade);
                     System.out.println(strId);
                     System.out.println(strName);
                     System.out.println(strAdd);
                     System.out.println(strEmail);
                     
                     //객체배열에 담기
                     oneStudent[i] = new GIS(nGrade,strId,strName,strAdd,strEmail);
                     Object setDepartment;
					 
        		 }
        	 }
        	 
         } catch(Exception e) {
        	 
        	  
         }
         
         
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

}
