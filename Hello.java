import javax.swing.*;

public class Hello {
	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		final String NAME = System.console().readLine();
		final String GREETING = "Hello, " + NAME;
		System.out.println(GREETING);
		JOptionPane.showMessageDialog(null, GREETING);
	}
}