package input.view;

import javax.swing.JOptionPane;

public class SloDisplay
{
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	public void displayResponce(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
