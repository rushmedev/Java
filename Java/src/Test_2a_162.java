class Test_2a_162 {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("In outer try");
			try {
				System.out.println("In inner try");
			} catch (NullPointerException e) {
				System.out.println("In innner catch");
			}
			finally {
				System.out.println("In inner finally");
				return 10;
			}
		} catch (NullPointerException e) {
			System.out.println("In outer catch block");
		}
		finally {
			System.out.println("In outer finally");
			return 30;
		}
	}
}
