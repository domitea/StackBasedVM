/**
 * 
 */
package App;

import java.util.Scanner;

/**
 * @author Dominik Matoulek
 *  Pokus o emulator zasobnikoveho pocitace programovatelneho pomoci Forthu
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
