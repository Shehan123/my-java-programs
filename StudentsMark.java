
class StudentsMark{
	//public static void main(String args[]){
	
	
	int subject1;
	int subject2;
	int subject3;
	int percentage;
	
StudentsMark(int a, int b, int c){
	System.out.println("Grades of Students");
	



	 subject1 = a;
	 subject2 = b;
	 subject3 = c;
	 percentage = (subject1+subject2+subject3)/3;
	
		if(percentage>=80){
			System.out.println("Passed with A Grade");
		}
		else if(percentage>=50 && percentage<80){
		System.out.println("Passed with B Grade");
	}
	else if(percentage>=30 && percentage<50){
	System.out.println("Passed with C Grade");
}
else{
	System.out.println("Failed!!");
}
}

void display(){
	System.out.println("The Grades of Student is  "  +percentage);
}

}

public static void main(String args[]){
StudentsMark s1 = new StudentsMark(10,50,10);
//StudentsMark.s2 = new StudentsMark(10,50,10);
//StudentsMark.s3 = new StudentsMark (10,10,10);
s1.display();
}

//s2.display();
//s3.display();





	