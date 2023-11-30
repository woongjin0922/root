package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SubStream_ {

	public static void main(String[] args) {
	      
	      FileInputStream fis = null;
	      BufferedInputStream bis = null;
	      
	      FileOutputStream fos = null;
	      BufferedOutputStream bos = null;
	      
	      System.out.println("보조 스트림 시작");
	      
	      try {
	         fis = new FileInputStream("src/day18/a.jpg");//파일의 위치에서 스트림을 시작한다라는경로를 만든다 (기반)	       
	         fos = new FileOutputStream("src/day18/a_sub.jpg");// 파일의 위치에서 스트림을 시작한다라는 경로를 만든다 (기반)
	         
	         bis = new BufferedInputStream(fis);
	         bos = new BufferedOutputStream(fos);
	         
	         while(bis.read()!=-1) {
	        	 bos.write(bis.read());
	        	 
	         }
	         
	      } catch (Exception e) {
	         
	      }
	   }

}
