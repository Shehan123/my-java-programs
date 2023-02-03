public class EmpDetails
{
int id;
String name;
String department;

EmpDetails()
{

System.out.println("This is default constructor");
}
EmpDetails(int id1, String name1, String dept1){




id = id1;
name = name1;
department = dept1;
}
void display(){
System.out.println ("Name is" + name);
System.out.println ("ID is" + id);
System.out.println ("Department is" + department);
}
public static void main (String args[])
{
EmpDetails e1 = new EmpDetails();

EmpDetails e2 = new EmpDetails(101,"Shahan","QA");
e2.display();
EmpDetails e3 = new EmpDetails(102, "Shaanu", "QA");
e3.display();

}
}
