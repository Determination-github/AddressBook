package practice;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public interface View {
	JFrame jframe = new JFrame();
	JPanel jPanel1 = new JPanel();
	JPanel jPanel2 = new JPanel();
	JPanel jPanel3 = new JPanel();
	JPanel jPanel4 = new JPanel();
	JLabel label1 = new JLabel("성적처리인원수 : ");
	JLabel label2 = new JLabel("명");
	JTextField jtf = new JTextField(10);
	JButton jbt1 = new JButton("만들기");
	JButton jbt2 = new JButton("연산");
	JButton jbt3 = new JButton("종료");
	
	
	default void Display() {
		jframe.setSize(600, 400);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		
		
		jframe.setTitle("성적관리"); //프레임 이름 부여
		
		//jpanel1 레이아웃 설정
		jPanel1.setLayout(new BorderLayout());

		//label2와 jbt1 jpanel2에 추가
		jPanel2.add(label2);
		jPanel2.add(jbt1);

		//jpanel1에 label1, jtf, jpanel2 추가
		jPanel1.add("West", label1);
		jPanel1.add("Center", jtf);
		jPanel1.add("East", jPanel2);
		
		//프레임에 jpanel1 추가
		jframe.add("North", jPanel1);

		//jpanel3 레이아웃 설정
		jPanel3.setLayout(new BorderLayout());
		
		//jpanel3에 jbt2, jbt3 추가
//		jPanel4.add(jbt2);
		jPanel4.add(jbt3);
		jPanel3.add("East", jPanel4);
		
		//프레임에 jpanel3 추가
		jframe.add("South", jPanel3);
	}
}
