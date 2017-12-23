public class Test_2a_158b {
	static int m1() {
		System.out.println("m1 started");
		int i = 0;
		while (++i<=5) {
			System.out.println("while start i "+i);
			try {
				System.out.println("In try "+i);
				return 10;
			} finally {
				System.out.println("In finally "+i);
				System.out.println("Break is executed ");
				continue;
			}
		}
		System.out.println("After while loop");
		System.out.println("m1 end");
		return 20;
	}
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("Result :"+m1());
		System.out.println("main end");
	}
}
