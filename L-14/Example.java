
public class Example{
	public static void main(String []args){
		Student s=new Student();
		s.setName("Nagar");
		s.setAge(21);
		s.setRollno(35005);
		s.setCollege("M.B.M");
		System.out.println("Student Name : "+s.getName());
		System.out.println("Student Roll no : "+s.getRollno());
		System.out.println("Student College name : "+s.getCollege());
		System.out.println("Student Age : "+s.getAge());
	}
}