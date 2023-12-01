class StringMethod{
	public static void main(String []args){
//coding For Lower Case Or Upper Case
		String s1= new String("Nagar");
		String s2=s1.toUpperCase();
		System.out.println(s2);
		String s3=s1.toLowerCase();
		System.out.println(s3);
		int i=s1.lastIndexOf("ga");
		System.out.println("Index is "+i);
		String s4="Nagar";
		String s5="NagaR";
		String s6="SagaR";
// coding for String Compare or Equality or Case Senstivity		
		if(s4.equals(s1))         					//use of equals Function
			System.out.println("String S4 and S1 are Equal");
		else{
				System.out.println("Not Equal");
			}
		
		if(s6.equalsIgnoreCase(s5))					 //use of the equalsIgnoreCase Function In String
			System.out.println("Ignore Case Senstivity in s4 and s5");
		else
			System.out.println("Error");
		int j=s6.compareTo(s5);
		if(j==0)										//use of compareTo Function
			System.out.println("String Are same");
		else if(j>0)
			System.out.println("Opposite in Dictionary Order");
		else
			System.out.println("In Dictionary Order");
		
// coding for sunstring function use
	String s7=s1.substring(1);
	System.out.println(s7);
	}
}