/**
 * 
 */
package App;

import java.util.Scanner;

/**
 * @author Dominik Matoulek
 *  Try of Forth scripting Stack-based VM
 */
public class Machine {
	
	
	public Machine() {
		String exp;
		String[] exps;
		Scanner scan = new Scanner(System.in);
		exp = scan.nextLine();
		exps = exp.split(" ");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Machine();
	}

}
