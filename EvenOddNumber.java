import java.util.Scanner;

public class EvenOddNumber{

public static void main(String args[]){

Scanner reader = new Scanner(System.in);

System.out.print (" Enter a number ");

int num = reader.nextInt();

if (num % 2 ==0)

{

System.out.println( " This is an even number " +num);

}
else{

System.out.println( " This is an odd number " +num);

}
}
}






