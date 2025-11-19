package Udemy_Practice.JavaFearUdemyCourseAssignments.assignment_12.src.assignment_12;


import Udemy_Practice.JavaFearUdemyCourseAssignments.assignment_12.src.ignore.TestingUtils;

public class App {


	/**
	 * 
	Return a version of the given string, where for every star (*) 
	in the string the star and the chars immediately to its left and right are gone. 
	So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		starKill("cd*zq")  <b>---></b>"cq"<br>
		starKill("ab**cd")    <b>---></b> "ad" <br>
		starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */
	
	public static String starKill(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='*')
                continue;
            if(i>0&&str.charAt(i-1)=='*')
                continue;
            if(i<str.length()-1 && str.charAt(i+1)=='*')
                continue;
            s += str.charAt(i);
        }
        return s;
	}


	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
