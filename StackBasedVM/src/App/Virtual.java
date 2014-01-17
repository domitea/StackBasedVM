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
			} else {
				if (arg.toUpperCase().equals("+"))
				{
					int b = FIFO.pop();
					int a = FIFO.pop();
					FIFO.addFirst(a+b);
				}
				else if (arg.toUpperCase().equals("-"))
				{
					int b = FIFO.pop();
					int a = FIFO.pop();
					FIFO.addFirst(a-b);
				}
				else if (arg.toUpperCase().equals("*"))
				{
					int b = FIFO.pop();
					int a = FIFO.pop();
					FIFO.addFirst(a*b);
				}
				else if (arg.toUpperCase().equals("/")) 
				{
					int b = FIFO.pop();
					int a = FIFO.pop();
					FIFO.addFirst(a/b);
				}
				else if (arg.toUpperCase().equals("SWAP")) // First -> Second and Second -> First
				{
					int b = FIFO.pop();
					int a = FIFO.pop();
					FIFO.addFirst(b);
					FIFO.addFirst(a);
				}
				else if (arg.toUpperCase().equals("DUP")) // duplicate
				{
					int a = FIFO.pop();
					FIFO.addFirst(a);
					FIFO.addFirst(a);
				}
				else if (arg.toUpperCase().equals("SQRT")) // Square root
				{
					int a = FIFO.pop();
					FIFO.addFirst((int) Math.round(Math.sqrt(a)));
				}
				else if (arg.toUpperCase().equals("CLEAR")) // Clear Stack
				{
					FIFO.clear();
				}
				else if (arg.toUpperCase().equals("PRINT")) // Print Stack
				{
					System.out.println(FIFO.toString());
				}
				else if (arg.toUpperCase().equals(".")) // Print first member of Stack
				{
					System.out.println(FIFO.getFirst());
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
	
	public boolean isRun() {
		return run;
	}
}
