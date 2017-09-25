class Person{String name = "HK";}
class Student extends Person{String branch="Java";}
class Faculty extends Person{double exp = 15;}
class College{
	Person getPerson(){
		return new Person();
	}
}
class Exam extends College{
	Student getPerson(){
		return new Student();
	}
}
class Test03_WithCVR{
	public static void main(String[] args) {
		Exam e = new Exam();
		Student s =e.getPerson();
		System.out.println(s.name);
		System.out.println(s.branch); 
	}
}