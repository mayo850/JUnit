package edu.augustana.csc305.labs;

// Supervisor's note: Here's the smelly code that Hannaldous left us...
//
// In this order, please:
//  First, try to figure out what each method DOES by reading the code 
//     and methodically testing each method (from main).
//  Second, create a HannaldousTest class with a series of unit tests
//     that carefully test ALL the methods inside Hannaldous
//     that test the full range of behavior (including corner cases)
//  Third, refactor this code to make it as elegant as possible!
//      After each change, run your suite of unit tests to make sure
//      that all tests still pass!
//  Fourth, include a proper Javadoc comment for the public method 
//         (see Skrien appendix B, pp 318-331)
//   
//  NOTE: You should leave the class name (Hannaldous) the same, 
//       but methods should be renamed, parameters improved, etc...
//
//  HINT: the post-increment operator (e.g. i++) is weirder than you knew
//         (read Skrien appendix B, pp 318-331)

/**
 * 
 * @author izankhan18
 *
 */

public class Hannaldous {

	public static void main(String[] args) {

		System.out.println(check("bigmoose$"));
		System.out.println(check("emusareawesome"));
		System.out.println(check("17"));

		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		System.out.println(badPassCount(8, passwords));
	}

	/**
	 * Counts the number of bad/incorrect passwords in the given password selection.
	 * 
	 * @param n: minimum number of characters in a password.
	 * @param x: Array of String. Given passwords.
	 * @return: The number of incorrect passwords found in the given array.
	 */
	public static int badPassCount(int n, String[] x) {
		int j = x.length - 1;
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[j].length() < n || check(x[j]).equals("Pass"))
				count++;
			j--;
		}
		return count;
	}

	/**
	 * Check method identifies if a given password meets minimum requirements.
	 * 
	 * @param: passwordString: given password String.
	 * @return: "Pass" if the given password is only alphabets & "Fail" if the
	 *          password has anything other than alphabets.
	 */
	static String check(String passwordString) {
		int index = -1;
		while (index++ < passwordString.length() - 1) {
			char alphabet = passwordString.charAt(index);

			if (!(alphabet >= 'a' && alphabet <= 'z' || alphabet >= 'A' && alphabet <= 'Z'))
				return "Fail";
		}
		return "Pass";

	}

}
