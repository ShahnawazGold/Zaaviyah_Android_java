package zaaviyahSS;

public class methods {

	/// local method
//	public void  ageSet () {
//		
////		int age = 23;
////		System.out.println("age is" +age);
//		
//	}
	
	
	/// constructor
	
	methods () {
		System.out.println("yes constructor");
		int age = 23;
		System.out.println("age is" +age);
	}
	
	/// instance method
	
	
	public String  name ;
	
	    
	public void setAge (String Sname) {
		
		name = Sname ;
		
	}
	
	String getName  () {
		
		return name + " " ;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methods obj = new methods ();
		//obj.ageSet();
		
		obj.setAge ("sobia");
		
		System.out.println(" name " +obj.getName());
		
		
	}

}
