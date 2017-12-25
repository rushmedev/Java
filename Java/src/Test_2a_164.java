public class Test_2a_164 {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("In outer try");
			try {
				System.out.println("In inner try");
				System.out.println(10/0);
			} catch (NullPointerException e) {
				System.out.println("In inner catch");
			}
		} catch (NullPointerException e) {
			System.out.println("In outer catch");
			return 20;
		}
		finally {
			System.out.println("In outer finally");
		}
		System.out.println("After outer try catch and finally");
		return 30;
	}
}
