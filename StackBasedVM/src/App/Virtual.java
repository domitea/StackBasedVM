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
				else if (arg.toUpperCase().equals("."))
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
