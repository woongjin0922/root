package day18;

import java.io.FileReader;
import java.io.Reader;

public class InputStreamReader_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reader -> InputStream/FileReader
		
		//파일을 읽어오는 변수다
		int read = 0;
	      Reader r = null;
	      char[] bf = new char[256];
	      //스트림 선언
	      
	      try {
	         r = new FileReader("src/day18/file_forea.txt"); //파일을 만든 경로를 찾아서 넣는다
	         while(true) {
	        	 //파일 읽기
	        	 read = r.read(bf);
	        	 //-1이면 종료
	        	 if(read == -1) {
	        		 break;
	        	 }
	        	 System.out.print(String.valueOf(bf, 0, read));
	         }
	      } catch (Exception e) {
	         
	      }
	}
}
