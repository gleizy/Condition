
public class TestArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		a[0] = 10;
		System.out.println("配列aの長さ=" + a.length);
		System.out.println("配列aの１つ目の要素=" + a[0]);
		
		int[] b = new int[3];
		b[0] = 5;
		b[2] = 7;
		System.out.println("配列bの長さ=" + b.length);
		System.out.println("配列bの１つ目の要素=" + b[0]);
		System.out.println("配列bの2つ目の要素=" + b[1]);
		
		String[] str = {"一", "二", "五"};
		System.out.println("配列strの長さ=" + str.length);
		System.out.println("配列strの3つ目の要素=" + str[2]);
	}

}
