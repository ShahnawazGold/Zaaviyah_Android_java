package zaviyaah303_class;
public class Home {
	public String name;
	public String fatherName;
	public int rollNo;
	private int idNo;
	public String qualification;
	private double gpa;
	public int age;
	
	Home(){
		System.out.println("i work at zaaviyah solutions!!!..1");
	}
	
	Home(String Name, double Gpa)
	{
		name = Name;
		gpa = Gpa;
	}
	
	void setName(String name1){
		name=name1;
	}
	void setAge(int age1){
		age=age1;
	}
	void setfather(String f1){
		fatherName=f1;
	}
	void setRoll(int r1){
		rollNo=r1;
	}
	void setId(int id1){
		idNo=id1;
	}
	void setgpa(double gpa1){
		gpa=gpa1;
	}
	void setqual(String q1){
		qualification=q1;
	}
	
	// creating get methods
	
	String getName(){
		return name;
	}
	
	String getfather(){
		return fatherName;
	}
	
	int getId(){
		return idNo;
	}
	
	int getAge(){
		return age;
	}
	
	String getqualif(){
		return qualification;
	}
	int getroll(){
		return rollNo;
	}
	
	double getGpa(){
		return gpa;
	}

	public static void main(String[] args) {
	
		Home obj = new Home(); // creating object
		Home obj1 = new Home();
		
		//Home obj2 = new Home();
		String n1 = "aaa";
		double a1 = 3.3;
		
		Home obj2 = new Home(n1, a1);
		System.out.println(obj2.name);
		System.out.println(obj2.gpa);
		
		
		obj.setName("zaaviyah");
		obj.setfather("faraz");
		obj.setId(123);
		obj.setAge(30);
		obj.setgpa(3.9);
		obj.setRoll(12345);
		obj.setqual("MS");
		
		System.out.println("name: " + obj.getName());
		System.out.println("fatherName: " +obj.getfather());
		System.out.println("age: " +obj.getAge());
		System.out.println("gpa: "+obj.getGpa());
		System.out.println("rolNo: " +obj.getroll());
		System.out.println("ID: "+obj.getId());
		System.out.println("qualification: "+obj.getqualif());
		
		
		System.out.println();
		
		
		obj1.setName("aneesha");
		obj1.setfather("xyz");
		obj1.setId(1233);
		obj1.setAge(30);
		obj1.setgpa(3.9);
		obj1.setRoll(124345);
		obj1.setqual("BSCS");
		
		System.out.println("name: " + obj1.getName());
		System.out.println("fatherName: " +obj1.getfather());
		System.out.println("age: " +obj1.getAge());
		System.out.println("gpa: "+obj1.getGpa());
		System.out.println("rolNo: " +obj1.getroll());
		System.out.println("ID: "+obj1.getId());
		System.out.println("qualification: "+obj1.getqualif());

	}

}
