//insert the value in an array


import java.util.Scanner;

public class Array{

public static void main (String args[]){

//Scanner sc = new Scanner(System.in);

int a[] = new int [10];
Scanner sc = new Scanner(System.in);
System.out.println(" Enter the number" );
for (int i=0; i<10;i++){
a[i] = sc.nextInt();

}

for (int i =0; i<10;i++){

System.out.println(a[i]);
}
}

}



