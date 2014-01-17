/**
 * 
 */
package App;

import java.util.Scanner;

/**
 * @author Dominik Matoulek Try of Forth scripting Stack-based VM
 */
public class Machine {

	public Machine() {
		String exp;
		String[] exps;
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		Virtual VM = new Virtual();
		while (run) {
			exp = scan.nextLine();
			exps = exp.split(" ");
			VM.execute(exps);
			run = VM.isRun();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Machine();
	}

}
