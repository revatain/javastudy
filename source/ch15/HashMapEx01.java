package ch15;

import java.util.HashMap;

public class HashMapEx01{
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		
		hm.put("hyunji", "����̿� �Թ���..."); 
		hm.put("kyunghwa", "�豸 �ǽð� ���"); 
		hm.put("hyungjin", "���Թ�..�ʸ� ��ų������"); 
		hm.put("youngjin", "ö���� ���Ʋ"); 
		hm.put(100,559); 

		System.out.println("����id�� �˻��� ��-hm.get('hyunji') : "+hm.get("hyunji")); 
		System.out.println("������id�� �˻��� ��-hm.get('hyungjin') : "+hm.get("hyungjin"));
		System.out.println("hm.get(100) : "+hm.get(100));
	}
}