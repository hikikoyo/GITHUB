import javax.swing.*;
public class userChoices {
	String input = "";
	
	public void askLeftOrRight ()
	{
		input = JOptionPane.showInputDialog("Enter Left or Right");
	}
	public String getRightOrLeft ()
	{
		return input;
	}
}
