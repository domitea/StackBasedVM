/**
 * 
 */
package App;

import java.util.ArrayDeque;

/**
 * @author Dominik Matoulek Whole VM of emulator
 */
public class Virtual {
	private ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
	private boolean run = true;

	public void execute(String[] args) {
		for (String arg : args) {
			if (isNumber(arg)) // is string number?
			{
				int e = Integer.valueOf(arg);
				stack.addFirst(e);
			} else {
				if (arg.toUpperCase().equals("+"))
				{
					int b = stack.pop();
					int a = stack.pop();
					stack.addFirst(a+b);
				}
				else if (arg.toUpperCase().equals("-"))
				{
					int b = stack.pop();
					int a = stack.pop();
					stack.addFirst(a-b);
				}
				else if (arg.toUpperCase().equals("*"))
				{
					int b = stack.pop();
					int a = stack.pop();
					stack.addFirst(a*b);
				}
				else if (arg.toUpperCase().equals("/")) 
				{
					int b = stack.pop();
					int a = stack.pop();
					stack.addFirst(a/b);
				}
				else if (arg.toUpperCase().equals("SWAP")) // First -> Second and Second -> First
				{
					int b = stack.pop();
					int a = stack.pop();
					stack.addFirst(b);
					stack.addFirst(a);
				}
				else if (arg.toUpperCase().equals("DUP")) // duplicate
				{
					int a = stack.pop();
					stack.addFirst(a);
					stack.addFirst(a);
				}
				else if (arg.toUpperCase().equals("SQRT")) // Square root
				{
					int a = stack.pop();
					stack.addFirst((int) Math.round(Math.sqrt(a)));
				}
				else if (arg.toUpperCase().equals("CLEAR")) // Clear Stack
				{
					stack.clear();
				}
				else if (arg.toUpperCase().equals("PRINT")) // Print Stack
				{
					System.out.println(stack.toString());
				}
				else if (arg.toUpperCase().equals(".")) // Print first member of Stack
				{
					System.out.println(stack.getFirst());
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
