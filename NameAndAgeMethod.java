public class NameAndAgeMethod{

public static void main(String args[]){
NameAndAgeMethod a = new NameAndAgeMethod (); //--object creation
String name = args[0];
int age = Integer.parseInt(args[1]);
a.nameAndAgeMethod ( name, age); //calling the function
}

public void nameAndAgeMethod(String name, int age){

System.out.println( "Name is " +name + ", Age is" +age);
}
}










