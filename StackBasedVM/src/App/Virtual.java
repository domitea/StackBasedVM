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
				else if (arg.toUpperCase().equals("PRINT")) // print whole stack
				{
					System.out.println(stack.toString());
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
				else if (arg.toUpperCase().equals("CLR")) // Clear Stack
				{
					stack.clear();
				}
				else if (arg.toUpperCase().equals(".")) // Print first member of Stack
				{
					System.out.println(stack.pop());
				}
				else if (arg.toUpperCase().equals("<")) // Is a smaller than b ? If is, write 1. If not, write 0
				{
					int a = stack.pop();
					int b = stack.pop();
					if (b < a)
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(1);
					}
					else
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(0);
					}
				}
				else if (arg.toUpperCase().equals("<="))
				{
					int a = stack.pop();
					int b = stack.pop();
					if (b <= a)
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(1);
					}
					else
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(0);
					}
				}
				else if (arg.toUpperCase().equals(">"))
				{
					int a = stack.pop();
					int b = stack.pop();
					if (b > a)
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(1);
					}
					else
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(0);
					}
				}
				else if (arg.toUpperCase().equals("=>"))
				{
					int a = stack.pop();
					int b = stack.pop();
					if (b >= a)
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(1);
					}
					else
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(0);
					}
				}
				else if (arg.toUpperCase().equals("=="))
				{
					int a = stack.pop();
					int b = stack.pop();
					if (b == a)
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(1);
					}
					else
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(0);
					}
				}
				else if (arg.toUpperCase().equals("/=")) // I like Prolog :)
				{
					int a = stack.pop();
					int b = stack.pop();
					if (b != a)
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(1);
					}
					else
					{
						stack.addFirst(a);
						stack.addFirst(b);
						stack.addFirst(0);
					}
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
