
public class TestFor {

	public static void main(String[] args) {
		
		int[] balance = {10000, 50000, 1000000, 3000, 500000, 60};
		
		for (int i = 0; i < balance.length; i=i+1) {
			System.out.println((i + 1) + "�ڂ̃��[�U�̎c��=" + balance[i]);
		}
		
//		for (int i = 0; i < balance.length; i=i+1) {
//			if (balance[i] >= 100000) {
//				System.out.println((i + 1) + "�ڂ̃��[�U�͋������ł��B");
//				System.out.println((i + 1) + "�ڂ̃��[�U�̎c��=" + balance[i]);
//			}	
//		}
		
		for (int i = 0; i < balance.length; i=i+1) {
			if (balance[i] >= 100000) {
				System.out.println((i + 1) + "�ڂ̃��[�U�͋������ł��B");
				System.out.println((i + 1) + "�ڂ̃��[�U�̎c��=" + balance[i]);
				break;
			}	
		}
		
		int position = -1;
		int maxMoney = -1;
		for (int i = 0; i < balance.length; i=i+1) {
			if (balance[i] > maxMoney) {
				position = i;
				maxMoney = balance[i];
			}
		}
		System.out.println((position + 1) + "�ڂ̃��[�U�͈�Ԃ̋������ł��B");
		System.out.println("���[�U�̎c��=" + maxMoney);
	}

}
