class Test_2a_157c {
	@SuppressWarnings("finally")
	static int m1() {
		System.out.println("m1 start");
		int i = 0;
		while (++i<=5) {
			System.out.println("While start i "+i);
			try {
				System.out.println("In try"+i);
				return 10;
			} finally {
				System.out.println("In finally"+i);
				System.out.println("Break is executed");
				break;
			}
		}
		System.out.println("After while loop");
		System.out.println("m1 end");
		return 20;
	}
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("Result:"+m1());
		System.out.println("main end");
	}
}
