
public class TestArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		a[0] = 10;
		System.out.println("�z��a�̒���=" + a.length);
		System.out.println("�z��a�̂P�ڂ̗v�f=" + a[0]);
		
		int[] b = new int[3];
		b[0] = 5;
		b[2] = 7;
		System.out.println("�z��b�̒���=" + b.length);
		System.out.println("�z��b�̂P�ڂ̗v�f=" + b[0]);
		System.out.println("�z��b��2�ڂ̗v�f=" + b[1]);
		
		String[] str = {"��", "��", "��"};
		System.out.println("�z��str�̒���=" + str.length);
		System.out.println("�z��str��3�ڂ̗v�f=" + str[2]);
	}

}
