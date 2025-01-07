package IterationStatements;

public class ForLoop {

	public static void main(String[] args) {

		// Without for loop we have to write same steps multiple times so loops will
		// iterate the same steps based on the condition given.
		//For loop will use majorly when we know condition length
		//       1         2      3
		for (int i = 0; i < 3; i++) { // Here area 1 is initialization (execute only once), 2 is condition, 3 is
										// increment/decrement

			// 4
			System.out.println("Print i at positon " + i); // Body/Statement

			// For loop will execute like this 1 -> 2 -> 4 -> 3 -> 2 -> 4 -> until 2 point
			// returns false
		}
		
		int j = 1;
		for (; j<3; j++) { // we can initialization inside the for loop is optional we can do out side for loop as well
			
			System.out.println("Print j at position " + j);
		}
		
		int a = 1;
		for (System.out.println("Instead of initialization 1"), 
				System.out.println("Instead of initialization 2"); a < 3; a++) { // we can place n number of print statement instead of
			// initialization place holder and it will
			// execute once and should be comma separated.

			System.out.println("Print a at positon " + a);
		} 
		
//		for (int b =1, char c ='c'; b>13; b++) {  // Error we cannot add two types of initialization in for loop
//			System.out.println("Print "+b);
//		}
		
		for (int d = 1,e = 2; d<3 && e<4; d++, e++) { // We can declare two variables in for loop
			
			System.out.println("Print d at position " +d);
			System.out.println("Print e at position " +e);	
		}
		
//		for (int f = 1;; f++) { // if we wont declare condition at the compile time compiler will sent the true
//								// value and will perform infinite loop
//
//			System.out.println("Print f at position " + f);
//		}
		
//		for (int g = 0; g < 10;) { // If we wont declare the increment/decrement operator the loop will always
//									// thinks its true and the loop iterates infinitely
//			System.out.println("Print g at position " + g);
//		}

		// In for each and every part is optional
		
//		for (int h = 1; h>0; h++) {  // here compiler unable to identify the un-reached statement as the condition is mentioned
//			
//			System.out.println("Print h at position " + h);
//		}
//		System.out.println("Print this message out side of h loop");

//		for (int k = 1; true; k++) { // here compiler will able to identify the un-reached statement as the condition
//										// is not mentioned and directly passing true
//
//			System.out.println("Print h at position " + k);
//		}
//		System.out.println("Print this message out side of k loop"); // Un-reached statement
		
	}

}
