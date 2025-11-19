package Udemy_Practice.JavaFearUdemyCourseAssignments.assignment_08.src.assignment_08;


import Udemy_Practice.JavaFearUdemyCourseAssignments.assignment_08.src.ignore.TestingUtils;

public class App {


	/**

	Given 3 int arguments - a, b, c, return their sum. However, if one of the arguments 
	is the same as any of the other ones, that number should not count towards the sum. 
	So basically you only sum unique numbers, not duplicates
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		sumUnique(1, 2, 3)   <b>---></b> 6 <br>
		sumUnique(3, 2, 3)    <b>---></b> 2 <br>
		sumUnique(3, 3, 3) <b>---></b> 0 <br>
	 */
	
	public static int sumUnique(int a, int b, int c) {
        int sum=0;
        if(a!=b&&a!=c) {
            sum += a;
        }
        if(a!=b&&b!=c) {
            sum+=b;
        }
        if(a!=c&&b!=c) {
            sum += c;
        }
        return sum;
		
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
