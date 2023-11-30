package day18;

import java.io.File;

public class File_class_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("src/day18/a.jpg");//파일을 긁어온다
		
		if(f.exists()) { //파일이 존재하는지 확인
			
			System.out.println("length>>>"+f.length());
			System.out.println("Can Read?>>>"+ f.canRead());
			System.out.println("getName:"+f.getName());
			System.out.println("getParent:"+f.getParent());
			System.out.println("getPath:"+f.getPath());
		}
	}

}
