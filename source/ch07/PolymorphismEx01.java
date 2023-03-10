package ch07;

class Animal{
	public void move(){
		System.out.println("������! ��������!"); 
	}
}

class Bird extends Animal{
	private String name="��";
	public void move(){
		System.out.println(name + "��! ���ƶ�!");
	}
}

class Fish extends Animal{
	private String name="�����"; 
	public void move(){
		System.out.println(name + "��! ����Ķ�!");
	}
}

class Cheetah extends Animal{
	private String name="ġŸ"; 
	public void move(){
		System.out.println(name + "��! �޷���!");
	}
}

public class PolymorphismEx01 {
	static Animal[] animal;

	public static void createAnimal(int num){

		animal = new Animal[num];

		for (int i = 0; i < animal.length; i++) {

			if((i%3) == 0){
				animal[i] = new Bird();
			}else if((i%3)==1){
				animal[i] = new Fish();
			}else{
				animal[i] = new Cheetah();
			}
		}

		System.out.println(num + "������ ������ �����Ǿ����ϴ�.");
		System.out.println("----------------(1�ʽ���)------------------");

	}

	public static void moveAnimal(){

		System.out.println(animal.length + "������ ������ �̵���ŵ�ϴ�.");
		System.out.println("----------------(1�ʽ���)------------------");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < animal.length; i++) {
			animal[i].move();
		}
	}

	public static void main(String[] args) {
		createAnimal(5);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		moveAnimal();
	}
}