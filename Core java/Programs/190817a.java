class Example{
	static int a = 10;
	int x = 20;
	static int geta(){
		return a;
	}
	int getx(){
		return x;
	}
	int[] getaandx(){
		return new int[]{a,x};
	}
	static student getStudent(){
		System.out.println("Student object created");
		return new student();
	}
	static student[] getStudents(){
		return new student[]{
			new student() , new student()
		};
	}
}
class student{
	int sno;
	String sname;
	String course;
	double fee;
}
class test{
	public static void main(String[] args) {
		Example e1 =new Example();
		int i1 = e1.geta();
		System.out.println("geta() returned values :"+i1);
		int i2 = e1.getx();
		System.out.println("getx() returned values"+i2);
		int[] ia = e1.getaandx();
		System.out.println("getx() and geta() returned values"+ia);
		System.out.println("values returned in array"+ia[0]+ia[1]);
	}
}