class StudentsDetails{


String name;
int id;
String collegeName;


StudentsDetails(String name,int id,String collegeName){

this.name = name;
this.id = id;
this.collegeName = collegeName;
this.display();

}

void display(){

System.out.println("Name is" +name);
System.out.println("Student ID is" +id);
System.out.println("CollegeName is" +collegeName);


}

public static void main (String args[]){

StudentsDetails s1 = new StudentsDetails("Shahan",37,"MSM");
StudentsDetails s2 = new StudentsDetails("Shanu",37,"T JOHN");
}
}





