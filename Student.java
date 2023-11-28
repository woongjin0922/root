
public class Student {

	//멤버변수 department,grade,id,name,address
	   protected String department;
	   String grade;
	   String id;
	   String name;
	   String address;
	   
	   public Student(String nGrade, String strId, String strName, String strAdd, String strEmail) {
		      // TODO Auto-generated constructor stub
		      this.grade = nGrade;
		      this.id = strId;
		      this.name = strName;
		      this.address = strAdd;
	   }
	   
	   //SetDepartment 메소드를 구현해서 학과 메서드를 get()
	   public void SetDepartment(String setDepartment) {
	      this.department = setDepartment;
	   }
}
	   