package projects302;

public class Home {

	public void Sum(){
		int a=5;
		int b=5;
		System.out.println("Sum(Home) is: "+(a+b));
	}
	
	public void Abc(int a){
		System.out.println("(Home) Value of A: "+a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home home = new Home();
		Room1 obj1 = new Room1 ();
		Room2 obj2 = new Room2();
		Room3 obj3 = new Room3();
		Room4 obj4 = new Room4();
		//obj1.ac (76);
		//obj1.ac();
		obj1.RoomColor();
		obj2.RoomColor();
		obj3.RoomColor();
		obj4.Sum();
		home.Sum();
		home.Abc(4);
		obj4.Abc(4);
		
		
		
		
	}

}

class Room4 extends Home{
	public void Sum(){
		int a=5;
		int b=5;
		System.out.println("Sum is: "+(a+b));
	}
	public void Abc(int a){
		System.out.println("(Class4) Value of A: "+a);
	}
}



class Room1 extends Home  implements shah {

	public int Rs ;
	
    public void ac(int pRs) {
		Rs  = pRs ;
    	
	}
	 
    public void ac(){
    	System.out.println("Value is : "+Rs);
    }
    
    public void RoomColor(){System.out.println("Room 1 Color: Green");}

}


class Room2 extends Home implements shah{
	
public int Rs ;
	
    public void ac(int pRs) {
		Rs  = pRs ;
    	
	}
	 
    public void ac(){
    	System.out.println("Value is : "+Rs);
    }
    
    public void RoomColor(){System.out.println("Room 2 Color: Green");}
	
}




class Room3 extends Home implements shah{
	public int Rs ;
	public void ac(int pRs) {
		Rs  = pRs ;
    	
	}
	 
    public void ac(){
    	System.out.println("Value is : "+Rs);
    }
    
    public void RoomColor(){System.out.println("Room 3 Color: Green");}
}

