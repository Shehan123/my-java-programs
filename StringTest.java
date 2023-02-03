public class StringTest{

public static void main (String args[])
{
String s1 = "Hello";
String s2 = new String("Hello Java");
char ch[] = {'w','e','l','c','o','m','e'};
String s3 = new String(ch);

System.out.println (s1);
System.out.println(s2);
System.out.println(ch);
System.out.println(s1.length());
System.out.println(s1.charAt(1));
System.out.println(s2.toUpperCase ());
System.out.println(s1.toLowerCase ());
System.out.println(s1.substring(3));
System.out.println(s1.contains("welcome"));

StringBuffer s4 = new StringBuffer("java");
System.out.println(s4);

}
}
