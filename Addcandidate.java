package Com.java;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Addcandidate extends Thread {

	public void run() {
	Scanner sc=new Scanner(System.in);
	String n="yes";
	       
        	 System.out.print("Do you want to add Candidate Press yes/no:  ");
        	  n=sc.next();
        	 if(n.equals("yes")) {
        	 System.out.print("Enter New Candidate Name:");
        	 String a=sc.next();
        	 InterviewClass.ad.add(new Candidates(a));
        	 }    	
    }
}
