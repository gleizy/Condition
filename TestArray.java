
public class TestArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		a[0] = 10;
		System.out.println("”z—ña‚Ì’·‚³=" + a.length);
		System.out.println("”z—ña‚Ì‚P‚Â–Ú‚Ì—v‘f=" + a[0]);
		
		int[] b = new int[3];
		b[0] = 5;
		b[2] = 7;
		System.out.println("”z—ñb‚Ì’·‚³=" + b.length);
		System.out.println("”z—ñb‚Ì‚P‚Â–Ú‚Ì—v‘f=" + b[0]);
		System.out.println("”z—ñb‚Ì2‚Â–Ú‚Ì—v‘f=" + b[1]);
		
		String[] str = {"ˆê", "“ñ", "ŒÜ"};
		System.out.println("”z—ñstr‚Ì’·‚³=" + str.length);
		System.out.println("”z—ñstr‚Ì3‚Â–Ú‚Ì—v‘f=" + str[2]);
	}

}
