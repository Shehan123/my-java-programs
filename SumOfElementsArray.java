import java.util.Scanner;

public class SumOfElementsArray
{

public static void main (String args[])

{

int a[] = new int[10];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array elements");
for(int i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Array elements are ");
for(int i:a)
{
System.out.println(i);
}
}
}




