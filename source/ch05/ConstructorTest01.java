package ch05;

public class ConstructorTest01 {
	public static void main(String[] args) {
		//CstTest01 ct = new CstTest01(); //����
		CstTest01 ct = new CstTest01("����ȣ","01022227X6X");
		ct.use();
	}
}

class CstTest01 {

	String name;
	String number;

	public CstTest01(String name, String number) {
		this.name = name;
		this.number = number;
	}
	void use(){
		System.out.println("�̸��� "+name+"\n"+"��ȭ��ȣ�� "+number);
	}
}