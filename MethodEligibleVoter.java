public class MethodEligibleVoter{

public static void main (String args[]){
MethodEligibleVoter a = new MethodEligibleVoter ();
a.eligibilityChecking (18);
}

public void eligibilityChecking (int a){


if (a>=18){
System.out.println("Eligible for voting");
}
else{
System.out.println("Not Eligible");
}


}
}




