package Com.java;

public class CoductClass extends Thread {
    
	public void run() {
		System.out.println(InterviewClass.ad.pop().getname() +" on interview.............");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
