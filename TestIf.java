
public class TestIf {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		if (a < b) {
			System.out.println("a���b�̒l���傫��");  //1
			System.out.println("a���b�̒l���傫��-2");//2
			if (a > 1) {
				System.out.println("a�̒l��1���傫��");
			}
		} else {
			if (a == b) {
				System.out.println("a�̒l��b�Ɠ�����");//3
			} else {
				System.out.println("a�̒l��b���傫��");  //4
			}
			System.out.println("a�̒l��b�ȏ�ł���");  //5
		}
		
		if (a > 3) {
			System.out.println("a�̒l��3���傫��");
		} else if (a > 2) {
			System.out.println("a�̒l��2���傫��");
		} else if (a > 1) {
			System.out.println("a�̒l��1���傫��");
		} else {
			System.out.println("a�̒l��1�ȉ�");
		}
		
		if (!(a > 1)) {
			System.out.println("a�̒l��1�ȉ�");
		}
		
		if ((!(a > 1) || b > 3) && a >= 2) {
			System.out.println("a��b�͂ƂĂ��傫��");
		} else if (b > 3) {
			System.out.println("b�͂ƂĂ��傫��");
		} else if (a > 1) {
			System.out.println("a�͂ƂĂ��傫��");
		} else {
			System.out.println("a��b�͏�����");
		}
		
		if ( a == 1)
			System.out.println("a�̒l��1�Ɠ�����");
		System.out.println("a�̒l��" + a);
		
		System.out.println("�o�͏I��");
	}

}
