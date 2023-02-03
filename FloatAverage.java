public class FloatAverage
{
float a;
float b;
float c;
float average;

FloatAverage(float a1, float b1, float c1)
{
float a = a1;
float b = b1;
float c = c1;
average = (a + b + c)/3;
System.out.println(" The Average of three float numbers are " +average);

}
void display(){
System.out.println("The Average is "  +average);
}

public static void main (String args[]){
FloatAverage avg1 = new FloatAverage(10.5f,20.5f,30.5f);
avg1.display();
}
}


