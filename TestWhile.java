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
				System.out.println("���͏I��");
				test = false;
				//break;
			} else {
				System.out.println("���͂��ꂽ���e�F" + input);
			}
		}
		
		test = true;
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			if ("end".equals(input)) {
				System.out.println("���͏I��");
				test = false;
				//break;
			} else {
				System.out.println("���͂��ꂽ���e�F" + input);
			}
		} while (test);
	}
}
