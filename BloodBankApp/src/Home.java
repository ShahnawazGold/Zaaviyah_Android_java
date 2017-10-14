import java.util.*;
public class Home {

	
	public String name ;
	public String Lastname;
	public double MrNo ;
	private String fatherName;
	
	String Cnic;
	int phNo;
	public void setinfo(String name,String Lastname, String fathername, String Cnic, int phNo){
		this.name=name;
		this.Lastname=Lastname;
		
		this.fatherName=fatherName;
		this.Cnic=Cnic;
		this.phNo=phNo;
	}
	void getinfo(){
		System.out.println("Name: "+name+"Last Name"+Lastname);
		System.out.println("Father Name"+fatherName);
		System.out.println("Mr No."+MrNo);
		System.out.println("CNIC: "+Cnic);
		System.out.println("Ph No: "+phNo);
	}
	
	
	
//	public Home(String name) {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Home ho=new Home();
		System.out.println("------WELCOME TO BLOOD BANK -------");
		System.out.println("Name: ");
		ho.name=sc.next();
		System.out.println("Last Name: ");
		ho.Lastname=sc.next();
		System.out.println("Father Name: ");
		ho.fatherName=sc.next();
		System.out.println("CNIC: ");
		ho.Cnic=sc.next();
		System.out.println("Phone No: ");
		ho.phNo=sc.nextInt();
		
		ho.setinfo(ho.name, ho.Lastname,ho.fatherName,ho.Cnic,ho.phNo);
		System.out.println("Mr No:  ");
		ho.MrNo=(double)(Math.random() *999999999);
		ho.getinfo();
	}

}
