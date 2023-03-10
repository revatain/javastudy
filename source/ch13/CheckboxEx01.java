package ch13;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class CheckboxEx01 extends MFrame{
	
	Checkbox cb1, cb2, cb3;
	Checkbox rb1, rb2, rb3;
	CheckboxGroup grp;
	
	public CheckboxEx01() {
		super(230, 150);
		setTitle("Checkbox Example");
		add(cb1 = new Checkbox("����1", null, false));
		add(cb2 = new Checkbox("����2", null, true));
		add(cb3 = new Checkbox("����3", null, false));
		grp = new CheckboxGroup();
		add(rb1 = new Checkbox("����1", grp, false));
		add(rb2 = new Checkbox("����2", grp, true));
		add(rb3 = new Checkbox("����3", grp, false));
	}

	public static void main(String[] args) {
		new CheckboxEx01();
	}
}