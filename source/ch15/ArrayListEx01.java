package ch15;

import java.util.ArrayList;

public class ArrayListEx01{
	public static void main(String[] args) {

		ArrayList<String> list  = new ArrayList<String>();


		list.add("�Ƴ� ������");
		list.add("�̳� �迵��");
		list.add("�Ϳ��� ����ȣ");

		for(int i=0;i<list.size();i++){
			System.out.println(i+"������ �� : "+list.get(i));
		}

		list.remove(0);

		System.out.println("2���׽�Ʈ");
		for(int i=0;i<list.size();i++){
			System.out.println(i+"������ �� : "+list.get(i));
		}
	}
}