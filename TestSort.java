
public class TestSort {

	public static void main(String[] args) {
		
		int[] array = {2, 4, 5, 1, 3};
		
		for (int i = 0; i < array.length - 1; i++) {
			int position = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[position]) {
					position = j;
				}
			}
			
			//２つの配列の要素を入れ替える。
			int temp = array[i];
			array[i] = array[position];
			array[position] = temp;
			
			System.out.println("第" + (i + 1) + "回のソート結果：");
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j]);
			}
			System.out.println("");
		}		
	}

}
