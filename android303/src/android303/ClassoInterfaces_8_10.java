package android303;

public class ClassoInterfaces_8_10  implements ClassInter8_10 {
	
	
    public void name () {
    	System.out.println("shah");
	}

    
     public void idNo () {
		System.out.println("4555");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassoInterfaces_8_10 obj = new ClassoInterfaces_8_10();
		
		Pre_eng obj2 = new Pre_eng();
		
		
		obj.name();
		obj.idNo();
		
		////
		obj2.name();
		obj2.idNo();
		
	}

}


class Pre_eng extends ClassoInterfaces_8_10 implements ClassInter8_10 {
	
	  public void name () {
	    	System.out.println("alex");
		}

	    
	     public void idNo () {
			System.out.println("77575");
		}
	
}