public class IntegerAverage{

int a;
int b;
int c;
int average;
IntegerAverage(int a1,int a2, int a3) 
{
int a = a1;
int b = a2;
int c = a3;

	average = (a + b + c)/3;
System.out.println("The Average is "  +average);
}
void display(){
	
	System.out.println("The Average is "  +average);
}

public static void main (String args[]){
	//IntegerAverage avg = new IntegerAverage();
	IntegerAverage avg1 = new IntegerAverage( 10, 10, 10);
	avg1.display();
}
}

	