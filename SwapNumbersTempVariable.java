

public class SwapNumbersTempVariable{

public static void main (String args[]){

float firstnumber = Float.parseFloat(args[0]);
float secondnumber = Float.parseFloat(args[1]);


System.out.println(" Before Swap");
System.out.println(" First Number is = " +firstnumber);
System.out.println(" Second Number is = " +secondnumber);

float temporary = firstnumber;

firstnumber = secondnumber;

secondnumber = temporary;

System.out.println(" After Swap");
System.out.println(" First Number is ="  +firstnumber);
System.out.println(" Second Number is ="  +secondnumber);

}
}





