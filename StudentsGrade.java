import java.util.Scanner;

public class StudentsGrade{

public static void main (String args[]){

Scanner sc = new Scanner(System.in);

System.out.println(" Enter the Percentage of Marks " );

int percentage = sc.nextInt();



if
(percentage <40){

System.out.println(" Sorry you are not passed..best luck next time " +percentage);

}
else if 

(percentage >60 && percentage <=70){


System.out.println(" You are passed with C grade" +percentage);

}
else if 
(percentage >70 && percentage <=80){

System.out.println(" You are passed with B grade" +percentage);
}

else if 
(percentage >80 && percentage <=100){

System.out.println("You are passed with A grade" +percentage);
}
else {


System.out.println("Failed");

}

}
}
