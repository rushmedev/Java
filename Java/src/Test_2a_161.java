class Test_2a_161 {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("In outer try");
			try {
				System.out.println("In inner try");
			} catch (NullPointerException e) {
				System.out.println("In inner catch");
			}
			finally {
				System.out.println("In inner finally");
			}
		} catch (NullPointerException e) {
			System.out.println("In outer catch block");
		}
		finally {
			System.out.println("In outer finally");
		}
		System.out.println("After outer try/catch/finally");
		return 30;
	}
}
