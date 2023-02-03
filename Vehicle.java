public class Vehicle{

String volkswagon;
String Porsche;

Vehicle(String volkswagon,String Porsche){

this.volkswagon = volkswagon;
this.porsche = porsche;
this.display();
}

void display(){

System.out.println("Vehicle Name is" +volkswagon);
System.out.println("Vehicle Name is" +Porsche);
}

public static void main (String args[]){

Vehicle v1 = new Vehicle("volkswagon", "Porsche");
}

}