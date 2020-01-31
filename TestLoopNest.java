
public class TestLoopNest {

	public static void main(String[] args) {
		
		int[][] array = {{1, 2, 3, 10}, {4, 5, 6, 5}, {7, 8, 9, 2}};
		//array[0] = //{1, 2, 3}
		//array[1] = //{4, 5, 6}
		//array[2] = //{7, 8, 9}
		//array[0][1] = 2
		//System.out.println("array[0][1]=" + array[0][1]);
		
		int[] one = {1, 3, 5, 8};
		
		for (int i = 0; i < one.length; i++) {
			System.out.println("one[" + i + "]=" + one[i]);
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("array[" + i + "][" + j + "]=" + array[i][j]);
			}
		}

	}

}
