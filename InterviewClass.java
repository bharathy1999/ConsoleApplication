package Com.java;
import java.util.ArrayDeque;
import java.util.Scanner;



public class InterviewClass extends Thread  {
	 static ArrayDeque<Candidates> ad=new ArrayDeque();
         public void run() {
        	 System.out.println("All the best for Waiting Candidates");
        	for(Candidates a:ad) {
        		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        		System.out.println(a.getname());
        	}
         }
        
         public static void main(String args[]) {
        	 ad.add(new Candidates("Bharathy"));
        	 ad.add(new Candidates("Nassim"));
        	 ad.add(new Candidates("Solai"));
        	 CoductClass cc=new CoductClass();
        	 Addcandidate ac=new Addcandidate();
        	 InterviewClass ic=new InterviewClass();

        	 cc.start();
        	 try {
				cc.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        	 ac.start();
        	 try {
 				ac.join();
 			} catch (InterruptedException e) {
 				e.printStackTrace();
 			}
        	 ic.start();}
        
}
