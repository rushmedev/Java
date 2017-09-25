class ExamHall{
	static void conductExam(College c){
		Person p = c.getPerson();
		System.out.println(p.name);

		if (p instance of Student) {
			Student s = (Student) p;
			System.out.println(s.branch);
		}
		else if (p instanceof Faculty){
			Faculty f =(Faculty)p;
			System.out.println(f.exp);
		}
	}
}