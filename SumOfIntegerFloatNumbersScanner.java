import java.util.Scanner;

public class SumOfIntegerFloatNumbersScanner{

public static void main (String args[]){

Scanner sc=new Scanner(System.in);

int x;
float y;
System.out.println("Enter the first number");
x = sc.nextInt();
System.out.println("Enter the second number");
y = sc.nextFloat();
 
float sum = x + y;
System.out.println("Sum is " +sum);

}
}



