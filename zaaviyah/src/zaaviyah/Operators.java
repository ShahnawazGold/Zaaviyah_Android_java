package zaaviyah;

public class Operators {

	public static void main(String[] args) {

		
		/////////////Arithmetic Operators/////////
		
		//		+ Addition (also unary plus)
		//		– Subtraction (also unary minus)
		//		* Multiplication
		//		/ Division
		//		% Modulus
		//		++ Increment
		//		+= Addition assignment
		//		– = Subtraction assignment
		//		*= Multiplication assignment
		//		/= Division assignment
		//		%= Modulus assignment
		//		– – Decrement
		
		
		////The Basic Arithmetic Operators
		
//		System.out.println("Integer Arithmetic");
//		int a = 1 + 1;
//		int b = a * 3;
//		int c = b / 4;
//		int d = c - a;
//		int e = -d;
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
//		System.out.println("e = " + e);
//		// arithmetic using doubles
//		System.out.println("\nFloating Point Arithmetic");
//		double da = 1 + 1;
//		double db = da * 3;
//		double dc = db / 4;
//		double dd = dc - a;
//		double de = -dd;
//		System.out.println("da = " + da);
//		System.out.println("db = " + db);
//		System.out.println("dc = " + dc);
//		System.out.println("dd = " + dd);
//		System.out.println("de = " + de);
		
//		 int a = 1+1;
//		 int b= a* 3;
//		 int c = b/4;
//		 int d = c-a;
//		 int e = -d;
		 
//		
//		 System.out.println("a = " + a);
//			System.out.println("b = " + b);
//			System.out.println("c = " + c);
//			System.out.println("d = " + d);
//			System.out.println("e = " + e);
//			
//			System.out.println("\n floatinf point arthimathic ");
//			
//			double da = 1+1;
//			double db = da*3;
//			double dc = db/4;
//			
//			double dd = dc - a;
//			double de = -dd;
//			System.out.println("da = " + da);
//			System.out.println("db = " + db);
//			System.out.println("dc = " + dc);
//			System.out.println("dd = " + dd);
//			System.out.println("de = " + de);
		
		 
		///////////// The Modulus Operator//////////////
		 

		
//		 int x = 24;
//		 double y = 3.3;
//		 System.out.println("x mod 10" + x% 10);
//		 System.out.println("y mod 10 = " + y % 10);
		 
		// Demonstrate several assignment operators./////////////////
		 

		 
//		 int a = 1;
//		 int b = 2;
//		 int c = 3;
//		 a +=5;
//		 b *= 4;
//		 c +=a  *b;
//		 System.out.println(" a = b " + a);
//		 System.out.println("b = " + b);
//		 System.out.println("c = " + c);
		
		///////////////////// Demonstrate ++.////////////
//		int a = 1;
//		int b = 2;
//		int c;
//		int d;
//		c = ++b;
//		d = a++;
//		c++;
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
		 
		
		/////////////////////////Using the Bitwise Logical Operators//////////////
		
//		String binary[] = {
//				"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
//				"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
//				};
//				int a = 3; // 0 + 2 + 1 or 0011 in binary
//				int b = 6; // 4 + 2 + 0 or 0110 in binary
//				int c = a | b;
//				int d = a & b;
//				int e = a ^ b;
//				int f = (~a & b)|(a & ~b);
//				int g = ~a & 0x0f;
//				System.out.println(" a = " + binary[a]);
//				System.out.println(" b = " + binary[b]);
//				System.out.println(" a|b = " + binary[c]);
//				System.out.println(" a&b = " + binary[d]);
//				System.out.println(" a^b = " + binary[e]);
//				System.out.println("~a&b|a&~b = " + binary[f]);
//				System.out.println(" ~a = " + binary[g]);
		 
		
		///////////////////////////// Left shifting as a quick way to multiply by 2.
		

		int i ;
		int num = 0xFFFFFFE;
		for (i=0; i < 4; i++) {
			num = num << 1;
			System.out.println(num);	
		}
		
		 ///////////////////Relational Operators///////////////////
		
//		         == Equal to
//				!= Not equal to
//				> Greater than
//				< Less than
//				>= Greater than or equal to
//				<= Less than or equal to
		
		
		//////////////////Boolean Logical Operators/////////////////
		
		//		& Logical AND
		//		| Logical OR
		//		^ Logical XOR (exclusive OR)
		//		|| Short-circuit OR
		//		&& Short-circuit AND
		//		! Logical unary NOT
		//		&= AND assignment
		//		|= OR assignment
		//		^= XOR assignment
		//		== Equal to
		//		!= Not equal to
		//		?: Ternary if-then-else
		
		/////////////////////////////////////// Demonstrate the boolean logical operators.//////////////
		
		
	
		
//		boolean a = true; 
//		boolean b = false ;
//		boolean c = a |b;
//		boolean d = a& b;
//		boolean e = a^ b ;
//		boolean f = (!a & b ) | (a & b);
//		boolean g = !a ;
//		
//		
//		System.out.println("a =" + a );
//		System.out.println(" b = " + b);
//		System.out.println(" a|b = " + c);
//		System.out.println(" a&b = " + d);
//		System.out.println(" a^b = " + e);
//		System.out.println("!a&b|a&!b = " + f);
//		System.out.println(" !a = " + g);
//				
		
		
		
		
//		
	}

}
