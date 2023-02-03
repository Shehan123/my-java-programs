class PrintNameReturn{
public static String ReturnName(String name){
return name;
}
public static void main(String args[]){
String name = PrintNameReturn.ReturnName("Shahan");
System.out.println("name is " +name);
}
}