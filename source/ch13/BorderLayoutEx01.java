package ch13;

import java.awt.BorderLayout;
import java.awt.Button;

public class BorderLayoutEx01 extends MFrame{
	
	Button btn[];
	String str[] = {"ù��°","�ι�°","����°","�׹�°","�ټ���°"};
	
	public BorderLayoutEx01() {
		setTitle("BorderLayout Example");
		setLayout(new BorderLayout());
		btn = new Button[5];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(str[i]);
			btn[i].setBackground(MColor.rColor());
		}
		add(btn[0],"North");
		add("South",btn[1]);
		add(BorderLayout.EAST,btn[2]);
		add(btn[3],BorderLayout.WEST);
		add(btn[4]);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx01();
	}
}
