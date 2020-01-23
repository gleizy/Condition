
public class TestFor {

	public static void main(String[] args) {
		
		int[] balance = {10000, 50000, 1000000, 3000, 500000, 60};
		
		for (int i = 0; i < balance.length; i=i+1) {
			System.out.println((i + 1) + "つ目のユーザの残高=" + balance[i]);
		}
		
//		for (int i = 0; i < balance.length; i=i+1) {
//			if (balance[i] >= 100000) {
//				System.out.println((i + 1) + "つ目のユーザは金持ちです。");
//				System.out.println((i + 1) + "つ目のユーザの残高=" + balance[i]);
//			}	
//		}
		
		for (int i = 0; i < balance.length; i=i+1) {
			if (balance[i] >= 100000) {
				System.out.println((i + 1) + "つ目のユーザは金持ちです。");
				System.out.println((i + 1) + "つ目のユーザの残高=" + balance[i]);
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
		System.out.println((position + 1) + "つ目のユーザは一番の金持ちです。");
		System.out.println("ユーザの残高=" + maxMoney);
	}

}
