package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		while (email.contains("@")==false)
		{
			email = JOptionPane.showInputDialog("Esse email tem que ter o @!").toLowerCase();
		}
	System.out.println("Email:" + email);
	}
}
