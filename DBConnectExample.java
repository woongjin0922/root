package dbconn;

import java.sql.*;
import java.util.Scanner;


public class DBConnectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbDriver = "org.mariadb.jdbc.Driver"; //디비 드라이버 설정
		String dbUrl = "jdbc:mariadb://localhost:23306:jdbc"; //디비URL
		String id = "root"; //계정이름
		String pw = "1234";
		Connection conn = null; //디비실행(CRUD)
		PreparedStatement ps = null;
		
		//Scanner 선언 : select Rows()
		Scanner sc = new Scanner (System.in);
		
		try {
	         Class.forName(dbDriver);
	         conn = DriverManager.getConnection(dbUrl,id,pw);//디비연결
	         
	         if(conn !=null) {
	        	 System.out.println("DB 연결 완료");
	        	 
	        	 //SQL 문법 작성
	        	 String query = "select *from jdbc.student_info";
	        	 
	        	 //데이터 문서 객체를 만들어서 전달
	        	 Statement st = conn.createStatement();
	        	 
	        	 ResultSet res = st.executeQuery(query);
	        	 
	        	 while(res.next()) {
	                 System.out.println("학생 번호 : " + res.getString("std_id"));
	                 System.out.println("학생 이름 : " + res.getString("std_name"));
	                 System.out.println("학생 나이 : " + res.getInt("std_age"));
	                 System.out.println("학생 학년 : " + res.getInt("std_grade"));
	                 System.out.println("학생 성별 : " + res.getString("std_gender"));
	                 System.out.println("학생 전화번호 : " + res.getString("std_phone"));
	                 
	                 System.out.println();
	              }
	        	 
	         }
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	          try {
	              
	              if (sc != null) {
	                 sc.close();
	              }
	              if (ps != null) {
	                 ps.close();
	              }
	              if (conn != null) {
	                 conn.close();
	              }
	              
	              
	           } catch(Exception e) {
	              e.printStackTrace();
	           }
	      }
	      
	}

}
