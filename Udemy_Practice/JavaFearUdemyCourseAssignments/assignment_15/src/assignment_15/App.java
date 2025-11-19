package Udemy_Practice.JavaFearUdemyCourseAssignments.assignment_15.src.assignment_15;


import Udemy_Practice.JavaFearUdemyCourseAssignments.assignment_15.src.ignore.TestingUtils;

public class App {


	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	public static int longestStreak(String str) {
        if(str.isEmpty()) return 0;
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)) {
                currentCount++;
            } else {
                currentCount=1;
            }
            maxCount = Math.max(maxCount, currentCount);
        }

		return maxCount;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

