package ch15;

import java.util.Vector;

public class VectorEx02 {
	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();

		vc.add("������"); 
		vc.add("�迵��"); 
		vc.add("����ȣ"); 
		vc.add("����"); 
		vc.add("������"); 

		System.out.println(vc.size()); 
		vc.remove(1); 
		vc.remove("����"); 
		System.out.println(vc.size()); 

		for (int i = 0; i < vc.size(); i++) { 
			System.out.println(vc.get(i)); 
		}
		if(vc.contains("������")){ 
			int idx = vc.indexOf("������");
			System.out.println(idx); 
		}else{ 
			System.out.println("�ش� ��Ұ� ����."); 
		}
		vc.removeAllElements();
		if(vc.isEmpty()){
			System.out.println("��Ұ� ����."); 
		}
	}
}