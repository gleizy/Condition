
public class TestSwitch {

	public static void main(String[] args) {
		int a = 3;
		
		switch (a) {
			case 1:
				System.out.println("aの値が1");
				break;
			case 2:
				System.out.println("aの値が2");
				break;
			case 3:
				System.out.println("aの値が3");
				break;
			case 4:
				System.out.println("aの値が4");
				break;
			default:
				System.out.println("aの値=" + a);
		}
	}

}
