class Test_2a_167 {
	public static void main(String[] args) {
		int a =10;
		try {
			int b = 20;
			System.out.println(a);
			System.out.println(b);
		} catch (ArithmeticException e) {
			a = 30;
			//b = 40;  //Can not find symbol error
		}
		System.out.println(a);
		// System.out.println(b);
	}
}
