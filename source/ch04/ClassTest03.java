package ch04;

public class ClassTest03 {

	public static void main(String[] args) {
		ClassTest02 character = new ClassTest02();
		character.hand ="ũ��";
		character.leg = "���";
		character.head ="ũ��";
		character.eyes="ũ��";
		character.runSpeed="������";
		character.hasWeapon="����";
		character.height="ũ��";
		
		System.out.println("���� "+character.hand+"\n"+
				   "�ٸ��� "+character.leg+"\n"+
				   "�Ӹ��� "+character.head+"\n"+	
				   "���� "+character.eyes+"\n"+	
				   "�޸���� "+character.runSpeed+"\n"+	
				   "����� "+character.hasWeapon+"\n"+	
				   "Ű�� "+character.height+"\n"	);
	}
}