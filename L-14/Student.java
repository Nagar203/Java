class Student extends Person{
	private int rollno;
	private String college;
	public void setRollno(int r){
		rollno=r;
	}
	public void setCollege(String c){
		college=c;
	}
	public String getCollege(){
		return (college);
	}
	public int getRollno(){
		return (rollno);
	}
}
