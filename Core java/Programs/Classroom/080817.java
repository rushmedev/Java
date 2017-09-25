class Example{
	int a = 10;
	//a = 20;					//Variable assignment not allowed inside a class
	//System.out.println(a);	//Print statement not allowed inside a class 
	//if(a==10){				//for loop not allowed inside a class
		//int b = 20;			
	//}
	//m1();						//Method calling not allowed inside a class
	static void m1(){
		System.out.println("Hello");
	}
}