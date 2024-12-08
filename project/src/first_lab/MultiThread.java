package first_lab;


class MyWorkout extends Thread {
    public void run() {
    	int weight = 5;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Lift " + weight + "kg");
            weight += 2;
            try {
                Thread.sleep(2000);  
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyGym extends Thread{
	public void run() {
		int weight = 7;
		for(int i=1;i<=5;i++) {
			System.out.println("Then lift " + weight+ "kg");
			weight += 2;
			try {
                Thread.sleep(2000);  
            } catch (InterruptedException e) {
                System.out.println(e);
            }
		}
	}
}

public class MultiThread {

	public static void main(String[] args) {
		 MyWorkout ex1 = new MyWorkout();
	     MyGym ex2 = new MyGym();
	     ex1.start();
	     try{
	    	 Thread.sleep(1000);
	     }catch(Exception ex) {
	    	 
	     }
	     ex2.start(); 
	}
}
