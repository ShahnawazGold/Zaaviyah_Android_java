//package zaaviyah;
//
//public class Classes {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//
//	 }
//}

package zaaviyah;

public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/// //////////////////exmple 1 //////////////////////

//		 Box obj = new Box();
//		 double vol ;
//		 obj.width = 32;
//		 obj.height= 3;
//		 obj.depth= 30;
//		  
//		 //// cpmute volume of box 
//		 vol = obj.width * obj.depth* obj.height ;
//		 
//		 System.out.println(" volume is " + vol);
		
		
		
		
		/////////////////////////Adding a Method to the Box Class///////////////
		//// exmple 2 heres show as that //////////////////////
		// display volume of first box

//		 Box obj = new Box();
//		 double vol ;
//		 obj.width = 32;
//		 obj.height= 3;
//		 obj.depth= 30;
//		  		 //// cpmute volume of box 
//		 vol = obj.width * obj.depth* obj.height ;
//		 
//		// System.out.println(" volume is " + vol);
//		 obj.volume(); // call here method
		
		
		////////////////////////////Returning a Value/////////////////////
               ////////////////////exmple 3///////////////////
		
//		 Box obj = new Box();
//		 double vol ;
//		 obj.width = 32;
//		 obj.height= 3;
//		 obj.depth= 30;
//		  		 //// cpmute volume of box 
//		 //vol = obj.width * obj.depth* obj.height ;
//		 
//		// System.out.println(" volume is " + vol);
//		vol =obj.volume(); // call here method
//		 
//		 System.out.println("volume here return method" +vol);
		
		
		
		
    ///////////////////////// This program uses a parameterized method.///////
		///////////////////////exmple 4////////////////////////
		
//		
//		 Box obj = new Box();
//		 double vol ;
//		 obj.width = 32;
//		 obj.height= 3;
//		 obj.depth= 30;
//		 //// cpmute volume of box 
//		 //vol = obj.width * obj.depth* obj.height ;
//		 
//		// System.out.println(" volume is " + vol);
//		vol =obj.volume(); // call here method
//		obj.setDim(3, 5,7);
//		 
//		System.out.println("volume here return method" +vol);
		
		
		/////////////////////Constructors/////////////////
		/////////////////exmple 5////////////////
//		
//		 Box obj = new Box();
//		 double vol ;
//		 obj.width = 32;
//		 obj.height= 3;
//		 obj.depth= 30;
//		
//		vol =obj.volume(); // call here method
//		 
//		System.out.println("volume here return method" +vol);
		
		
		/////////////////////////Parameterized Constructors//////////////////////////
		
		///////////////////////exmpple 6/////////////////
//		
//		Box obj = new Box(3, 6, 9);
//		double vol;
//		// get volume of first box
//		vol = obj.volume();
//		System.out.println("Volume is " + vol);
		
		//////////////The this Keyword/////////////////
//		Sometimes a method will need to refer to the object that invoked it. To allow this, Java
//		defines the this keyword. this can be used inside any method to refer to the current object.
//		That is, this is always a reference to the object on which the method was invoked. You can
//		use this anywhere a reference to an object of the current class� type is permitted.
//		To better understand what this refers to, consider the following version of Box( ):
		
		// A redundant use of this.
//		Box(double w, double h, double d) {
//				this.width = w;
//				this.height = h;
//				this.depth = d;
//		}
//		
		/////////////////The finalize( ) Method///////////////
		
		
//		protected void finalize( )
//		{
//		// finalization code here
//		}
		
		
		
	 }
}

/// //////////////////exmple 1 //////////////////////
//class Box {
//	double width ;
//	double height ;
//	double depth;
//}
/// //////////////////exmple 2 //////////////////////
//	class Box {
//
//	
//		double width ;
//		double height ;
//		double depth;
//		
//		void volume () {
//		System.out.print("Volume is ");
//		System.out.println(width * height * depth);
//		}
//		
//	}


////////////////////exmple 3///////////////////

//class Box {
//	
//	double width;
//	double height;
//	double depth;
//	// compute and return volume
//	
//	double volume() {
//		return width  * height * depth ;
//		
//	}
//}

///////////////////////// exmple 4//////////////////
//class Box {
//
//	
//	double width ; 
//	double height ;
//	double depth;
//	
//	double volume (){
//		return width * height * depth ;
//			
//	}
//	
//	// set dimension of box 
//	void setDim (double w, double h ,double d){
//		width = w;
//		height = h;
//		depth = d;
//	}
//
//}

//////////////////////////exmple 5///////////////////
//class Box {
//		double width;
//		double height ;
//		double depth;
//		/// this constructor
//		Box (){
//			System.out.println("constructor A");
//			width = 10;
//			height = 10;
//			depth = 10;
//			
//		}
//		
//		/// compute and return volume
//		double volume () {
//			return width * height * depth;
//		}
//} 

////////////////////xmple 6/////////////////////////


//class Box {
//
//	
//	double width ;
//	double height ;
//	double depth ;
//	
//	////////// this is the constructor 
//	Box (double w , double h , double d){
//		width = w;
//		height = h;
//		depth = d;
//		
//	}
//	double volume() {
//	return width * height * depth;
//	}
//}
