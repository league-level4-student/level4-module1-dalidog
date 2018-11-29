package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Travel to Africa to befriend the elephant population");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Sit at home and question your life choices");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Go to every taco restaurant in California and order water at every one.");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Throw a huge house party to celebrate hump day! (be sure to not invite people you hate)");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Go to the beach but don't swim.");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Try to climb the Eiffel Tower without getting caught. If you get to the top, start shouting offensive nonsense.");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Remember that you haven't gone to school all week and you're failing all your classes.");
			break;
		}
	}
}
