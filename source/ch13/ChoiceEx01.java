package ch13;

import java.awt.Choice;

public class ChoiceEx01 extends MFrame {
	
	String city[] = {"���ø� �����ϼ���.","������","�� ��",
			"�Ͽ���","�� ��","�� ��","�� ��"};
	Choice ch;
	
	public ChoiceEx01() {
		super(300, 200);
		setTitle("Choice Example");
		ch = new Choice();
		for (int i = 0; i < city.length; i++) {
			ch.add(city[i]);
		}
		add(ch);
	}

	public static void main(String[] args) {
		new ChoiceEx01();
	}
}