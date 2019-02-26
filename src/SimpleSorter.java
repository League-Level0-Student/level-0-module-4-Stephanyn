import javax.swing.JOptionPane;

public class SimpleSorter {
	public static void main(String[] args) {
		String userNums= JOptionPane.showInputDialog("Give me a random number.");
		String usernum2=JOptionPane.showInputDialog("Give me another number.");
		String usernum3= JOptionPane.showInputDialog("Give me one last number.");
		int a=Integer.parseInt(userNums);
		int b=Integer.parseInt(usernum2);
		int c= Integer.parseInt(usernum3);
			if(a>b) {
				int temp = 0;
				temp=a;
				a=b;
				b=temp;
			}else if (b>a) {
				int temp = 0;
				temp=b;
				b=a;
				a=temp;
			}else if (c>a){
				int temp = 0;
				temp=c;
				c=a;
				a=temp;
			}else if (c>b){
				int temp = 0;
				temp=c;
				c=b;
				b=temp;
			}else if (a>c){
				int temp = 0;
				temp=a;
				a=c;
				c=temp;
			}
		
		
		System.out.println(a+" "+b+" "+c);
		

		
		
	}
}
