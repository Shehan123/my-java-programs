public class AreaOfRectSquare
{
//Area of Rectangle (l*b)
float l;
float b;
float area;
AreaOfRectSquare(float l1, float b1)
{
float l = l1;
float b = b1;
area = (l*b);
System.out.println(" The Area of a Triangle is " +area);

}
void display(){
System.out.println(" The Area of a Triangle is " +area);

}
public static void main (String args[]){
	AreaOfRectSquare arearectangle = new AreaOfRectSquare(5f,10f);
	arearectangle.display();

}
}

