class A{
	int x = 10;
	static void m1(){
		//System.out.println(x); //C.E CFS
		A a1 = new A();
		System.out.println(a1.x);
	}
	static void m2(){
		//x = 20;
		A a1 = new A();
		a1.x = 20;
	}
}
class Test {
	public static void main(String[] args) {
		A a1 = new A();
		a1.x = 30;
		System.out.println(a1.x);
		a1.m1();
		a1.m2();
		System.out.println(a1.x);
		a1.m1();
	}
}