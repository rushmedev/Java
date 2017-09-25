class Test{
	public static void main(String[] args) {
		Example e1 = new Example();
		e1.m1(e1.m2());
	}
}
class Example{
	void m1(int x){
		System.out.println(x);
	}
	int m2(){
		return 5;
	}
}