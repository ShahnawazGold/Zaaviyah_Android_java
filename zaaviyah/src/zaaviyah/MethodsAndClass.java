package zaaviyah;

public class MethodsAndClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//////////////Using Objects as Parameters////////
		
	
		Test obj1 = new Test (100, 22);
		Test obj2 = new Test(100, 22);
		System.out.println("obj == obj2" + obj1.equalTo (obj1));
		System.out.println("ob1 == ob3: " + obj2.equalTo(obj2));
	}

}

//////////////////Using Objects as Parameters//////
class Test {

		int a, b;
		Test (int i , int j) {
			a= i;
			b = j;
		}
		// //retrn true if o is equal to  invoking objects
		
		boolean equalTo(Test o) {
		if(o.a == a && o.b == b) return true;
			else return false;
			}
}
