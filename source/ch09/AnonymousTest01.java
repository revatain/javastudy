package ch09;

interface MyInter{
	void prn();
}

public class AnonymousTest01 {
	public static void main(String[] args) {
		new MyInter() {
			@Override
			public void prn() {
				System.out.println("��ü ����� ���ÿ� ������ �ϰ� �޼ҵ带 �����մϴ�.");
			}
		}.prn();
	}
}