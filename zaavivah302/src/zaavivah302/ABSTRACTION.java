package zaavivah302;


abstract class A{
	abstract void add();
	
	abstract void subs();
}

class B extends A{
	
	public void add(){
		System.out.println("This method will show addition");
	}
public void subs(){
	System.out.println("This method will show substraction");
}
}
public class ABSTRACTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj=new B();
obj.add();
obj.subs();
	}

}
