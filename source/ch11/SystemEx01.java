package ch11;

public class SystemEx01 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		int arr1[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
    /*	arraycopy (Object  src, int srcPos, Object  dest, int destPos, 
        int length)
		src - ī���� �ҽ�
		srcPos - ī���� �ҽ��� ���� ��ġ, �ε���
		dest - ī�ǹ���(?) ��ü
		destPos - ī�ǹ��� ���� �ε���
		length - ī���� ����*/

		System.arraycopy(arr, 0, arr1, 0, 3);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		double start = System.currentTimeMillis();
		for(int i=0; i<1000000000; i++){}
		double end = System.currentTimeMillis ();
		System.out.println((end - start)/1000+"��"); 
		
		System.exit(0);
		System.out.println("����׽�Ʈ");
	}
}
