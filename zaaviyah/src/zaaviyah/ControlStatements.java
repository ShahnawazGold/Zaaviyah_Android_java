package zaaviyah;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //////// A simple example of the switch.
		
		
//
//		
//		for (int d =  0; d < 6; d++)  {
//			switch (d ) {
//			case 0:
//			System.out.println("is zero ");
//			break ;
//			case 1:
//			System.out.println("i is one.");
//			break;
//			case 2:
//			System.out.println("i is two.");
//			break;
//			case 3:
//			System.out.println("i is three.");
//			break;
//			default :
//			System.out.println("i is greather ");
//			
//			}
//			
//		}
		
		
		/////////////////// An improved version of the season program.///////
//		
//		int month = 4;
//		String season;
//		switch (month) {
//		case 12:
//		case 1:
//		case 2:
//		season = "Winter";
//		break;
//		case 3:
//		case 4:
//		case 5:
//		season = "Spring";
//		break;
//		case 6:
//		case 7:
//		case 8:
//		season = "Summer";
//		break;
//		case 9:
//		case 10:
//		case 11:
//		season = "Autumn";
//		break;
//		default:
//		season = "Bogus Month";
//		}
//		System.out.println("April is in the " + season + ".");
		
		
//		int month =4;
//		String season ;
//		switch (month) {
//		
//		case 12:
//		case 1:
//		case 2:
//	    season = "Winter";
//	    break ;
//		case 3:
//			case 4:
//			case 5:
//			season = "Spring";
//			break;
//			case 6:
//			case 7:
//			case 8:
//			season = "Summer";
//			break;
//			case 9:
//			case 10:
//			case 11:
//			season = "Autumn";
//			break;
//			default :
//				season = "Bogs Month";		
//		
//		}
//		System.out.println("April is in the " + season + ".");
		
		
		
		
		////////////////// Use a string to control a switch statement.//////////
		
		
//		String str = "two";
//		switch(str) {
//		case "one":
//		System.out.println("one");
//		break;
//		case "two":
//		System.out.println("two");
//		break;
//		case "three":
//		System.out.println("three");
//		break;
//		default:
//		System.out.println("no match");
//		break;
//		}
		
//		String str = "two";
//		switch (str) {
//		case "one " :
//		System.out.println("one");
//		break ;
//		case "two":
//			System.out.println("two");
//			break;
//			case "three":
//			System.out.println("three");
//			break;
//			default:
//			System.out.println("no match");
//			break;
//		
//	
//		}
		
//		////////////while
//		The while loop is Java�s most fundamental loop statement. It repeats a statement or block
//		while its controlling expression is true. Here is its general form:
//		while(condition) {
//		// body of loop
	//	}
		
		
		
//		int n = 10;
//		while ( n > 0) {
//			System.out.println("tick" + n);
//			n--;
//		}
		
		
		////////////// The target of a loop can be empty.///////////
		
//		
//		int i, j;
//		i = 100;
//		j = 200;
//		// find midpoint between i and j
//		while(++i < --j); // no body in this loop
//			System.out.println("Midpoint is " + i);
	
		
		//////////////do-while//////////////////
			
//			int n = 10;
//			do {
//			System.out.println("tick " + n);
//			n--;
//			} while(n > 0);
//		
//		int n = 10;
//		do {
//			System.out.println("tick " + n);
//			n--;
//		}while ( n > 0);
		
		
		///////////////////////////for////////////////
		
		
//		for(initialization; condition; iteration) {
//			// body
//			}
		
		// here, n is declared inside of the for loop
//		for(int n=10; n>0; n--)
//		System.out.println("tick " + n);
		
//		 for (int n =0; n > 10; n--) {
//			 System.out.println("tick " +n);
//		 } 
		
			////// Using the comma.

			
//			int a, b;
//			for (a=1, b= 4; a<b ; a++ ,b-- ) {
//				System.out.println("a = " + a);
//			System.out.println("b = " + b);
//				
//			}
			
			
			//////////The For-Each Version of the for Loop////
	
