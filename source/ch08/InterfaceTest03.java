package ch08;

//Tv ������
public class InterfaceTest03 implements InterfaceTest01, InterfaceTest02,Runnable{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub.
		System.out.println("Aȸ�翡�� ����ϴ� �޼ҵ� -TV�� �� ���� turnOn");
	}

	@Override
	public void lightOn() {
		// TODO Auto-generated method stub
		System.out.println("Bȸ�翡�� ����ϴ� �޼ҵ� -TV�� �� ���� lightOn");
	}

	public static void main(String args[]){
		InterfaceTest03 it03 = new InterfaceTest03();
		
		/*�츮������ Tv�� �δ밡 �ִ�. Aȸ��� Bȸ�� ��ǰ �׷��� �������� �� �� �ΰ��̴�. 
		�������� ���� ��, �� ȸ�� ��ǰ�� �°� interface�� �����ϰ� �������̵� �Ͽ���.
		�׷��� turnOn() �޼ҵ带 ���� �������� lightOn() �޼ҵ带 ���� �������� �ִ�. */
		
		//Aȸ�� �������� ���
		it03.turnOn();
		//Bȸ�� �������� ���
		it03.lightOn();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
