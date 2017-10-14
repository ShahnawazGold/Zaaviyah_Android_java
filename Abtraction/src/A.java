
abstract class A {
abstract void add();

abstract void subs();
}
class B extends A{
	public void add(){
		System.out.println("This is add");
		
	}
	
	public void subs(){
		System.out.println("this is substraction");
	}
	
}

 class Taha{
public static void main(String arg[]){
	B obj=new B();
	obj.add();
	obj.subs();
	
}	
}