//			int nums [] = {1,2,3,4,5,6,7};
//			int sum = 0;
//			
//			/// using for - each style for dsisply and sum the values 
//			
//			for ( int x : nums ) {
//				System.out.println("values summation " + x);
//				sum+= x;
//				
//			}
			
			/////////////// Use break with a for-each style for.///////
			
			
//			int sum = 0;
//			int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//			// use for to display and sum the values
//			for(int x : nums) {
//			System.out.println("Value is: " + x);
//			sum += x;
//		//	if(x == 5) break; // stop the loop when 5 is obtained
//			if (x==4) break ;
//			}
//			System.out.println("Summation of first 5 elements: " + sum);
			
//			////////////Iterating Over Multidimensional Arrays
//			The enhanced version of the for also works on multidimensional arrays. Remember,
//			however, that in Java, multidimensional arrays consist of arrays of arrays.
			
			
			
			///////////////////////////////////// Use for-each style for on a two-dimensional array./////////
//			int sum = 0;
//			int nums[][] = new int[3][5];
//			// give nums some values
//			for(int i = 0; i < 3; i++)
//			for(int j = 0; j < 5; j++)
//			nums[i][j] = (i+1)*(j+1);
//			// use for-each for to display and sum the values
//			for(int x[] : nums) {
//			for(int y : x) {
//			System.out.println("Value is: " + y);
//			sum += y;
//			}
//			}
//			System.out.println("Summation: " + sum);
			
//			 int sum =0;
//			 int nums [][] = new int [3][5] ;
//			
//			 for (int i = 0; i <3 ; i++) 
//				 
//			for  ( int  j =0;  j <3 ; j++) 
//				nums[i][j] = (i +1)* (j+1);
//			
//		    for(int x [] : nums){
//		    	for (int y :x) {
//		    		System.out.println ("summing" +sum);
//		    	}
//		    }
		    
		    /////////////////Nested Loops///////////////////
		    
//		    int i, j;
//		    for(i=0; i<10; i++) {
//		    for(j=i; j<10; j++)
//		    System.out.print(".");
//		    System.out.println();
//		    }
//		    
//		    int i ,j ;
//		    for (i = 0; i < 5; i++) {
//		    	
//		    	for (j= 0; j< 10; j++) {
//		    		System.out.println("j");
//		    		System.out.println( );
//		    	}
//		    	
//		    }
			
			////////////////////Jump Statements////////////
			
			// Using break to exit a loop.
			
//				for (int i = 0 ; i <100; i++) {
//					if (i ==5) break ;
//					System.out.println("i: " + i);
//				}
//				
	        ///////// Using break to exit a while loop.////////
				
				
//				int i = 0;
//				while(i < 100) {
//				if(i == 10) break; // terminate loop if i is 10
//				System.out.println("i: " + i);
//				i++;
//				}
				
//				int i = 0;
//				while (i <100) {
//					if (i==4) break;
//					System.out.println("i: " + i);
//					
//				}
//				
				/////break is nest loops /////
				
//				for(int i=0; i<3; i++) {
//					System.out.print("Pass " + i + ": ");
//					for(int j=0; j<100; j++) {
//					if(j == 10) break; // terminate loop if j is 10
//					System.out.print(j + " ");
//					}
//					System.out.println();
//					}
//					System.out.println("Loops complete.");
			
			
			///////////// Demonstrate continue.//////

//			for (int i =0; i <10; i++) {
//				System.out.println(i+ " ");
//				if (i %2 ==0) continue ;
//				System.out.println("");
//				
//			}
			
			//////////////////////////////////////// Using continue with a label./////////////
			
////			outer: for (int i=0; i<10; i++) {
////				for(int j=0; j<10; j++) {
////				if(j > i) {
////				System.out.println();
////				continue outer;
////				}
////				System.out.print(" " + (i * j));
////				}
////				}
////				System.out.println();
////				 0
////				 0 1
////				 0 2 4
////				 0 3 6 9
////				 0 4 8 12 16
////				 0 5 10 15 20 25
////				 0 6 12 18 24 30 36
////				 0 7 14 21 28 35 42 49
////				 0 8 16 24 32 40 48 56 64
//				 0 9 18 27 36 45 54 63 72 81
			
			
			
			
				
				
	}

}