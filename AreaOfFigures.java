public class AreaOfFigures
{
float h;
float b;
float a1;  //= (h*b)/2;
AreaOfFigures(float h1, float b1){

float h = h1;
float b = b1;
a1  = (h*b)/2;
System.out.println("The Area is "  +a1);
}

void display(){
	
	System.out.println("The Area of Traingle is  "  +a1);
	}
	
	public static void main (String args[]){
	
//AreaOfFigures a = AreaOfFigures();
AreaOfFigures a1 = new AreaOfFigures( 10, 10);
a1.display();
}
}


