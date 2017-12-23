class Test_2a_163 {
	public static void main(String[] args) {
		m1();
	}
	static void m1() {
		try {
			System.out.println("In outer try");
			try {
				System.out.println("In inner try");
				System.out.println(10/0);
			} catch (NullPointerException e) {
				System.out.println("In inner catch");
			}
			finally {
				System.out.println("In inner finally");
			}
			System.out.println("After inner try/catch/finally");
		} catch (NullPointerException e) {
			System.out.println("In outer catch");
		}
		finally {
			System.out.println("In outer finally");
		}
		System.out.println("After outer try/catch/finally");
	}
}
