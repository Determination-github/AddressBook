package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Run implements View {
	public int getNewNum1() {
		return newNum1;
	}
	
	public void setNewNum1(int newNum1) {
		this.newNum1 = newNum1;
	}
	
	int newNum1;
	
	
	public Run() {
		RunEvent();
	}
	
	public void RunEvent() {
		jbt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(jtf.getText());
				setNewNum1(number);
				jframe.dispose();
				SecondView sv = new SecondView(number);
			}
		});
		
		
		jbt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
	}
}
