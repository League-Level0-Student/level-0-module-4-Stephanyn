package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String input = JOptionPane.showInputDialog("Give me a random number");	
		 int userNum = Integer.parseInt(input);
		String user = JOptionPane.showInputDialog("Give me another number");
			int num2 = Integer.parseInt(user);		
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you want to do?", "opperation", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
		if(operation==0) {
			add(userNum,num2);
		}else if(operation==1) {
			subtract(userNum,num2);
		}else if(operation==2) {
			multiply(userNum,num2);
		}else if(operation==2) {
			divide(userNum,num2);
		}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
  
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int userNum, int num2) {
		 JOptionPane.showMessageDialog(null,(userNum+num2));
	 }
	static void subtract(int userNum, int num2) {
		JOptionPane.showMessageDialog(null,(userNum-num2));
	}
	static void multiply(int userNum, int num2) {
		JOptionPane.showMessageDialog(null, userNum*num2);
	}
	static void divide(int userNum, int num2) {
		JOptionPane.showMessageDialog(null, userNum/num2);
	// 4. Create similar methods for subtraction, multiplication and division.
}
}