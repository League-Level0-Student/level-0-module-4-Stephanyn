import javax.swing.JOptionPane;

public class SimpleSorter {
	public static void main(String[] args) {
		String userNums= JOptionPane.showInputDialog("Give me a random number.");
		String usernum2=JOptionPane.showInputDialog("Give me another number.");
		String usernum3= JOptionPane.showInputDialog("Give me one last number.");
		int a=Integer.parseInt(userNums);
		int b=Integer.parseInt(usernum2);
		int c= Integer.parseInt(usernum3);
				if (a<b) {
				int temp = 0;
				temp=a;
				a=b;
				b=temp;
			}if (b<c){
				int temp = 0;
				temp=b;
				b=c;
				c=temp;
			}if (a<b) {
				int temp = 0;
				temp = a;
				a=b;
				b=temp;
			}
		
		
		System.out.println(a+" "+b+" "+c);
		

		
		
	}
}
