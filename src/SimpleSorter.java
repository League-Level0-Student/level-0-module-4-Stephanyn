import javax.swing.JOptionPane;

public class SimpleSorter {
	public static void main(String[] args) {
		String userNums= JOptionPane.showInputDialog("Give me a random number.");
		String usernum2=JOptionPane.showInputDialog("Give me another number.");
		int input=Integer.parseInt(userNums);
		int input2=Integer.parseInt(usernum2);
			if(input>input2) {
				System.out.println(input);
				System.out.println(input2);
			}else if(input<input2) {
				System.out.println(input2);
				System.out.println(input);
			}
		
		
		
		

		
		
	}
}
