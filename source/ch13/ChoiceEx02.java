package ch13;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx02 extends MFrame implements ItemListener{
	
	Choice air, city;
	String sair[] = {"�����װ�","�ƽþƳ�","����λ�"};
	String scity[] = {"�� ��","�� ��","�� ��","�� ��","���ֵ�"};
	Label label;
	
	public ChoiceEx02() {
		super(300, 250);
		setTitle("Choice Example");
		air = new Choice();
		city = new Choice();
		for (int i = 0; i < sair.length; i++) {
			air.add(sair[i]);
		}
		for (int i = 0; i < scity.length; i++) {
			city.add(scity[i]);
		}
		add(air);
		add(city);
		add(label = new Label("�װ���� ���ø� �����ϼ���."));
		air.addItemListener(this);
		city.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		String msg = "�װ��� ���� : " + air.getSelectedItem();
		g.drawString(msg, 30, 120);
		g.setColor(Color.RED);
		msg = "���� ���� : " + city.getSelectedItem();
		g.drawString(msg, 30, 150);
	}
	
	public static void main(String[] args) {
		new ChoiceEx02();
	}
}