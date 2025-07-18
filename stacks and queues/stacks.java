import java.util.Stack;

public class stacks {

	public static void main(String[] args) {
		String character = "HELLO";
		System.out.println("Original : " + character);
		System.out.println("Reversed : " + reverse(character));
		Stack <Integer> stack = new Stack<> ();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		}
		
		
		public static String reverse (String input) {
			Stack <Character> stack = new Stack <> ();
			for (char c : input.toCharArray()) {
				stack.push(c);
			}
			
			StringBuilder reversed = new StringBuilder();
			while(!stack.isEmpty())
			{
				reversed.append(stack.pop());
			}
			return reversed.toString();
		

}
}

