package ch11;

class Point02{
	int x, y;
	public Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString(){
		String str;
		str = "(" + x + ", " + y +")";
		return str;
	}
}

public class ObjectEx02 {
	public static void main(String[] args) {
		Point02 p = new Point02(10, 20);
		System.out.println(p.toString());
	}
}
