class A{
	static void m1(){
		int x = 10;
		System.out.println(x);
	}
	static void m2(){
		//System.out.println(x);
		//System.out.println(y);
	}
	public static void main(String[] args) {
		int y = 20;
		System.out.println(y);
		m1();
		m2();
	}
}