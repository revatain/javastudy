package ch11;

class Point01{
	
}

public class ObjectEx01 {
	public static void main(String[] args) {
		Point01 p = new Point01();
		System.out.println("Ŭ�����̸� : " + p.getClass());
		System.out.println("�ؽ��ڵ� : " + p.hashCode());
		System.out.println("��ü���ڿ� : " + p.toString());
		System.out.println("=======================");
		Point01 p1 = new Point01();
		System.out.println("Ŭ�����̸� : " + p1.getClass());
		System.out.println("�ؽ��ڵ� : " + p1.hashCode());
		System.out.println("��ü���ڿ� : " + p1.toString());
		String s = new String("����");
		System.out.println(s.toString());//�������̵�
	}
}