package ch13;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class AWTEx01 extends Frame{
	
	Label label;
	Button btn;

	public AWTEx01() {
		setTitle("AWT Example");
		setLayout(new FlowLayout());
		setSize(300, 100);
		label = new Label("AWT Label");
		label.setBackground(Color.GRAY);
		btn = new Button("AWT ��ư");
		add(label);
		add(btn);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AWTEx01();
	}
}