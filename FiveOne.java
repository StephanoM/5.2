import javax.swing.JOptionPane;

public class FiveOne {

	public static void main(String[] args) {

		double h = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to square: "));
		h = Math.pow(h, 10);
		JOptionPane.showMessageDialog(null, h);

		double x = Integer.parseInt(JOptionPane.showInputDialog("Enter X: "));
		double y = Integer.parseInt(JOptionPane.showInputDialog("Enter Y: "));
		JOptionPane.showMessageDialog(null,"The sum of your numbers is: "+ (x+y));
		
		
		
		JOptionPane.showMessageDialog(null,"sqrt(x) + absolute(y) + z^y");
		double a = Integer.parseInt(JOptionPane.showInputDialog("Enter X: "));
		double b = Integer.parseInt(JOptionPane.showInputDialog("Enter Y: "));
		double c = Integer.parseInt(JOptionPane.showInputDialog("Enter Z: "));
		JOptionPane.showMessageDialog(null, (Math.sqrt(a) + Math.abs(b) + Math.pow(c, b)));
		


	}

}
