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
		for (String s: exps)
		{
			if (isNumeric(s))
			{
				System.out.println("Cislo - " + s);
			}
			else
			{
				System.out.println("Prikaz - " + s);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Machine();
	}
	
	private boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}

}
