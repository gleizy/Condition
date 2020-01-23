
public class TestIf {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		if (a < b) {
			System.out.println("aよりbの値が大きい");  //1
			System.out.println("aよりbの値が大きい-2");//2
			if (a > 1) {
				System.out.println("aの値が1より大きい");
			}
		} else {
			if (a == b) {
				System.out.println("aの値がbと等しい");//3
			} else {
				System.out.println("aの値がbより大きい");  //4
			}
			System.out.println("aの値がb以上である");  //5
		}
		
		if (a > 3) {
			System.out.println("aの値が3より大きい");
		} else if (a > 2) {
			System.out.println("aの値が2より大きい");
		} else if (a > 1) {
			System.out.println("aの値が1より大きい");
		} else {
			System.out.println("aの値が1以下");
		}
		
		if (!(a > 1)) {
			System.out.println("aの値が1以下");
		}
		
		if ((!(a > 1) || b > 3) && a >= 2) {
			System.out.println("aとbはとても大きい");
		} else if (b > 3) {
			System.out.println("bはとても大きい");
		} else if (a > 1) {
			System.out.println("aはとても大きい");
		} else {
			System.out.println("aとbは小さい");
		}
		
		if ( a == 1)
			System.out.println("aの値が1と等しい");
		System.out.println("aの値が" + a);
		
		System.out.println("出力終了");
	}

}
