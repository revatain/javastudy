package ch14;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventEx01 extends MFrame implements ActionListener{
	
	Button btn1, btn2;
	Label label1, label2;

	public ActionEventEx01() {
		super(300, 100);
		setTitle("Action Example");
		setLayout(new FlowLayout());
		add(btn1 = new Button("����"));
		add(btn2 = new Button("����"));
		add(label1 = new Label("����� ������? "));
		add(label2 = new Label("                   "));
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		if(btn==btn1){
			label2.setText(btn1.getLabel());
		}else if(btn==btn2){
			label2.setText(btn2.getLabel());
		}
	}
	
	public static void main(String[] args) {
		new ActionEventEx01();
	}
}
