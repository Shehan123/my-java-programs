public class AreaOfSquare{
int a;
int b;
int area;

AreaOfSquare(int a1, int b1){
int a = a1;
int b = b1;
area = (a*b);
System.out.println(" Area of Square is " +area);
}
void display()
{
System.out.println(" Area of Square is " +area);
}
public static void main (String args[]){
AreaOfSquare a = new AreaOfSquare( 5,5);
a.display();
}
}
