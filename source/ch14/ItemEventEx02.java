package ch14;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventEx02 extends MFrame implements ItemListener{
	
	Choice air, city;
	String sair[] = {"대한항공", "아시아나", "에어부산"};
	String scity[] = {"서 울", "대 전", "대 구", "부 산", "제주도"};
	TextArea ta;
	
	public ItemEventEx02() {
		super(300, 200);
		setTitle("Item Example");
		Panel p = new Panel();
		air = new Choice();
		city = new Choice();
		for (int i = 0; i < sair.length; i++) {
			air.add(sair[i]);
		}
		for (int i = 0; i < scity.length; i++) {
			city.add(scity[i]);
		}
		p.add(air);
		p.add(city);
		add(p,BorderLayout.NORTH);
		add(ta = new TextArea());
		city.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==city){
			String str = "선택하신 항공사 : ";
			str+=air.getSelectedItem();
			str+="\n선택한 도시 : ";
			str+=city.getSelectedItem();
			ta.setText(str);
		}
	}
	
	public static void main(String[] args) {
		new ItemEventEx02();
	}
}
