package ch03;
public class WhileTest01 {
	public static void main(String[] args) {
		int destination = 11271; //11271���� �Ÿ��� �������� �ֽ��ϴ�. 
		int speed=3; //����� �ڵ����� �ʴ� 3���͸� �޸��ϴ�.
		int car=0;
		//����� �ڵ����� �󸶸��� �������� �����ϴ��� �˾ƺ��ô�.
		int i = 1;
		while (destination!=car){ //desticantion�� car�� ���� ������ ��� ����
			car = car + speed;
			i++;
		} //while���� �ѹ� ���� ���� 3�ʰ� ������ ���Դϴ�. 20�� ���� 1���� ��������?
		System.out.println(i+"��"); //3758�� while���� �����߽��ϴ�. ������ ȯ���� ���ڽ��ϴ�.
		int min = i/20;
		System.out.println(min+"��"); //187���� �ɷȳ׿�. �ð����� ȯ���غ��ڽ��ϴ�.
		int hour = min/60; 
		System.out.println(hour+"�ð�"); //7���� ��µ��� �ʾҳ׿�.int�� �������̶� �Ҽ����� ������ �ʽ��ϴ�.
		
		//7���� ����غ��ڽ��ϴ�.
		double time = min;
		System.out.println(time/60+"�ð�"); //�Ҽ������� ����ص� ���ϴ� ���� ������ �ʽ��ϴ�.
		
		//�ڹٿ����� �������� ���ϴ� �����ڰ� �ֽ��ϴ�. �ٷ� % �Դϴ�.
		int real_min = min%60;
		System.out.println(real_min+"��"); //���� ���߽��ϴ�. 
		//�׷� �Ʊ� ���ߴ� �ð� hour�� �̿��Ͽ� ����ϰ� ����� ���ڽ��ϴ�.
		
		System.out.println(hour+"�ð�"+real_min+"��"); //�ϼ��Դϴ�.
	}
}