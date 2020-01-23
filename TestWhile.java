import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestWhile {
	public static void main(String[] args) throws IOException {
		boolean test = true;
		while(test) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			if ("end".equals(input)) {
				System.out.println("入力終了");
				test = false;
				//break;
			} else {
				System.out.println("入力された内容：" + input);
			}
		}
		
		test = true;
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			if ("end".equals(input)) {
				System.out.println("入力終了");
				test = false;
				//break;
			} else {
				System.out.println("入力された内容：" + input);
			}
		} while (test);
	}
}
