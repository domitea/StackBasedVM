/**
 * 
 */
package App;

import java.util.ArrayDeque;

/**
 * @author Dominik Matoulek Whole VM of emulator
 */
public class Virtual {
	private ArrayDeque<Integer> FIFO = new ArrayDeque<Integer>();
	private boolean run = true;

	public void execute(String[] args) {
		for (String arg : args) {
			if (isNumber(arg)) // is string number?
			{
				int e = Integer.valueOf(arg);
				FIFO.addFirst(e);
				System.out.println(FIFO.toString());
			} else {
				KeyWords key = KeyWords.valueOf(arg.toUpperCase());
				switch (key) {
				case PRINT:
					System.out.println(FIFO.getFirst());
					break;
				
				case QUIT:
					run = false;
				default:
					break;
				}
			}
		}
	}

	private boolean isNumber(String a) {
		try {
			int i = Integer.parseInt(a);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
	private enum KeyWords {
		PRINT,
		QUIT,
	}
	
	public boolean isRun() {
		return run;
	}
}
