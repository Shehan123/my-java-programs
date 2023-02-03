public class Fruits
{

String name;
String colour;

Fruits() {

System.out.println ("Below will describe the colour and name of fruits");
}

Fruits(String name1, String colour1){
	name = name1;
	colour = colour1;
}
	

void display(){
	
	System.out.println("The Fruit Name is "  +name);
	System.out.println("The colour is "   +colour);
}



public static void main (String args[]){
	
Fruits f = new Fruits();
Fruits f1 = new Fruits("Apple", "Red");
f1.display();
Fruits f2 = new Fruits("Guava", "Green");
f2.display();
}
}
