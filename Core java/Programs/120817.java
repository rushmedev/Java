class Example{
	static void m1(){
		System.out.println("Ex m1");
	}
}
class Sample extends Example{
	static void m1(){
		System.out.println("sa m1");
	}
}
class Test {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.m1();
		Example e1 = new Example();
		e1.m1();
	}
}