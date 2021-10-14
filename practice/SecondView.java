package practice;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SecondView extends Run implements View {

	int newNum2;
	int total;
	float avg;
	
	String header[] = { "이름", "국어", "영어", "수학", "총점", "평균", "석차" };
	String contents[][];
	DefaultTableModel model;
	JTable table;
	JScrollPane scroll;
	

	public int getNewNum() {
		return newNum2;
	}

	public void setNewNum(int newNum) {
		this.newNum2 = newNum;
	}

	public SecondView(int number) {
		setNewNum(number);
		Display();
		RunEvent();
	}
	
	@Override
	public void RunEvent() {
		
		jbt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int[][] newArray = new int[getNewNum()][2];
				table.clearSelection();
				for (int i = 0; i < getNewNum(); i++) {

					int value1 = Integer.parseInt((String) model.getValueAt(i, 1));
					int value2 = Integer.parseInt((String) model.getValueAt(i, 2));
					int value3 = Integer.parseInt((String) model.getValueAt(i, 3));
					total = value1 + value2 + value3;
					avg = total / 3.0f;

					model.setValueAt(String.valueOf(total), i, 4);
					model.setValueAt(String.valueOf(avg), i, 5);

					newArray[i][0] = total;
					newArray[i][1] = 1;
				}

				for (int i = 0; i < getNewNum(); i++) {
					for (int j = 0; j < getNewNum(); j++) {
						if (newArray[i][0] < newArray[j][0]) {
							newArray[i][1]++;
						}
					}
				}

				for (int i = 0; i < getNewNum(); i++) {
					model.setValueAt(String.valueOf(newArray[i][1]), i, 6);
				}

			}
		});
	}
	
	

	@Override
	public void Display() {
		jframe.setSize(600, 400);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

		jframe.setTitle("성적관리"); // 프레임 이름 부여

		// jpanel1 레이아웃 설정
		jPanel1.setLayout(new BorderLayout());

		// label2와 jbt1 jpanel2에 추가
		jPanel2.add(label2);
		jPanel2.add(jbt1);

		// jpanel1에 label1, jtf, jpanel2 추가
		jPanel1.add("West", label1);
		jPanel1.add("Center", jtf);
		jPanel1.add("East", jPanel2);

		// 프레임에 jpanel1 추가
		jframe.add("North", jPanel1);

		// jpanel3 레이아웃 설정
		jPanel3.setLayout(new BorderLayout());

		// jpanel3에 jbt2, jbt3 추가
		jPanel4.add(jbt2);
		jPanel4.add(jbt3);
		jPanel3.add("East", jPanel4);
		
		//프레임에 jpanel3 추가
		jframe.add("South", jPanel3);

		contents = new String[getNewNum()][];
		model = new DefaultTableModel(contents, header);
		table = new JTable(model);
		scroll = new JScrollPane(table);

		jframe.add("Center", scroll);
		
		
	}
}
