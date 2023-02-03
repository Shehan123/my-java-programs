public class LargestNumber{

public static void main(String args[]){

int n1 = Integer.parseInt(args[0]);
int n2 = Integer.parseInt(args[1]);
int n3 = Integer.parseInt(args[2]);

if
(n1>=n2 && n1>n3)
System.out.println("The Largest Number is n1 " +n1);

else if (n2>=n1 && n2>=n3)
System.out.println("The Largest Number is n2 " +n2);

else

System.out.println("The Largest Number is n3 "+n3);

}
}


