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
class Invigilation extends College{
	Faculty getPerson(){
		return new Faculty();
	}
}